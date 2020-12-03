import unittest

from instauto.api.client import ApiClient
import instauto.api.actions.structs.direct as dr
from .common import helper
from ...structs import Inbox, Thread


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

    def test_build_thread_objects(self):
        client = ApiClient(testing=True)
        threads = self._get_threads()
        built_threads = client._build_thread_objects(threads)
        for t1, t2 in zip(threads, built_threads):
            for k, v in t1.items():
                self.assertEqual(v, getattr(t2, k))

    def test_extend_inbox_threads(self):
        client = ApiClient(testing=True)
        client.inbox = self._get_inbox()
        client._extend_inbox_threads(client._build_thread_objects(self._get_threads()))
        self.assertEqual(len(client.inbox.threads), 2)
        client._extend_inbox_threads(client._build_thread_objects(self._get_threads()))
        self.assertEqual(len(client.inbox.threads), 2)

    def test_add_or_update_inbox_with_thread(self):
        client = ApiClient(testing=True)
        thread = client._build_thread_objects(self._get_threads())[0]
        client._add_or_update_inbox_with_thread(thread)
        client.inbox = self._get_inbox()
        client._add_or_update_inbox_with_thread(thread)
        client._add_or_update_inbox_with_thread(thread)
        self.assertEqual(len(client.inbox.threads), 2)

    @staticmethod
    def _get_inbox():
        return Inbox([Thread(*[None for _ in range(7)])], *[None for _ in range(11)])

    @staticmethod
    def _get_threads():
        return [
            {
                'thread_id': 'test1', 'thread_v2_id': 'test1', 'users': ['user1'],
                'left_users': ['user1'], 'admin_user_ids': ['user1'], 'items': ['Hi']
            }
        ]
