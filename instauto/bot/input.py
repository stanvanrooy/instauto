from typing import Callable, List, Dict, Optional
from instauto.api.client import ApiClient
from instauto.helpers.friendships import get_followers, get_following
from instauto.helpers.search import get_user_id_from_username
from instauto.helpers.post import get_likers_of_post, get_commenters_of_post
from instauto.helpers.post import retrieve_posts_from_user


class Input:
    _input: List[Callable]
    _client: ApiClient
    _post_cache: Dict[str, List[Dict]] = {}
    _accounts: List[dict] = []

    def __init__(self, client: ApiClient):
        self._client = client

    def from_following_of(self, account_name: str, limit: int) -> "Input":
        """Retrieves accounts that `account_name` follows.

        Args:
            account_name: the account to retrieve from
            limit: the amount of accounts to retrieve
        """
        following = get_following(self._client, get_user_id_from_username(self._client, account_name), limit)
        self._accounts.extend(following)
        return self

    def from_followers_of(self, account_name: str, limit: int) -> "Input":
        """Retrieves accounts that follow `account_name`.

        Args:
            account_name: the account to retrieve from
            limit: the amount of accounts to retrieve
        """
        followers = get_followers(self._client, get_user_id_from_username(self._client, account_name), limit)
        self._accounts.extend(followers)
        return self

    def from_likers_of(self, account_name: str, limit: int) -> "Input":
        """Retrieves accounts that have liked recent posts of `account_name`.

        Args:
            account_name: the account to retrieve from
            limit: the amount of accounts to retrieve
        """
        likers = []
        posts = self._get_posts(account_name)
        for post in posts:
            likers.extend(get_likers_of_post(self._client, post['id']))
            if len(likers) > limit:
                break
        self._post_cache[account_name] = posts
        self._accounts.extend(likers[:limit:])
        return self

    def from_commenters_of(self, account_name: str, limit: int) -> "Input":
        """Retrieves accounts that have commented on recent posts of `account_name`.

        Args:
            account_name: the account to retrieve from
            limit: the amount of accounts to retrieve
        """
        commenters = []
        posts = self._get_posts(account_name)
        for post in posts:
            commenters.extend(get_commenters_of_post(self._client, post['id']))
            if len(commenters) > limit:
                break
        self._accounts.extend(commenters[:limit:])
        return self

    @property
    def filtered_accounts(self) -> List[dict]:
        seen = []
        return list(filter(lambda x: x['id'] not in seen and seen.append(x['id']) is None, self._accounts))

    def _get_posts(self, account_name: str, force: bool = False) -> List[Dict]:
        if account_name not in self._post_cache or force:
            self._post_cache[account_name] = retrieve_posts_from_user(self._client, 30, account_name)
        return self._post_cache.get(account_name)
