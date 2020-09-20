import requests
import json
import logging
import pickle

from instauto.api.structs import DeviceProfile, IGProfile, State, Method
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

        resp = self._request(endpoint=resp_data['api_path'],
                             method=Method.GET,
                             query={
                                 "guid": self.state.uuid,
                                 "device_id": self.state.device_id
                             })
        with open('./response.pickle', 'wb+') as f:
            pickle.dump(resp, f)

        resp_data = resp.json()
        bloks_action = resp_data['bloks_actions']
        # Handle unknown device challenge
        if bloks_action == 'com.instagram.challenge.navigator.take_challenge':
            resp = self._request(
                endpoint=f'bloks/{bloks_action}/', method=Method.POST, data = {
                    "choice": 0,  # 0 = this was me, 1 = this wasn't me,
                    "_csrftoken": self._session.cookies['csrftoken'],
                    "_uuid": self.state.uuid,
                    "bloks_versioning_id": self.state.bloks_version_id
                }
            )
            with open('./response1.pickle', 'wb+') as f:
                pickle.dump(resp, f)
            resp_data = resp.json()
            if resp_data['status'] == "ok":
                return True

        return False

