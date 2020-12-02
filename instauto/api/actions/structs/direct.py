from . import common as cmmn
import json
import logging

logger = logging.getLogger(__name__)


class _Base(cmmn.Base):
    def __init__(self, recipients, threads, *args, **kwargs):
        if recipients:
            self.recipient_users = json.dumps(recipients)
        if threads:
            self.thread_ids = json.dumps(threads)
        super().__init__(*args, **kwargs)
        self._exempt.extend(['endpoint'])


class Message(_Base):

    REQUEST = 'direct/message.json'
    endpoint = "direct_v2/threads/broadcast/text/"

    def __init__(self, message, recipients=None, threads=None, *args, **kwargs):
        self.text = message
        super().__init__(recipients, threads, *args, **kwargs)


class MediaShare(_Base):

    REQUEST = 'direct/mediashare.json'
    endpoint = "direct_v2/threads/broadcast/media_share/"

    def __init__(self, media_id, recipients=None, threads=None, *args, **kwargs):
        self.media_id = media_id
        super().__init__(recipients, threads, *args, **kwargs)


class LinkShare(_Base):

    REQUEST = 'direct/linkshare.json'
    endpoint = "direct_v2/threads/broadcast/link/"

    def __init__(self, text, links, recipients=None, threads=None, *args, **kwargs):
        if type(links) != list:
            links = [links]
        self.link_text = text
        self.link_urls = json.dumps(links)
        super().__init__(recipients, threads, *args, **kwargs)


class ProfileShare(_Base):

    REQUEST = 'direct/profileshare.json'
    endpoint = "direct_v2/threads/broadcast/profile/"

    def __init__(self, profile_id, recipients=None, threads=None, *args, **kwargs):
        self.profile_user_id = profile_id
        super().__init__(recipients, threads, *args, **kwargs)


class DirectPhoto(_Base):

    REQUEST = 'direct/photoshare.json'
    endpoint = "direct_v2/threads/broadcast/configure_photo/"

    def __init__(self, upload_id, recipients=None, threads=None, *args, **kwargs):
        self.upload_id = upload_id
        self.allow_full_aspect_ratio = True
        super().__init__(recipients, threads, *args, **kwargs)


class DirectVideo(_Base):

    REQUEST = 'direct/videoshare.json'
    endpoint = "direct_v2/threads/broadcast/configure_video/"
    sampled = True
    video_result = ''

    def __init__(self, upload_id, recipients=None, threads=None, *args, **kwargs):
        self.upload_id = upload_id
        self.sampled = True
        self.video_result = ''
        super().__init__(recipients, threads, *args, **kwargs)
