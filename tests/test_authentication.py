import os
import sys
import unittest
import unittest.mock

sys.path.insert(0, os.path.abspath('../'))
sys.path.insert(0, os.path.abspath('../instauto'))

from instauto.api.client import ApiClient
from instauto.api.exceptions import NoAuthDetailsProvided
from instauto.api.structs import Method

from common import DEFAULT_STATE_I, DEFAULT_DEVICE_PROFILE_I, DEFAULT_IG_PROFILE_I, MockResponse, MockSession


class TestApiClient(unittest.TestCase):
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

    @unittest.skip("The logging in endpoint shouldn't be called frequently")
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
