from . import common as cmmn

import logging
import uuid
from typing import Optional
from instauto.api.structs import Surface

logger = logging.getLogger(__name__)


class _Base(cmmn.Base):
    _csrftoken: str = None
    radio_type: str = 'wifi-none'
    device_id: str = None
    _uid: str = None
    _uuid: str = None
    user_id: str = None

    def __init__(self, **kwargs):
        super().__init__(**kwargs)
        self._enable_datapoint_from_client('_csrftoken')
        self._enable_datapoint_from_client('device_id')
        self._enable_datapoint_from_client('_uid')
        self._enable_datapoint_from_client('_uuid')

        self._custom_data['uuid'] = self.State.required
        self._custom_data['user_id'] = self.State.required
        self._custom_data['endpoint'] = self.State.required
        self._custom_data['surface'] = self.State.optional


class Create(_Base):
    def __init__(self, user_id: str, **kwargs):
        """Use this to create a friendship, i.e. follow a user."""
        super().__init__(**kwargs)
        self._data['endpoint'] = 'create'
        self._data['user_id'] = user_id


class Destroy(_Base):
    def __init__(self, user_id: str, surface: Optional[Surface] = None, **kwargs):
        """Use this to 'destroy' a friendship, i.e. unfollow."""
        super().__init__(**kwargs)
        self._data['endpoint'] = 'destroy'
        self._data['user_id'] = user_id
        self._data['surface'] = surface
        self._defaults['surface'] = surface.profile


class Remove(_Base):
    def __init__(self, user_id: str, **kwargs):
        super().__init__(**kwargs)
        self._data['endpoint'] = 'remove_follower'
        self._data['user_id'] = user_id


class Show(cmmn.Base):
    """Retrieves the following information for a friendship:
    {
      "blocking": False,
      "followed_by": False,
      "following": False,
      "incoming_request": False,
      "is_bestie": False,
      "is_blocking_reel": False,
      "is_muting_reel": False,
      "is_private": False,
      "is_restricted": False,
      "muting": False,
      "outgoing_request": False,
      "status": "ok"
    }
    """
    def __init__(self, user_id: str, **kwargs):
        super().__init__(**kwargs)
        self._custom_data['user_id'] = self.State.required
        self._custom_data['endpoint'] = self.State.required
        self._data['user_id'] = user_id
        self._data['endpoint'] = cmmn.Base.State.required


class GetBase(cmmn.Base):
    def __init__(self, user_id: str, surface: Optional[Surface] = None, **kwargs):
        super().__init__(**kwargs)
        self._custom_data['user_id'] = self.State.required
        self._custom_data['rank_token'] = self.State.required
        self._custom_data['search_surface'] = self.State.required

        self._data['user_id'] = user_id
        self._data['search_surface'] = surface

        self._defaults['search_surface'] = Surface.follow_list
        self._defaults['rank_token'] = uuid.uuid4()


# The requests for getting followers and your following, look exactly the same
# but we want to keep them in seperate structs for clarity.
GetFollowers = GetFollowing = GetBase


class PendingRequests:
    def __init__(self):
        pass


class ApproveRequest(cmmn.Base):
    def __init__(self, user_id: str, **kwargs):
        super().__init__(**kwargs)
        self._enable_datapoint_from_client('_csrftoken')
        self._enable_datapoint_from_client('_uid')
        self._enable_datapoint_from_client('_uuid')

        self._custom_data['radio_type'] = self.State.required
        self._custom_data['surface'] = self.State.required
        self._custom_data['user_id'] = self.State.required

        self._data['user_id'] = user_id

        self._defaults['surface'] = Surface.follow_requests
        self._defaults['radio_type'] = 'wifi-none'
