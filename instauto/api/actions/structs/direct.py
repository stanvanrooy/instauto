import orjson

from . import common as cmmn

import logging

from typing import Optional, List, Union

logger = logging.getLogger(__name__)


class _Base(cmmn.Base):
    broadcast_type: str

    def __init__(self,
                 recipients: Optional[List[List[str]]],
                 thread_ids: Optional[List[str]],
                 broadcast_type: str, *args, **kwargs):
        if recipients is not None:
            self.recipient_users = orjson.dumps(recipients).decode()
            self.thread_ids = []
        elif thread_ids is not None:
            self.thread_ids = orjson.dumps(thread_ids).decode()
            self.recipient_users = []
        else:
            raise ValueError("Neither `recipients` or `threads` are provided.")
        self.broadcast_type = broadcast_type
        super().__init__(*args, **kwargs)
        self._exempt.extend(['endpoint', 'broadcast_type'])
    
    @property
    def endpoint(self):
        return f'direct_v2/threads/broadcast/{self.broadcast_type}/'


class Message(_Base):
    REQUEST = 'direct/message.json'

    def __init__(self, message: str, recipients: Optional[List[List[str]]] = None,
                 threads: Optional[List[str]] = None, *args, **kwargs):
        self.text = message
        super().__init__(recipients, threads, 'text', *args, **kwargs)


class MediaShare(_Base):
    REQUEST = 'direct/mediashare.json'

    def __init__(self, media_id: str, recipients: Optional[List[List[str]]] = None,
                 threads: Optional[List[str]] = None, *args, **kwargs):
        self.media_id = media_id
        super().__init__(recipients, threads, 'media_share', *args, **kwargs)


class LinkShare(_Base):
    REQUEST = 'direct/linkshare.json'

    def __init__(self, text: str, links: Union[List[str], str], recipients: Optional[List[List[str]]] = None,
                 threads: Optional[List[str]] = None, *args, **kwargs):
        if type(links) != list:
            # pyre-ignore[9]: we check if it's a list
            links = [links]
        self.link_text = text
        self.link_urls = orjson.dumps(links).decode()
        super().__init__(recipients, threads, 'link', *args, **kwargs)


class ProfileShare(_Base):
    REQUEST = 'direct/profileshare.json'

    def __init__(self, profile_id: str, recipients: Optional[List[List[str]]] = None,
                 threads: Optional[List[str]] = None, *args, **kwargs):
        self.profile_user_id = profile_id
        super().__init__(recipients, threads, 'profile', *args, **kwargs)


class DirectPhoto(_Base):
    REQUEST = 'direct/photoshare.json'

    def __init__(self, upload_id: str, recipients: Optional[List[List[str]]] = None,
                 threads: Optional[List[str]] = None, *args, **kwargs):
        self.upload_id = upload_id
        self.allow_full_aspect_ratio = True
        super().__init__(recipients, threads, 'configure_photo', *args, **kwargs)


class DirectVideo(_Base):
    REQUEST = 'direct/videoshare.json'
    sampled: bool
    video_result: str

    def __init__(self, upload_id: str, recipients: Optional[List[List[str]]] = None,
                 threads: Optional[List[str]] = None, *args, **kwargs):
        self.upload_id = upload_id
        self.sampled = True
        self.video_result = ''
        super().__init__(recipients, threads, 'configure_video', *args, **kwargs)


class DirectThread(cmmn.Base):
    thread_id: str

    def __init__(self, thread_id: str, *args, **kwargs):
        self.thread_id = thread_id
        super().__init__(*args, **kwargs)
