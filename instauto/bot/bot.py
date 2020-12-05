import os
import random
import logging
from time import sleep
from typing import List, Dict, Tuple

from instauto.api.client import ApiClient
from instauto.api.exceptions import AuthorizationError
from instauto.bot.input import Input
from instauto.helpers.friendships import follow_user
from instauto.helpers.post import like_post, comment_post, retrieve_posts_from_user

logger = logging.getLogger(__name__)


class Bot:
    stop: bool = False
    input: Input
    _actions: List = []
    _post_cache: Dict[str, List[Dict]] = {}

    def __init__(self, user_name: str, password: str, delay_between_action: float = 2.0) -> None:
        instauto_save_path = f'.{user_name}.instauto.save'
        if os.path.isfile(instauto_save_path):
            self._client = ApiClient.initiate_from_file(instauto_save_path)
        else:
            self._client = ApiClient(user_name=user_name, password=password)
            self._client.login()
            self._client.save_to_disk(instauto_save_path)

        self.input = Input(self._client)
        self._actions = []
        self._delay = delay_between_action

    def like(self, chance: int, amount: int) -> "Bot":
        self._actions.append({
            'func': like_post,
            'chance': chance,
            'amount': amount,
            'args': ('POST_ID', )
        })
        return self

    def comment(self, chance: int, amount: int, comments: List[str]) -> "Bot":
        self._actions.append({
            'func': comment_post,
            'chance': chance,
            'amount': amount,
            'args': ('POST_ID', (random.choice, comments))
        })
        return self

    def follow(self, chance: int) -> "Bot":
        self._actions.append({
            'func': follow_user,
            'chance': chance,
            'args': ('ACCOUNT_ID', )
        })
        return self

    def start(self):
        accounts = self.input.accounts
        while not self.stop:
            sleep(self._delay)
            account = accounts.pop(random.randint(0, len(accounts) - 1))
            for action in self._actions:
                if random.randint(0, 100) > action['chance']:
                    continue

                t = action['args'][0]
                if t == 'POST_ID':
                    posts = self._get_posts(account['username'])
                    for _ in range(action['amount']):
                        if not posts:
                            continue
                        post = posts.pop(random.randint(0, len(posts) - 1))
                        args = self._resolve_args(action['args'], post=post)
                        try:
                            action['func'](self._client, *args)
                        except Exception as e:
                            logger.warning("Caught exception: ", e)
                elif t == 'ACCOUNT_ID':
                    args = self._resolve_args(action['args'], account=account)
                    try:
                        action['func'](self._client, *args)
                    except Exception as e:
                        logger.warning("Caught exception: ", e)

    def _get_posts(self, account_name: str, force: bool = False) -> List[Dict]:
        if account_name not in self._post_cache or force:
            try:
                self._post_cache[account_name] = retrieve_posts_from_user(self._client, 30, account_name)
            except AuthorizationError:
                logger.info(f"Can't retrieve posts from {account_name}. This is a private account.")
        return self._post_cache.get(account_name)

    @staticmethod
    def _resolve_args(args: Tuple, post: Dict = None, account: Dict = None) -> List:
        a = list()
        for arg in args:
            if isinstance(arg, tuple) and callable(arg[0]):
                a.append(arg[0](*arg[1::]))
            else:
                a.append(arg)
        for i, arg in enumerate(a.copy()):
            if arg == 'POST_ID' and post is not None:
                a[i] = post['pk']
            elif arg == 'ACCOUNT_ID' and account is not None:
                a[i] = account['pk']
        return a
