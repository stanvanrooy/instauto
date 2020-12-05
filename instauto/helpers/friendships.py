from instauto.api.client import ApiClient
from instauto.api.actions.structs.friendships import GetFollowers, Create, GetFollowing
from instauto.helpers.search import get_user_id_from_username

import typing
import logging
logger = logging.getLogger(__name__)

from .common import is_resp_ok


def get_followers(client: ApiClient, user_id: str, limit: int) -> typing.List[dict]:
    obj = GetFollowers(user_id)

    obj, result = client.followers_get(obj)
    followers = []
    while result and len(followers) < limit:
        followers.extend(
            result.json()["users"]
        )
        logger.info("Retrieved {} followers, {} more to go.".format(len(followers), limit - len(followers)))
        obj, result = client.followers_get(obj)
    return followers[:min(len(followers), limit)]


def get_following(client: ApiClient, user_id: str, limit: int) -> typing.List[dict]:
    obj = GetFollowing(user_id)

    obj, result = client.following_get(obj)
    following = []
    while result and len(following) < limit:
        following.extend(
            result.json()["users"]
        )
        logger.info("Retrieved {} of following, {} more to go.".format(len(following), limit - len(following)))
        obj, result = client.followers_get(obj)
    return following[:min(len(following), limit)]


def follow_user(client: ApiClient, user_id: str = None, username: str = None) -> bool:
    if user_id is not None and username is not None:
        raise ValueError("Both `user_id` and `username` are provided.")

    if user_id is None and username is not None:
        user_id = get_user_id_from_username(client, username)

    if user_id is None:
        raise ValueError("Both `user_id` and `username` are not provided.")

    obj = Create(user_id)
    resp = client.user_follow(obj)
    return is_resp_ok(resp)
