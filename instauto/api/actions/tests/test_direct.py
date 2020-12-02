import unittest

from instauto.api.client import ApiClient
import instauto.api.actions.structs.direct as dr
from .common import helper

class TestDirectMessage(unittest.TestCase):

    def test_message(self):
        client = ApiClient(testing=True)
        s = dr.Message(message="test", recipients=[["test_userid"]], threads=["test_threadid"])
        s.fill(client)
        helper(s, self)

    def test_link(self):
        client = ApiClient(testing=True)
        s = dr.LinkShare("test https://instagram.com", "https://instagram.com", recipients=[["test_userid"]], threads=["test_threadid"])
        s.fill(client)
        helper(s, self)

    def test_media_share(self):
        client = ApiClient(testing=True)
        s = dr.MediaShare("media_id", recipients=[["test_userid"]], threads=["test_threadid"])
        s.fill(client)
        helper(s, self)

    def test_profile(self):
        client = ApiClient(testing=True)
        s = dr.ProfileShare("profile_id", recipients=[["test_userid"]], threads=["test_threadid"])
        s.fill(client)
        helper(s, self)

    def test_direct_photo(self):
        client = ApiClient(testing=True)
        s = dr.DirectPhoto("upload_id", recipients=[["test_userid"]], threads=["test_threadid"])
        s.fill(client)
        helper(s, self)

    @unittest.skip("Video upload functionality is needed before direct message video feature can be finished.")
    def test_direct_video(self):
        client = ApiClient(testing=True)
        s = dr.DirectVideo("upload_id", recipients=[["test_userid"]], threads=["test_threadid"])
        s.fill(client)
        helper(s, self)
