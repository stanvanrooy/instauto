import unittest
import unittest.mock
import os
import sys
sys.path.append(os.path.abspath('../'))


from instauto.api.client import ApiClient


class TestAuthentication(unittest.TestCase):
    def setUp(self) -> None:
        self.client_wo_auth_details = ApiClient()
        # self.client_w_user_a_pass = ApiClient(os.environ['instauto_tests_username'], os.environ['instauto_tests_password'])
        # self.client_w_saved_details = ApiClient(ig_profile=mock_ig_profile(), device_profile=mock_device_profile(),
        #                                         state=mock_state_profile())

    @unittest.skip("The login endpoint shouldn't be called frequently")
    def test_login(self):
        self.client_w_user_a_pass.login()
        self.assertIsNotNone(self.client_w_user_a_pass.state.logged_in_account_data)

    def test_login_no_details(self):
        mocked_client = unittest.mock.Mock(self.client_wo_auth_details)
        x = mocked_client.login()
        print(dir(x))
        print(x.method_calls)
