import logging
import uuid
import random
import hmac
import requests
import base64
import time
import json

from apscheduler.schedulers.background import BackgroundScheduler

from .structs import IGProfile, DeviceProfile, State
from .constants import (DEFAULT_IG_PROFILE, DEFAULT_DEVICE_PROFILE, DEFAULT_STATE)
from .exceptions import StateExpired, NoAuthDetailsProvided, CorruptedSaveData

from .actions.profile import ProfileMixin
from .actions.authentication import AuthenticationMixin
from .actions.post import PostMixin
from .actions.request import RequestMixin
from .actions.friendships import FriendshipsMixin
from .actions.search import SearchMixin
from .actions.challenge import ChallengeMixin

logger = logging.getLogger(__name__)
logging.captureWarnings(True)


class ApiClient(ProfileMixin, AuthenticationMixin, PostMixin, RequestMixin, FriendshipsMixin, SearchMixin, ChallengeMixin):
    """Class used to access all features, in an ideal situation this is the only class that needs to be imported (
    along with the structs)"""
    breadcrumb_private_key = "iN4$aGr0m".encode()
    bc_hmac = hmac.HMAC(breadcrumb_private_key, digestmod='SHA256')

    def __init__(self, ig_profile: IGProfile = None, device_profile: DeviceProfile = None, state: State = None,
                 user_name: str = None, password: str = None, session_cookies: dict = None, testing=False):
        """Initializes all attributes. Can be instantiated with no params.

        Needs to be provided with either:
            1) state and session_cookies, to resume an old session, in this case all other params are optional
            2) user_name and password, in this case all other params are optional

        In the case that the class is initialized without params, or with a few of the params not provided,
        they will automatically be filled with default values from constants.py.

        Using the default values should be fine for pretty much all use cases, but if for some reason you need to use
        non-default values, that can be done by creating any of the profiles yourself and passing it in as an argument.

        Parameters
        ----------
        ig_profile : IGProfile
            Reference to the IGProfile used.
        device_profile : DeviceProfile
            Reference to the DeviceProfile used.
        state : State
            Reference to the State used
        user_name : str
        password : str
        session_cookies : dict
            Dictionary containing all cookies from a session.
        """

        if not ig_profile:
            ig_profile = IGProfile(**DEFAULT_IG_PROFILE)
        self.ig_profile = ig_profile

        if not device_profile:
            device_profile = DeviceProfile(**DEFAULT_DEVICE_PROFILE)
        self.device_profile = device_profile

        self.state = state
        if state is not None and not state.valid:
            logger.warning("The state argument was provided, but the object provided is no longer valid.")
            if not user_name or not password:
                raise StateExpired()
        elif state is None:
            self.state = State(**DEFAULT_STATE)
            self.state.fill(self._gen_uuid)
            logger.info("No state provided. Logging in...")
        else:
            self.state.refresh(self._gen_uuid)

        if (user_name is None or password is None) and (state is None or session_cookies is None) and not testing:
            raise NoAuthDetailsProvided("username, password and state are all not provided.")

        self._user_name = user_name

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

        self._unencrypted_password = password
        self._encrypted_password = None

        self._user_agent = self._build_user_agent()
        self._request_finished_callbacks = [self._update_state_from_headers]

        self.scheduler = BackgroundScheduler()

        # update session id every 40 - 80 minutes
        self.scheduler.add_job(self._update_session_id, trigger='interval', seconds=60*60, jitter=60*20)

    def _grab_cookies(self) -> dict:
        """Retrieves all cookies from a session.
        Returns
        -------
        dict
            Contains all cookies.
        """
        return self._session.cookies.get_dict()

    def save_to_disk(self, file_name: str, over_write=None) -> bool:
        """Saves the current ig_profile, device_profile, state and the session cookies in JSON format. This save file is
        used again when you want to resume a session.
        Parameters
        ----------
        file_name : str,
            Specifies where to file the save to
        over_write : bool
            Specifies if `w` or `w+` is used as mode to open the file. Defaults to False. If False, the function
            expects that the file already exists.
        Returns
        -------
        bool
            True if saved successfully, else False.
        """
        cookies = self._grab_cookies()

        if over_write is None: over_write = False
        else: over_write = True

        try:
            with open(file_name, "w" if not over_write else "w+") as f:
                state_as_dict = self.state.__dict__
                try:
                    logged_in_data = state_as_dict.pop('logged_in_account_data').__dict__
                except KeyError: logged_in_data = {}
                json.dump({
                    'State': state_as_dict,
                    'IGProfile': self.ig_profile.__dict__,
                    'DeviceProfile': self.device_profile.__dict__,
                    'LoggedInAccountData': logged_in_data,
                    'session.cookies': cookies
                }, f)
        except Exception as e:
            logger.exception(e)
            return False
        return True

    @classmethod
    def initiate_from_file(cls, file_name: str) -> "ApiClient":
        """Creates an instance of this class from a save file.
        Parameters
        ----------
        file_name : str
            The path to the save file
        Returns
        -------
        ApiClient
            An instance of this class, initiated with all values stored in the save file.
        """
        with open(file_name, "rb") as f:
            try:
                data = json.load(f)
            except json.JSONDecodeError:
                raise CorruptedSaveData(f"Save file {file_name} couldn't be parsed.")
        state = data['State']
        state['logged_in_account_data'] = data['LoggedInAccountData']
        ig_profile = data['IGProfile']
        device_profile = data['DeviceProfile']

        i = cls(IGProfile(**ig_profile), DeviceProfile(**device_profile), State(**state), session_cookies=data['session.cookies'])
        return i

    @staticmethod
    def _gen_uuid() -> str:
        """Generates a random UUID."""
        return str(uuid.uuid4())

    def _generate_user_breadcrumb(self, comment_length: int) -> str:
        """Generates the user_breadcrumb, which is necessary for posting comments. The breadcrumb stores information
        in the following format: `{length of comment} {time to type} {backspaces count} {current time in ms}.

        The breadcrumb gets encoded with the `breadcrumb_private_key`, which can be extracted from
        Parameters
        ----------
        comment_length : int
            Length of the comment to post
        Returns
        -------
        str
            A base64 encoded, encoded breadcrumb.
        """
        msg = f"{comment_length} {random.uniform(.3, .5) * 1000 * comment_length} " \
              f"{int(comment_length / random.randint(3, 6))} {int(round(time.time() * 1000))}"
        self.bc_hmac.update(msg.encode())
        return base64.b64encode(self.bc_hmac.digest()).decode()
