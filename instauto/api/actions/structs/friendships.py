from typing import Optional

from . import common as cmmn

import logging
import uuid
from instauto.api.structs import Surface

logger = logging.getLogger(__name__)


class _Base(cmmn.Base):
    _csrftoken: str = ''
    _uid: str = ''
    _uuid: str = ''

    def __init__(self, user_id: str, surface: Optional[Surface] = None,  *args, **kwargs) -> None:
        # user_id is returned as int by instagram. That makes it error prone,
        # since sending the user_id as int will not work.
        self.user_id = str(user_id)
        self.surface = surface

        super().__init__(*args, **kwargs)
        self._exempt.append('endpoint')


class Create(_Base):
    REQUEST = 'friendships/create.json'
    endpoint: str = 'create'
    device_id: str = ''

    def __init__(self, user_id: str, radio_type: str = '-none', *args, **kwargs):
        """Use this to create a friendship, i.e. follow a user."""
        super().__init__(user_id, None, radio_type=radio_type, *args, **kwargs)


class Destroy(_Base):
    REQUEST = 'friendships/destroy.json'
    endpoint: str = 'destroy'

    def __init__(self, user_id: str, surface: Surface = Surface.profile, radio_type='wifi-none', *args, **kwargs):
        """Use this to 'destroy' a friendship, i.e. unfollow."""
        super().__init__(user_id, surface, radio_type=radio_type, *args, **kwargs)


class Remove(_Base):
    REQUEST = 'friendships/remove.json'
    endpoint: str = 'remove_followers'

    def __init__(self, user_id: str, radio_type='wifi-none', *args, **kwargs):
        super().__init__(user_id, radio_type=radio_type, *args, **kwargs)


class Show(cmmn.Base):
    REQUEST: str = 'friendships/show.json'
    endpoint: str = 'show'

    def __init__(self, user_id: str, *args, **kwargs):
        self.user_id = user_id
        super().__init__(*args, **kwargs)


class PendingRequests(cmmn.Base):
    REQUEST: str = 'friendships/pending_requests.json'


class ApproveRequest(_Base):
    REQUEST: str = 'friendships/approve_request.json'
    radio_type: str = 'wifi-none'

    def __init__(self, user_id: str, surface: Surface = Surface.follow_requests, *args, **kwargs):
        self.user_id = user_id
        self.surface = str(surface.value)
        super().__init__(*args, **kwargs)


# pyre-ignore[13]: page is declared when utilized to keep track of how many pages we've retrieved.
class _GetBase(cmmn.Base):
    user_id: int
    page: int = 0
    max_id: str
    rank_token: str
    search_surface: str
    order: str

    def __init__(
        self, user_id: int , order='default',
        surface: Surface = Surface.follow_list, enable_groups=False,
        query="", *args, **kwargs
    ):
        self.rank_token = str(uuid.uuid4())
        self.order = order
        self.query = query
        self.enable_groups = enable_groups
        self.user_id = user_id
        self.search_surface = str(surface.value)
        super().__init__(*args, **kwargs)


class GetFollowers(_GetBase):
    REQUEST = 'friendships/get_followers.json'


class GetFollowing(_GetBase):
    REQUEST = 'friendships/get_following.json'
