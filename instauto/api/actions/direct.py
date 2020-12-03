from requests import Session, Response
from typing import Callable, Union, Dict, List, Optional
from instauto.api.actions.stubs import _request

from ..structs import IGProfile, State, DeviceProfile, Method, Thread, Inbox
from .structs.direct import Message, MediaShare, LinkShare, ProfileShare, \
    DirectPhoto, DirectVideo, DirectThread


class DirectMixin:
    """Handles everything related to
    Instagram direct message threads"""
    _session: Session
    ig_profile: IGProfile
    state: State
    device_profile: DeviceProfile
    _request: _request
    _gen_uuid: Callable
    _generate_user_breadcrumb: Callable
    _inbox: Optional[Inbox] = None

    @property
    def inbox(self):
        if self._inbox is None:
            raise ValueError("Inbox has not been retrieved")
        return self._inbox

    @inbox.setter
    def inbox(self, value: Inbox):
        self._inbox = value

    def direct_update_inbox(self) -> bool:
        """Request your inbox status from Instagram.

        Updates the threads with a distinct set of the old & new threads. Overwrites
        all other properties.

        Returns
        ----------
        bool
            True if inbox has been updated, else False
        """
        resp = self._request('direct_v2/inbox', Method.GET)
        stat = self._set_inbox_from_json(resp.json())
        return resp.ok and stat

    def direct_get_thread(self, obj: DirectThread) -> Thread:
        """Retrieve more information about a thread.

        If this thread exists in the inbox, update it, else add it to the thread lists.

        Parameters
        ----------
        obj : DirectThread
            The thread you want to retrieve
        Returns
        ----------
        Thread
            The retrieved thread.
        """
        resp = self._request(f"direct_v2/threads/{obj.thread_id}", Method.GET)
        thread = resp.json()['thread']
        thread = Thread(thread.pop('thread_id'), thread.pop('thread_v2_id'), thread.pop('users'),
                        thread.pop('left_users'), thread.pop('admin_user_ids'), thread.pop('items'),
                        {k : v for k, v in thread.items()})

        self._add_or_update_inbox_with_thread(thread)
        return thread

    def direct_send(self, obj: Union[Message, MediaShare, LinkShare,
                    ProfileShare, DirectPhoto, DirectVideo]) -> Response:
        """Send a message to a thread.

        Parameters
        ----------
        obj
            The message that needs to be send
        Returns
        ----------
        Response
            The response sent by Instagram
        """
        as_dict = obj.to_dict()
        return self._request(obj.endpoint, Method.POST, data=as_dict)

    def _build_thread_objects(self, threads_as_dict: List[dict]) -> List[Thread]:
        threads: List[Thread] = []
        for thread in threads_as_dict:
            threads.append(
                Thread(thread.pop('thread_id'), thread.pop('thread_v2_id'), thread.pop('users'),
                       thread.pop('left_users'), thread.pop('admin_user_ids'), thread.pop('items'),
                       {k: v for k, v in thread.items()}))
        return threads

    def _extend_inbox_threads(self, threads: List[Thread]):
        threads.extend(self.inbox.threads)
        seen = []
        threads = list(filter(lambda x: x.thread_id not in seen and seen.append(x.thread_id) is None, threads))
        self.inbox.threads = threads

    def _set_inbox_from_json(self, data: dict):
        threads = self._build_thread_objects(data['inbox']['threads'])

        self.inbox = Inbox(
            threads, data['inbox']['has_older'], data['inbox']['unseen_count'], data['inbox']['unseen_count_ts'],
            data['inbox']['oldest_cursor'], data['inbox']['prev_cursor'], data['inbox']['next_cursor'],
            data['inbox']['blended_inbox_enabled'], data['seq_id'], data['snapshot_at_ms'],
            data['pending_requests_total'], data['has_pending_top_requests']
        )
        self._extend_inbox_threads(threads)

        return True

    def _add_or_update_inbox_with_thread(self, thread: Thread):
        if self._inbox is None:
            return
        index_of_existing = [i for i, t in enumerate(self.inbox.threads) if t.thread_id == thread.thread_id]
        if index_of_existing:
            self.inbox.threads[index_of_existing[0]] = thread
        else:
            self.inbox.threads.append(thread)
