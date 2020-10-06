import requests
import time
import json
import urllib.parse
import logging

from typing import Dict, Callable
from instauto.api.actions.stubs import _request

from instauto.api.structs import DeviceProfile, IGProfile, State, Method
from instauto.api.constants import API_BASE_URL
from instauto.api.exceptions import WrongMethodException, IncorrectLoginDetails, InvalidUserId, BadResponse

logger = logging.getLogger(__name__)
logging.captureWarnings(True)


class RequestMixin:
    ig_profile: IGProfile
    device_profile: DeviceProfile
    state: State
    _user_agent: str
    _encrypt_password: Callable
    _session: requests.Session
    _request_finished_callbacks: list

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
        if public_api_key is not None: self.state.public_api_key = public_api_key; self._encrypt_password()

    def _request(self, endpoint: str, method: Method, query: dict = None, data: dict = None, headers: Dict[str, str]
    = None, default_headers: bool = None, signed: bool = None) -> requests.Response:
        """Creates and sends a request to the specified endpoint.

        Parameters
        ----------
        endpoint : str
            The endpoint that the request should be send to. `endpoint` should start with a non '/' character.
            `endpoint` should end with a '/'.
        method : {Method.Post, Method.Get}
            Specifies which method to use for sending the HTTP request.
        query : dict, optional
            A dictionary that contains all key-value pairs that should be added to the final url, as a query string.
        data : dict, optional
            A dictionary that contains all key-value pairs that should be send along with a post request.
        headers : dict, optional
            A dictionary that contains all key-value pairs of the headers that should be sent along with the HTTP
            request. Header values from this argument take priority over the default headers. Default headers are
            overwritten if header values co-exist in both dict's.

        Returns
        -------
        resp : requests.Response
            The response that is returned by Instagram API.

        Other Parameters
        -------
        default_headers : bool, optional
            Defaults to True. If set to True, the default headers, `from ApiClient._build_default_headers`,
            will be included in the request. This argument is pretty much only used in the initial request,
            where we don't want to send headers, which we shouldn't know about at that point.

        Raises
        -------
        WrongMethodException
            When the `data` argument is provided, but the `method` argument is set to `Method.GET`. POST data cannot
            be send along with GET requests. It is most likely that it either was mistaken for the `query` argument,
            or that the method should be set to POST.
        """
        if query is None: query = {}
        if data is None: data = {}
        if default_headers is None: default_headers = True
        if headers is None: headers = {}
        if signed is None: signed = False

        if endpoint.startswith('/'):
            logger.warning("Are you sure that the endpoint starts with a slash?")

        # This isn't the cleanest, but it works. This makes sure we can just pass in the full url for endpoints that
        # do not start with /api/v1 (pretty much only for uploading pictures/videos), without adding an extra boolean
        # or method to the function/class.
        if 'https://' not in endpoint:
            url = API_BASE_URL.format(endpoint)
        else:
            url = endpoint

        if query:
            url += f"?{urllib.parse.urlencode(query)}"
        if default_headers:
            h = self._build_default_headers()
            h.update(headers)
            headers = h

        if method == Method.GET and data:
            raise WrongMethodException("Conflicting information. ApiClient._request was called with the method set to"
                                       "Method.GET, but was also provided the `data` argument. Data can only be used "
                                       "with GET request, did you want to use Method.POST instead?")

        if method == Method.POST:
            headers['Content-Type'] = 'application/x-www-form-urlencoded; charset=UTF-8'

        # pretty sure everything will works just fine if this is removed, but I haven't tasted it yet. TODO:
        if signed:
            as_json = json.dumps(data)
            data = {
                'ig_sig_key_version': self.ig_profile.signature_key_version,
                'signed_body': f'SIGNATURE.{as_json}'
            }

        try:
            if method == Method.POST:
                resp = self._session.post(url, data, headers=headers)
            elif method == Method.GET:
                resp = self._session.get(url, headers=headers)
            else:
                raise ValueError("Request method should be POST or GET")

            logger.debug(f"Sent request to {url}, method: {resp.request.method} with data: \n {data}")
        except ValueError as e:
            raise e
        except Exception as e:  # todo: narrow down
            logger.exception(f"Exception while sending request to {url} with data: \n {data}")
            raise e

        logger.debug(
            f'{"*" * 20} START REQUEST {"*" * 20}\n'
            f'METHOD: {resp.request.method}\n'
            f'URL: {url}\n'
            f'DATA: {data}\n'
            f'HEADERS: {headers}\n'
            f'RESPONSE: {resp.content}\n'
            f'{"*" * 20} END REQUEST {"*" * 20}'
        )

        self._check_response_for_errors(resp)

        for func in self._request_finished_callbacks:
            func(resp.headers)

        return resp

    def _check_response_for_errors(self, resp: requests.Response) -> None:
        try:
            parsed = resp.json()
        except json.JSONDecodeError:
            if not resp.ok:
                if resp.status_code == 404 and '/friendships/' in resp.url:
                    raise InvalidUserId(f"url: {resp.url} is not recognized by Instagram")

                logger.exception(f"response received: \n{resp.text}\nurl: {resp.url}\nstatus code: {resp.status_code}")
                raise BadResponse("Received a non-200 response from Instagram")
            return
        if resp.ok:
            return

        if parsed.get('description') == 'invalid password':
            raise IncorrectLoginDetails("Instagram does not recognize the provided login details")
        if parsed.get('message') in ("checkpoint_required", "challenge_required"):
            if not hasattr(self, '_handle_challenge'):
                raise BadResponse("Challenge required. ChallengeMixin is not mixed in.")
            eh = self._handle_challenge(resp)
            if eh:
                return
        if parsed.get('message') == 'feedback_required':
            # TODO: implement a handler for this error
            raise BadResponse("Something unexpected happened. Please check the IG app.")
        if parsed.get('message') == 'rate_limit_error':
            raise TimeoutError("Calm down. Please try again in a few minutes.")
        raise BadResponse("Received a non-200 response from Instagram")
