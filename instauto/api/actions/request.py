import os
import uuid

import orjson
import requests
import time

import urllib.parse
import logging

from typing import Dict, Callable, Union, Optional, Any

from requests import Response

from instauto.api.actions.stub import StubMixin
from instauto.api.structs import DeviceProfile, IGProfile, State, Method
from instauto.api.constants import API_BASE_URL
from instauto.api.exceptions import IncorrectLoginDetails, InvalidUserId, BadResponse, AuthorizationError

logger = logging.getLogger(__name__)
logging.captureWarnings(True)


class RequestMixin(StubMixin):
    def _request(
        self, endpoint: str, method: Method, query: Optional[dict] = None,
        body: Optional[Union[dict, list, bytes]] = None, headers: Optional[Dict[str, str]] = None,
        add_default_headers: Optional[bool] = None, sign_request: Optional[bool] = None
    ) -> requests.Response:
        query = query or {}
        body = body or {}
        add_default_headers = add_default_headers or True
        headers = headers or {}
        sign_request = sign_request or False
        # pyre-ignore[6]
        self._request_preflight_check(method, endpoint, body, sign_request)

        url = self._prepare_url(endpoint, query)
        headers = self._build_headers(add_default_headers, headers, method)
        body = self._build_body(body, sign_request)

        try:
            if method == Method.POST:
                resp = self._session.post(url, body, headers=headers)
            elif method == Method.GET:
                resp = self._session.get(url, headers=headers)
            else:
                raise ValueError("Request method should be POST or GET")
        except ValueError as e:
            raise e
        except ConnectionError:
            raise Exception("Request aborted. Instagram has probably blocked your fingerprint.")
        except Exception as e:  # todo: narrow down
            logger.exception(f"Exception while sending request to {url} with data: \n {body}")
            raise e

        self._check_response_for_errors(resp)
        for func in self._request_finished_callbacks:
            func(resp.headers)
        return resp

    def _build_body(self, data: Optional[Union[dict, list, bytes]], sign_request):
        if sign_request:
            # pyre-ignore[6]
            as_json = self._json_dumps(data)
            data = {
                'ig_sig_key_version': self.ig_profile.signature_key_version,
                'signed_body': f'SIGNATURE.{as_json}'
            }
        return data

    def _check_response_for_errors(self, resp: requests.Response) -> None:
        if resp.ok:
            return

        try:
            # pyre-ignore[9]: assume the response is a dictionary
            parsed: Dict[Any, Any] = self._json_loads(resp.text)
        except orjson.JSONDecodeError:
            if resp.status_code == 404 and '/friendships/' in resp.url:
                raise InvalidUserId(f"account id: {resp.url.split('/')[-2]} is not recognized "
                                    f"by Instagram or you do not have a relation with this account.")

            logger.exception(f"response received: \n{resp.text}\nurl: {resp.url}\nstatus code: {resp.status_code}")
            raise BadResponse("Received a non-200 response from Instagram")

        message = parsed.get('message')
        error_type = parsed.get('error_type')
        two_factor_required = parsed.get('two_factor_required', False)

        if two_factor_required:
            return self._handle_2fa(parsed)
        if error_type == 'bad_password':
            raise IncorrectLoginDetails("Instagram does not recognize the provided login details")
        if message in ("checkpoint_required", "challenge_required"):
            if self._handle_checkpoint(resp):
                return
        if message == 'feedback_required':
            self._handle_feedback_required(parsed)
        if message == 'rate_limit_error':
            raise TimeoutError("Calm down. Please try again in a few minutes.")
        if message == 'Not authorized to view user':
            raise AuthorizationError("This is a private user, which you do not follow.")
        raise BadResponse("Received a non-200 response from Instagram")

    def _handle_checkpoint(self, resp: Response) -> bool:
        if not hasattr(self, '_handle_challenge'):
            raise BadResponse("Challenge required. ChallengeMixin is not mixed in.")
        return self._handle_challenge(resp)

    def _handle_feedback_required(self, parsed: dict) -> None:
        if os.environ.get("ENABLE_INSTAUTO_USAGE_METRICS", True):
            # This logs which actions cause limitations on Instagram accounts.
            # I use this data to focus my development on area's where it's most needed.
            requests.post('https://instauto.rooy.dev/feedback_required', data={
                'feedback_url': parsed.get('feedback_url'),
                'category': parsed.get('category')
            })
        raise BadResponse("Something unexpected happened. Please check the IG app.")

    def _request_preflight_check(self,
                                 method: Method,
                                 endpoint: str,
                                 data: Optional[Union[dict, bytes]],
                                 sign_request: bool
                                 ) -> None:
        if method == Method.GET:
            assert not data
        assert not endpoint.startswith('/')
        if sign_request:
            assert not isinstance(data, bytes)

    def _prepare_url(self, endpoint: str, query: dict) -> str:
        url = API_BASE_URL.format(endpoint) if 'https://' not in endpoint else endpoint
        if query:
            url += f"?{urllib.parse.urlencode(query)}"
        return url

    def _build_headers(self, add_default_headers: bool, headers, method):
        if add_default_headers:
            h = self._build_default_headers()
            h.update(headers)
            headers = h
        if method == Method.POST:
            headers['Content-Type'] = 'application/x-www-form-urlencoded; charset=UTF-8'
        return headers

    def _build_user_agent(self) -> str:
        """Builds a user agent, making use from all required values in `self.ig_profile`, `self.device_profile` and
        `self.state`.
        Returns
        -------
        s : str
            The user agent
        """
        s = f"Instagram {self.ig_profile.version} Android ({self.device_profile.android_sdk_version}/" \
            f"{self.device_profile.android_release}; {self.device_profile.dpi}dpi;" \
            f" {self.device_profile.resolution[0]}x{self.device_profile.resolution[1]}; " \
            f"{self.device_profile.manufacturer}; {self.device_profile.device}; {self.device_profile.device};" \
            f" {self.device_profile.chipset}; {self.state.app_locale}; {self.ig_profile.build_number})"
        return s

    def _build_default_headers(self) -> Dict[str, str]:
        """Builds a dictionary that contains all header values required for all other requests sent.
        Returns
        -------
        d : dict:
            Dictionary containing the mappings
        """
        return {
            'x-cm-bandwidth-kbps': '-1.000',
            'x-cm-latency': '-1.000',
            'x-ads-opt-out': str(int(self.state.ads_opt_out)),
            'x-ig-app-locale': self.state.app_locale,
            'x-ig-app-startup-country': self.state.startup_country,
            'x-ig-device-locale': self.state.device_locale,
            'x-ig-mapped-locale': self.state.device_locale,
            'x-ig-connection-speed': self.state.connection_speed,
            'x-ig-bandwidth-speed-kbps': self.state.bandwidth_speed_kbps,
            'x-ig-bandwidth-totalbytes-b': self.state.bandwidth_totalbytes_b,
            'x-ig-bandwidth-totaltime-ms': self.state.bandwidth_totaltime_ms,
            'x-ig-www-claim': self.state.www_claim,
            'x-ig-device-id': self.state.device_id,
            'x-ig-android-id': self.state.android_id,
            'x-ig-connection-type': self.state.connection_type,
            'x-ig-capabilities': self.ig_profile.capabilities,
            'x-ig-app-id': self.ig_profile.id,
            'user-agent': self._user_agent,
            'accept-language': self.state.accept_language,
            'x-mid': self.state.mid,
            'ig-u-rur': self.state.rur,
            'accept-encoding': self.state.accept_encoding,
            'x-fb-http-engine': self.ig_profile.http_engine,
            'authorization': self.state.authorization,
            'connection': 'close',
            'x-pigeon-session-id': self.state.pigeon_session_id,
            'x-pigeon-rawclienttime': str(round(time.time(), 3)),
            'x-bloks-version-id': self.state.bloks_version_id,
            'x-bloks-is-layout-rtl': self.state.bloks_is_layout_rtl,
            'host': 'i.instagram.com'
        }

    def _update_state_from_headers(self, headers: Dict[str, str]) -> None:
        """Updates self.state with values received from ig-set-* headers.

        In most cases, the assignments are redundant, because the previous and new value are the same, but we'd rather
        be a little bit too cautious then too little. Sending back a wrong header value to Instagram would probably
        result in undefined behaviour.

        Parameters
        ----------
        headers : Dict[str, str]
            Mapping of header names to header values
        """
        www_claim = headers.get('ig-set-www-claim')
        if www_claim is not None: self.state.www_claim = www_claim

        authorization = headers.get('ig-set-authorization')
        if authorization is not None: self.state.authorization = authorization

        user_id = headers.get('ig-set-ig-u-ds-user-id')
        if user_id is not None: self.state.user_id = user_id

        direct_region_hint = headers.get('ig-set-ig-u-direct_region_hint')
        if direct_region_hint is not None: self.state.direct_region_hint = direct_region_hint

        shbid = headers.get('ig-set-ig-u-shbid')
        if shbid is not None: self.state.shbid = shbid

        shbts = headers.get('ig-set-ig-u-shbts')
        if shbts is not None: self.state.shbts = shbts

        target = headers.get('ig-set-ig-u-target')
        if target is not None: self.state.target = target

        rur = headers.get('ig-set-ig-u-rur')
        if rur is not None: self.state.rur = rur

        mid = headers.get('ig-set-x-mid')
        if mid is not None: self.state.mid = mid

        public_api_key_id = headers.get('ig-set-password-encryption-key-id')
        if public_api_key_id is not None: self.state.public_api_key_id = public_api_key_id

        public_api_key = headers.get('ig-set-password-encryption-pub-key')
        if public_api_key is not None: self.state.public_api_key = public_api_key; self._encode_password()

