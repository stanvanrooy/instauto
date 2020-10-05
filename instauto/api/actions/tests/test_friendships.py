import unittest

from instauto.api.client import ApiClient
import instauto.api.actions.structs.friendships as fs
from .common import helper


class TestFriendships(unittest.TestCase):
    def test_create(self):
        client = ApiClient(testing=True)
        s = fs.Create(user_id="test")
        s.fill(client)
        helper(s, self)

    def test_destroy(self):
        client = ApiClient(testing=True)
        s = fs.Destroy(user_id="test")
        s.fill(client)
        helper(s, self)

    def test_remove(self):
        client = ApiClient(testing=True)
        s = fs.Remove("test")
        s.fill(client)
        helper(s, self)

    def test_show(self):
        client = ApiClient(testing=True)
        s = fs.Show(user_id="test")
        s.fill(client)
        helper(s, self)

    def test_pending_requests(self):
        client = ApiClient(testing=True)
        s = fs.PendingRequests()
        s.fill(client)
        helper(s, self)

    @unittest.skip("Original request/response for this request needs to be added")
    def test_approve_request(self):
        client = ApiClient(testing=True)
        s = fs.ApproveRequest("test")
        s.fill(client)
        helper(s, self)

    def test_get_followers(self):
        client = ApiClient(testing=True)
        s = fs.GetFollowers("test")
        s.fill(client)
        helper(s, self)

    def test_get_following(self):
        client = ApiClient(testing=True)
        s = fs.GetFollowing("test")
        s.fill(client)
        helper(s, self)
