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

        api_path = resp_data['challenge']['api_path'][1::]
        resp = self._request(endpoint=api_path,
                             method=Method.GET,
                             query={
                                 "guid": self.state.uuid,
                                 "device_id": self.state.device_id
                             })
        bloks_action = resp_data['bloks_action']
        # handle simple challenge
        if bloks_action == 'com.instagram.challenge.navigation.take_challenge':
            resp = self._request(
                endpoint=api_path, method=Method.POST, data={
                    "choice": 0,  # 0 = this was me, 1 = this wasn't me,
                    "_csrftoken": self._session.cookies['csrftoken'],
                    "_uuid": self.state.uuid,
                    "bloks_versioning_id": self.state.bloks_version_id,
                    "post": 1
                }
            )
        elif True:
            security_code = input("Type the security code here: ")
            resp = self._request(
                endpoint=api_path, method=Method.POST, data={
                    "_csrftoken": self._session.cookies['csrftoken'],
                    "_uuid": self.state.uuid,
                    "bloks_versioning_id": self.state.bloks_version_id,
                    "post": 1,
                    "security_code": security_code
                }
            )
            resp_data = resp.json()
            self.state.logged_in_account_data = LoggedInAccountData(resp_data['logged_in_user'])
        return False
