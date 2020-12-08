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
        """Initiate a new `Bot` instance.

        Args:
            user_name: the username of the account
            password: the password of the account
            delay_between_action: the amount of seconds to wait between actions (each like, follow, etc. is an action)
        """
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
        """Like posts of users retrieved with the Input pipeline.

        Args:
            chance: integer between 0 and 100, represents a percentage between 0 and 100%.
                Defines the chance of this action being called for an account. Set to
                25 to call on 1/4 of all accounts, 50 for 1/2 of all accounts, etc.
            amount:
                The amount of posts to like, if this action is being called for an account.
        """
        self._actions.append({
            'func': like_post,
            'chance': chance,
            'amount': amount,
            'args': ('POST_ID', )
        })
        return self

    def comment(self, chance: int, amount: int, comments: List[str]) -> "Bot":
        """Comment on posts of users retrieved with the Input pipeline.

        Args:
            chance: integer between 0 and 100, represents a percentage between 0 and 100%.
                Defines the chance of this action being called for an account. Set to
                25 to call on 1/4 of all accounts, 50 for 1/2 of all accounts, etc.
            amount:
                The amount of posts to comment on, if this action is being called for an account.
            comments:
                A random selected entry out of this list will be used as text to comment.
        """
        self._actions.append({
            'func': comment_post,
            'chance': chance,
            'amount': amount,
            'args': ('POST_ID', (random.choice, comments))
        })
        return self

    def follow(self, chance: int) -> "Bot":
        """Follow users retrieved with the Input pipeline.

        Args:
            chance: integer between 0 and 100, represents a percentage between 0 and 100%.
                Defines the chance of this action being called for an account. Set to
                25 to call on 1/4 of all accounts, 50 for 1/2 of all accounts, etc.
        """
        self._actions.append({
            'func': follow_user,
            'chance': chance,
            'args': ('ACCOUNT_ID', )
        })
        return self

    def start(self):
        """Start the bot.

        Once the bot is started, it will run until it went through all retrieved accounts,
        or if the `stop` attribute is set to `True`."""
        accounts = self.input.filtered_accounts
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
