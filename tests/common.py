import uuid
import json
import os

from requests import Response

from instauto.api.constants import DEFAULT_IG_PROFILE, DEFAULT_DEVICE_PROFILE, DEFAULT_STATE
from instauto.api.structs import IGProfile, DeviceProfile, State


class MockSession:
    cookies = {
        'csrftoken': "test_csrftoken"
    }


class MockResponse(Response):
    def __init__(self):
        super().__init__()
        self._content = json.dumps(
            {
                "test_response_key": "test_response_value",
                "logged_in_user": {
                    "username": os.environ['INSTAUTO_TESTS_USERNAME']
                }
            }
        ).encode()


DEFAULT_STATE_I = State(**DEFAULT_STATE)
DEFAULT_STATE_I.fill(uuid.uuid4)
DEFAULT_IG_PROFILE_I = IGProfile(**DEFAULT_IG_PROFILE)
DEFAULT_DEVICE_PROFILE_I = DeviceProfile(**DEFAULT_DEVICE_PROFILE)
