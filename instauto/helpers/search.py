from typing import List

from instauto.api.client import ApiClient
from instauto.api.actions import search as se


def search_username(client: ApiClient, username, count: int) -> List[dict]:
    """Search a username on Instagram.

    Args:
        client: your `ApiClient`
        username: username to search
        count: amount of results to retrieve

    Returns:
        List of user objects (objects/user.json) that Instagram
        matched with the provider username
    """
    username = se.Username(
        q=username,
        count=count
    )
    resp = client.search_username(username)
    return resp.json()['users']


def get_user_by_username(client: ApiClient, username: str) -> dict:
    """Retrieve a user by username.

    Args:
        client: your `ApiClient`
        username: username to search for

    Returns:
        None if not found, else a user object (objects/user.json)
        containing the found user
    """
    users = search_username(client, username, 1)
    correct_user = [x for x in users if x['username'] == username]
    if correct_user:
        return correct_user[0]


def get_user_id_from_username(client: ApiClient, username: str):
    """Get the user id of a username.

    Args:
        client: your `ApiClient`
        username: username to search for

    Returns:
        None if not found, else a user id of the found user
    """
    user = get_user_by_username(client, username)
    return user.get('pk')


def search_tags(client: ApiClient, tag: str, limit: int) -> List[dict]:
    s = se.Tag(tag, limit)
    resp: dict = client.search_tag(s).json()
    return resp['results']
