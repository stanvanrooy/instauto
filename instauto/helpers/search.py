from typing import List

from instauto.api.client import ApiClient
from instauto.api.actions import search as se


def search_username(client: ApiClient, username, count: int) -> List[dict]:
    username = se.Username(
        q=username,
        count=count
    )
    resp = client.search_username(username)
    return resp.json()['users']


def get_user_by_username(client: ApiClient, username: str) -> dict:
    users = search_username(client, username, 1)
    correct_user = [x for x in users if x['username'] == username]
    if correct_user:
        return correct_user[0]


def get_user_id_from_username(client: ApiClient, username: str):
    user = get_user_by_username(client, username)
    return user['pk']


def search_tags(client: ApiClient, tag: str, limit: int) -> List[dict]:
    s = se.Tag(tag, limit)
    resp: dict = client.search_tag(s).json()
    return resp['results']
