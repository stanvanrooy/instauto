import requests
import json
import logging
import pickle

from instauto.api.structs import DeviceProfile, IGProfile, State, Method, LoggedInAccountData
from instauto.api.exceptions import BadResponse
from instauto.api.actions.stubs import _request

logging.basicConfig()

logger = logging.getLogger(__name__)
logger.setLevel(logging.DEBUG)


class ChallengeMixin:
    ig_profile: IGProfile
    device_profile: DeviceProfile
    state: State
    _session: requests.Session
    _request: _request

    def _handle_challenge(self, resp: requests.Response) -> bool:
        resp_data = resp.json()
        if resp_data['message'] not in ('challenge_required', 'checkpoint_required'):
            raise BadResponse("Challenge required, but no URL provided.")

        api_path = resp_data['challenge']['api_path'][1:]
        resp_data2 = self._request(endpoint=api_path, method=Method.GET, query={
                                    "guid": self.state.uuid,
                                    "device_id": self.state.android_id
                                }
                             )
        # TODO: Add support for different kinds of challenges.
        #       Currently, only the verification pin challenge is supported, and other challenges, such as the
        #       'verify this was you', do not work.
        resp_json2 = resp_data2.json()
        if int(resp_json2.get("step_data", {}).get("choice", 0)) == 1:
            # server only support choice 1, this is requiry some other devices to confirm send verification, like web
            _ = self._request(
                endpoint=api_path, method=Method.POST, data={
                    "choice": 1,  # TODO: enum to confirm send verification code.
                    "_csrftoken": self._session.cookies['csrftoken'],
                    "_uuid": self.state.uuid,
                    "bloks_versioning_id": self.state.bloks_version_id,
                    "post": 1
                }
            )
            logger.warning("You may should confirm in some other logged device this was me to obtain the verification code.")
        else:
            _ = self._request(
                endpoint=api_path, method=Method.POST, data={
                    "choice": 0,  # TODO: enum phone/email verification. Which value represent which one?
                    "_csrftoken": self._session.cookies['csrftoken'],
                    "_uuid": self.state.uuid,
                    "bloks_versioning_id": self.state.bloks_version_id,
                    "post": 1
                }
            )

        security_code = input("Verification needed. Type verification code here: ")
        _ = self._request(
            endpoint=api_path, method=Method.POST, data={
                "_csrftoken": self._session.cookies['csrftoken'],
                "_uuid": self.state.uuid,
                "bloks_versioning_id": self.state.bloks_version_id,
                "post": 1,
                "security_code": security_code
            }
        )
        return True
