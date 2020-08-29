import logging
import uuid

logger = logging.getLogger(__name__)


class _Base:
    _csrftoken: str = None
    radio_type: str = 'wifi-none'
    device_id: str = None
    _uid: str = None
    _uuid: str = None
    user_id: str = None

    def _create(self, **kwargs):
        """Creates an instance of the class, this method should be overwritten in the individual classes with
        arguments that are required, so it is clear which arguments are needed for which action.

        If the class has an attribute, the default value can be overwritten by providing an argument named after the
        attribute. This is probably not used often, since the default values should work for basically all cases,
        but it is nice to have the option.
        """
        for k, v in kwargs.items():
            if hasattr(self, k):
                setattr(self, k, v)
            else:
                logger.warning("{} was sent as a keyword argument, but isn't supported.")


class Create(_Base):
    """Follow an account"""
    endpoint: str = 'create'

    @classmethod
    def create(cls, user_id: str, **kwargs) -> "Create":
        i = cls()
        i._create(user_id=user_id, **kwargs)
        return i


class Destroy(_Base):
    """Unfollow an account"""
    surface: str = "following_sheet"
    endpoint = 'destroy'

    @classmethod
    def create(cls, user_id: str, surface: str = None, **kwargs) -> "Destroy":
        """
        Parameters
        ----------
        user_id : str
            id of the user to unfollow
        surface : str
            where in the app the user is unfollowed from, can be:
                1. following_sheet = the profile of the user
                2. self_unified_follow_lists = your following list
        kwargs
        """
        i = cls()
        i._create(user_id=user_id, surface=surface if surface is not None else "following_sheet", **kwargs)
        return i


class Remove(_Base):
    """Force an account to unfollow you."""
    endpoint: str = 'remove_follower'

    @classmethod
    def create(cls, user_id: str, **kwargs) -> "Remove":
        i = cls()
        i._create(user_id=user_id, **kwargs)
        return i


class Show:
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
    user_id: str
    endpoint: str = 'show'

    @classmethod
    def create(cls, user_id: str) -> "Show":
        i = cls()
        i.user_id = user_id
        return i


class GetFollowers:
    user_id: str = None
    page: int = 0
    max_id: str = None
    rank_token: str = None
    search_surface: str = 'follow_list_page'

    @classmethod
    def create(cls, user_id: str) -> "GetFollowers":
        i = cls()
        i.user_id = user_id
        i.rank_token = uuid.uuid4()
        return i


class GetFollowing:
    user_id: str = None
    page: int = 0
    max_id: str = None
    rank_token: str = None
    search_surface: str = 'follow_list_page'

    @classmethod
    def create(cls, user_id: str) -> "GetFollowing":
        i = cls()
        i.user_id = user_id
        i.rank_token = uuid.uuid4()
        return i


class PendingRequests:
    @classmethod
    def create(cls):
        return cls()


class ApproveRequest:
    surface: str = 'follow_requests'
    radio_type: str = 'wifi-none'
    user_id: str = None
    _csrftoken: str = None
    _uid: str = None
    _uuid: str = None

    @classmethod
    def create(cls, user_id, **kwargs):
        i = cls()
        for k, v in kwargs.items():
            if hasattr(i, k):
                setattr(i, k, v)
            else:
                logger.warning("{} was sent as a keyword argument, but isn't supported.")
        i.user_id = user_id
        return i
