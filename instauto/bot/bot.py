import os
import random
import logging
from time import sleep
from typing import List, Dict, Tuple, Optional

from instauto.api.client import ApiClient
from instauto.bot.input import Input
from instauto.helpers import models
from instauto.helpers.friendships import follow_user
from instauto.helpers.post import like_post, comment_post

logger = logging.getLogger(__name__)


class Bot:
    stop: bool = False
    input: Input
    _actions: List = []

    def __init__(
        self, username: Optional[str] = None, password: Optional[str] = None,
        client: Optional[ApiClient] = None, delay_between_action: float = 2.0,
        delay_variance: float = 0.0
    ) -> None:
        """Initiate a new `Bot` instance.

        Args:
            username: the username of the account
            password: the password of the account
            client: the `ApiClient` instance the Bot communicates with. If given, it will take precedence over credentials.
            delay_between_action: the amount of seconds to wait between actions (each like, follow, etc. is an action)
            delay_variance: the amount of variance to add to the delay. Delay will be random number between (delay - variance) - (delay + variance).
        """

        if client is not None:
            self._client = client
        elif username and password:
            self._initialize_client_from_credentials(username, password)
        else:
            raise Exception("Use either a username/password or an ApiClient")

        self.input = Input(self._client)
        self._actions = []
        self._delay = delay_between_action if(delay_between_action) else 0
        self._delay_variance = abs(delay_variance)
        
    def _initialize_client_from_credentials(self, username: str, password: str) -> None:
        instauto_save_path = f'.{username}.instauto.save'
        if os.path.isfile(instauto_save_path):
            self._client = ApiClient.initiate_from_file(instauto_save_path)
        else:
            self._client = ApiClient(username=username, password=password)
            self._client.log_in()
            self._client.save_to_disk(instauto_save_path)

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
            self._sleep_between_actions()
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
                  
    def _sleep_between_actions(self):
        min = (self._delay - self._delay_variance) if(self._delay - self._delay_variance) else 0
        max = self._delay + self._delay_variance
        sleeptime = round(random.uniform(min, max), 2)
        sleep(sleeptime)

    def _get_posts(self, account_name: str, force: bool = False) -> List[models.Post]:
        return self.input.get_posts(account_name, force)

    @staticmethod
    def _resolve_args(
        args: Tuple, post: Optional[models.Post] = None,
        account: Optional[models.User] = None
    ) -> List:
        a = list()
        for arg in args:
            if isinstance(arg, tuple) and callable(arg[0]):
                a.append(arg[0](*arg[1::]))
            else:
                a.append(arg)
        for i, arg in enumerate(a.copy()):
            if arg == 'POST_ID' and post is not None:
                a[i] = post.pk
            elif arg == 'ACCOUNT_ID' and account is not None:
                a[i] = account.pk
        return a

    @classmethod
    def from_client(cls, client: ApiClient, delay_between_action: float = 2.0, delay_variance: float = 0.0) -> "Bot":
        return cls("", "", client=client, delay_between_action=delay_between_action, delay_variance=delay_variance)
