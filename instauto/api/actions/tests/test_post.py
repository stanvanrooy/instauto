import unittest

from instauto.api.client import ApiClient
import instauto.api.actions.structs.post as ps
from .common import helper


class TestPost(unittest.TestCase):

    def test_get_post_likers(self):
        client = ApiClient(testing=True)
        s = ps.RetrieveLikers(media_id="test")
        s.fill(client)
        helper(s, self)

    def test_get_post_commenters(self):
        client = ApiClient(testing=True)
        s = ps.RetrieveCommenters(media_id="test")
        s.fill(client)
        helper(s, self)
