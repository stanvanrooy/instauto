import os
import uuid
import json
import unittest
import unittest.mock

from requests import Response

from instauto.api.client import ApiClient
from instauto.api.exceptions import NoAuthDetailsProvided
from instauto.api.structs import IGProfile, DeviceProfile, State, Method
from instauto.api.constants import DEFAULT_IG_PROFILE, DEFAULT_DEVICE_PROFILE, DEFAULT_STATE


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
                    "username": "test_username"
                }
            }
        ).encode()


DEFAULT_STATE_I = State(**DEFAULT_STATE)
DEFAULT_STATE_I.fill(uuid.uuid4)
DEFAULT_IG_PROFILE_I = IGProfile(**DEFAULT_IG_PROFILE)
DEFAULT_DEVICE_PROFILE_I = DeviceProfile(**DEFAULT_DEVICE_PROFILE)


class TestActionAuthentication(unittest.TestCase):
    def test_1(self):
        """Test `_create_jazoest` produces the correct value"""
        client = ApiClient(testing=True)
        client.state.phone_id = "24db86d8-9946-4892-8556-63411c5cb5e8"
        self.assertEqual(client._create_jazoest(), '22211')

    def test_wo_auth_details(self):
        self.assertRaises(NoAuthDetailsProvided, ApiClient)
        self.assertRaises(NoAuthDetailsProvided, ApiClient, ig_profile=DEFAULT_IG_PROFILE_I)
        self.assertRaises(NoAuthDetailsProvided, ApiClient, ig_profile=DEFAULT_IG_PROFILE_I,
                          device_profile=DEFAULT_DEVICE_PROFILE_I)
        self.assertRaises(NoAuthDetailsProvided, ApiClient, ig_profile=DEFAULT_IG_PROFILE_I,
                          device_profile=DEFAULT_DEVICE_PROFILE_I, state=DEFAULT_STATE_I)
        ApiClient(ig_profile=DEFAULT_IG_PROFILE_I, device_profile=DEFAULT_DEVICE_PROFILE_I,
                  state=DEFAULT_STATE_I, session_cookies={'test': 1})

    def test_w_auth_details(self):
        ApiClient(user_name="test_username", password="test_password")
        ApiClient(state=DEFAULT_STATE_I, session_cookies={'test': 1})

    @unittest.skip("The log in endpoint shouldn't be called frequently")
    def test_login(self):
        client = ApiClient(user_name=os.environ['INSTAUTO_TESTS_USER_NAME'], password=os.environ['INSTAUTO_TESTS_PASSWORD'])
        client.login()
        self.assertIsNotNone(client.state.logged_in_account_data)

    def test_login_mock(self):
        client = ApiClient(user_name='test_username', password='test_password')
        client._session = MockSession()
        client._update_token = unittest.mock.MagicMock(name='_update_token')
        client._request = unittest.mock.MagicMock(name='_request', return_value=MockResponse())
        client.login()
        self.assertEqual(2, client._request.call_count)

        self.assertIsNotNone(client.state.logged_in_account_data)

    def test_update_token(self):
        client = ApiClient(user_name='test_username', password='test_password')
        client._request = unittest.mock.MagicMock(name='_request', return_value=MockResponse())

        client._update_token()
        client._request.assert_called_with('zr/token/result/', Method.GET, query=unittest.mock.ANY,
                                           headers=unittest.mock.ANY, default_headers=False)