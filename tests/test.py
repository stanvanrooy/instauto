import os
import sys
import unittest

sys.path.insert(0, os.path.abspath('../'))
sys.path.insert(0, os.path.abspath('../instauto'))

from instauto.api.client import ApiClient
from instauto.api.exceptions import NoAuthDetailsProvided
from instauto.api.structs import WhichGender, WhereToPost

from instauto.api.actions.structs import search as se
from instauto.api.actions.structs import profile as pr
from instauto.api.actions.structs import post as pst
from instauto.api.actions.structs import friendships as fs

import logging
logger = logging.getLogger(__name__)
logger.setLevel("DEBUG")


@unittest.skipIf(os.environ.get('REAL_TESTING') is None, "We shouldn't connect to Instagram often.")
class TestReal(unittest.TestCase):
    def setUp(self) -> None:
        # 2383700544973654391_25025320 = https://www.instagram.com/p/CEUmwQqD0l3/
        self._media_id = "2383700544973654391_25025320"
        self._user_id = "25025320"
        if os.path.isfile('../.instauto.save'):
            client = ApiClient.initiate_from_file('../.instauto.save')
        else:
            client = ApiClient(user_name=os.environ['INSTAUTO_TESTS_USERNAME'], password=os.environ[
                "INSTAUTO_TESTS_PASSWORD"])
        self._client = client

    def test_login(self) -> None:
        if self._client.state.logged_in_account_data is None:
            self._client.login()
        self.assertIsNotNone(self._client.state.logged_in_account_data)

    def test_search_user(self) -> None:
        obj = se.Username.create("instagram", 1)
        resp = self._client.search_username(obj)
        resp_as_json = resp.json()
        self.assertTrue(len(resp_as_json['users']) > 0)

    def test_update_biography(self):
        obj = pr.SetBiography.create("Stan")
        resp = self._client.profile_set_biography(obj)
        resp_as_json = resp.json()
        self.assertTrue(resp_as_json['status'] == 'ok')

    def test_update_gender(self):
        obj = pr.SetGender(gender=WhichGender.female)
        resp = self._client.profile_set_gender(obj)
        resp_as_json = resp.json()
        self.assertTrue(resp_as_json['status'] == 'ok')

    def test_post_comment(self):
        obj = pst.Comment.create(media_id=self._media_id, comment_text="Such great!")
        resp = self._client.post_comment(obj)
        resp_as_json = resp.json()
        self.assertTrue(resp_as_json['status'] == 'ok')

    def test_post_like(self):
        obj = pst.Like.create(media_id=self._media_id)
        resp = self._client.post_like(obj)
        resp_as_json = resp.json()
        self.assertTrue(resp_as_json['status'] == 'ok')

    def test_post_retrieve_by_user(self):
        obj = pst.RetrieveByUser.create(user_id=self._user_id)
        obj, posts = self._client.post_retrieve_by_user(obj)
        self.assertTrue(len(posts) == 12)  # we can assume @instagram has > 12 posts :)

    def test_post_save(self):
        obj = pst.Save.create(media_id=self._media_id)
        resp = self._client.post_save(obj)
        resp_as_json = resp.json()
        self.assertTrue(resp_as_json['status'] == 'ok')

    def test_post_unlike(self):
        obj = pst.Unlike.create(media_id=self._media_id)
        resp = self._client.post_unlike(obj)
        resp_as_json = resp.json()
        self.assertTrue(resp_as_json['status'] == 'ok')

    @unittest.skip("Let's not post a lot of images")
    def test_post_post(self):
        obj = pst.Post.create(path='./to_upload.png', source_type=WhereToPost.Feed, caption="Hey!")
        resp = self._client.post_post(obj, quality=100)
        resp_as_json = resp.json()
        self.assertTrue(resp_as_json['status'] == 'ok')

    def test_get_followers(self):
        obj = fs.ShowFollowers.create(user_id=self._user_id)
        obj, resp = self._client.followers_get(obj)
        resp_as_json = resp.json()
        self.assertTrue(resp_as_json['status'] == 'ok')

    def test_get_following(self):
        obj = fs.ShowFollowing.create(user_id=self._user_id)
        obj, resp = self._client.following_get(obj)
        resp_as_json = resp.json()
        self.assertTrue(resp_as_json['status'] == 'ok')

    def test_show_friendship(self):
        obj = fs.Show.create(user_id=self._user_id)
        resp = self._client.follower_show(obj)
        resp_as_json = resp.json()
        self.assertTrue(resp_as_json['status'] == 'ok')
