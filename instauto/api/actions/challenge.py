import requests
import uuid
import logging

from instauto.api.actions.stub import StubMixin
from instauto.api.structs import Method
from instauto.api.exceptions import BadResponse

logging.basicConfig()
logger = logging.getLogger(__name__)
logger.setLevel(logging.DEBUG)


class ChallengeMixin(StubMixin):
    def _handle_challenge(self, resp: requests.Response) -> bool:
        resp_data = self._json_loads(resp.text)
        # pyre-ignore[6]
        if resp_data['message'] not in ('challenge_required', 'checkpoint_required'):
            raise BadResponse("Challenge required, but no URL provided.")
        # pyre-ignore[6]
        api_path = resp_data['challenge']['api_path'][1:]

        resp = self._request(
            endpoint=api_path,
            method=Method.GET,
            query={
               "guid": self.state.uuid,
               "device_id": self.state.android_id
            }
        )
        data = self._json_loads(resp.text)

        base_body = {
            "_csrftoken": self._session.cookies['csrftoken'],
            "_uuid": self.state.uuid,
            "bloks_versioning_id": self.state.bloks_version_id,
            "post": 1,
        }
        body = base_body.copy()
        # pyre-ignore[16]
        body["choice"] = int(data.get("step_data", {}).get("choice", 0))

        _ = self._request(endpoint=api_path, method=Method.POST, body=body)

        security_code = input("Verification needed. Type verification code here: ")
        body = base_body.copy()
        body["security_code"] = security_code
        _ = self._request(endpoint=api_path, method=Method.POST, body=body)
        return True

    def _handle_2fa(self, parsed: dict) -> None:
        endpoint = "accounts/two_factor_login/"
        username = parsed['two_factor_info']['username']

        code = input(f"Enter 2fa code for {username}: ") if self._2fa_function is None else self._2fa_function(username)
        logger.debug("2fa code is: %s", code)

        # 1 = phone verification, 3 = authenticator app verification
        verification_method = "1" if parsed['two_factor_info'].get('sms_two_factor_on') else "3"

        body = {
            'verification_code': code,
            'phone_id': uuid.uuid4(),
            '_csrftoken': self._session.cookies['csrftoken'],
            'two_factor_identifier': parsed['two_factor_info']['two_factor_identifier'],
            'username': username,
            'trust_this_device': 0,
            'guid': uuid.uuid4(),
            'device_id': self.state.android_id,
            'waterfall_id': uuid.uuid4(),
            'verification_method': verification_method
        }
        self._request(endpoint, Method.POST, body=body)
