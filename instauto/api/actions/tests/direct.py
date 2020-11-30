import unittest

from instauto.api.client import ApiClient
import instauto.api.actions.structs.direct as dr
from .common import helper

class TestDirectMessage(unittest.TestCase):
    def test_message(self):
        client = ApiClient(testing=True)
        s = dr.Message(message="test", recipients=[["test_userid"]])
        s.fill(client)
        helper(s, self)
