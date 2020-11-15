import unittest

from instauto.api.client import ApiClient
import instauto.api.actions.post as ps
from .common import helper


class TestMedia(unittest.TestCase):

    def test_media_likers(self):
        client = ApiClient(testing=True)
        s = ps.RetrieveLikers()
        s.fill(client)
        helper(s, self)

    def test_media_commenters(self):
        client = ApiClient(testing=True)
        s = ps.RetrieveCommenters("test")
        s.fill(client)
        helper(s, self)
