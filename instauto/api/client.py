import logging
import uuid
import random
import hmac

import orjson
import requests
import base64
import time

from typing import Callable, Optional

# pyre-ignore[21]
from apscheduler.schedulers.background import BackgroundScheduler

from .actions.feed import FeedMixin
from .actions.helpers import HelperMixin
from .structs import IGProfile, DeviceProfile, State, Inbox
from .constants import (DEFAULT_IG_PROFILE, DEFAULT_DEVICE_PROFILE, DEFAULT_STATE)
from .exceptions import StateExpired, NoAuthDetailsProvided, CorruptedSaveData

from .actions.profile import ProfileMixin
from .actions.authentication import AuthenticationMixin
from .actions.post import PostMixin
from .actions.request import RequestMixin
from .actions.friendships import FriendshipsMixin
from .actions.search import SearchMixin
from .actions.challenge import ChallengeMixin
from .actions.direct import DirectMixin
from .actions.activity import ActivityMixin

logger = logging.getLogger(__name__)
logging.captureWarnings(True)


class ApiClient(ProfileMixin, AuthenticationMixin, PostMixin, RequestMixin, FriendshipsMixin,
                SearchMixin, ChallengeMixin, DirectMixin, HelperMixin, FeedMixin, ActivityMixin):
    breadcrumb_private_key = "iN4$aGr0m".encode()
    bc_hmac = hmac.HMAC(breadcrumb_private_key, digestmod='SHA256')

    def __init__(
        self, ig_profile: Optional[IGProfile] = None, device_profile: Optional[DeviceProfile] = None,
        state: Optional[State] = None, username: Optional[str] = None, password: Optional[str] = None,
        session_cookies: Optional[dict] = None, testing=False, _2fa_function: Optional[Callable[[str], str]] = None
    ) -> None:
        """Initializes all attributes. Can be instantiated with no params.

        Needs to be provided with either:
            1) state and session_cookies, to resume an old session, in this case all other params are optional
            2) username and password, in this case all other params are optional

        In the case that the class is initialized without params, or with a few of the params not provided,
        they will automatically be filled with default values from constants.py.

        Using the default values should be fine for pretty much all use cases, but if for some reason you need to use
        non-default values, that can be done by creating any of the profiles yourself and passing it in as an argument.
        """
        super().__init__()
        self._2fa_function = _2fa_function
        self._username = username
        self._raw_password = password
        self._encoded_password = None

        self._init_ig_profile(ig_profile)
        self._init_device_profile(device_profile)
        self._init_state(state)
        self._user_agent = self._build_user_agent()

        if (username is None or password is None) and (state is None or session_cookies is None) and not testing:
            raise NoAuthDetailsProvided("Username, password and state are all not provided.")

        self._init_session(session_cookies, testing)
        self._request_finished_callbacks = [self._update_state_from_headers]
        self._init_scheduler()

    def _init_state(self, state) -> None:
        if state is not None and not state.valid:
            logger.warning("The state argument was provided, but the object provided is no longer valid.")
            raise StateExpired()
        elif state is None:
            self.state = State(**DEFAULT_STATE)
            self.state.fill(self._gen_uuid)
            logger.info("No state provided. Using default state.")
        elif state is not None:
            self.state = state
            self.state.refresh(self._gen_uuid)

    def _init_device_profile(self, device_profile) -> None:
        if not device_profile:
            device_profile = DeviceProfile(**DEFAULT_DEVICE_PROFILE)
        self.device_profile = device_profile

    def _init_ig_profile(self, ig_profile) -> None:
        if not ig_profile:
            ig_profile = IGProfile(**DEFAULT_IG_PROFILE)
        self.ig_profile = ig_profile

    def _init_session(self, session_cookies, testing: bool) -> None:
        self._session = requests.Session()
        if session_cookies is not None:
            for k, v in session_cookies.items():
                self._session.cookies.set_cookie(
                    requests.cookies.create_cookie(
                        name=k, value=v
                    )
                )
        if testing:
            self._session.cookies['csrftoken'] = "test"

    def _init_scheduler(self):
        self.scheduler = BackgroundScheduler()
        self.scheduler.add_job(self._refresh_session, trigger='interval', seconds=60 * 5, jitter=60 * 2)
        self.scheduler.start()

    def _grab_cookies(self) -> dict:
        return self._session.cookies.get_dict()

    def save_to_disk(self, file_name: str, overwrite: Optional[bool] = None) -> bool:
        cookies = self._grab_cookies()
        overwrite = overwrite or False

        try:
            f = open(file_name, "w" if not overwrite else "w+")
            state_as_dict = self.state.__dict__
            try:
                logged_in_data = state_as_dict.pop('logged_in_account_data').__dict__
            except KeyError:
                logged_in_data = {}

            as_json = self._json_dumps({
                'State': state_as_dict,
                'IGProfile': self.ig_profile.__dict__,
                'DeviceProfile': self.device_profile.__dict__,
                'LoggedInAccountData': logged_in_data,
                'session.cookies': cookies
            })
            f.write(as_json)
        except Exception as e:
            return False
        finally:
            f.close()
        return True

    @classmethod
    def initiate_from_file(cls, file_name: str) -> "ApiClient":
        with open(file_name, "rb") as f:
            try:
                data = orjson.loads(f.read())
            except orjson.JSONDecodeError:
                raise CorruptedSaveData(f"Save file {file_name} couldn't be parsed.")
        state = data['State']
        state['logged_in_account_data'] = data['LoggedInAccountData']
        ig_profile = data['IGProfile']
        device_profile = data['DeviceProfile']

        data['session.cookies'].pop('csrftoken')
        i = cls(IGProfile(**ig_profile), DeviceProfile(**device_profile), State(**state), session_cookies=data['session.cookies'])
        i._update_token()
        i._sync()
        return i

    @staticmethod
    # pyre-ignore[40]: invalid override
    def _gen_uuid() -> str:
        return str(uuid.uuid4())

    def _generate_user_breadcrumb(self, comment_length: int) -> str:
        """Generates the user_breadcrumb, which is necessary for posting comments. The breadcrumb stores information
        in the following format: `{length of comment} {time to type} {backspaces count} {current time in ms}`.
        """
        msg = f"{comment_length} {random.uniform(.3, .5) * 1000 * comment_length} " \
              f"{int(comment_length / random.randint(3, 6))} {int(round(time.time() * 1000))}"
        self.bc_hmac.update(msg.encode())
        return base64.b64encode(self.bc_hmac.digest()).decode()
