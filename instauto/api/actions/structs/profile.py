from . import common as cmmn
import logging

from instauto.api.structs import WhichGender

from typing import Optional

logger = logging.getLogger(__name__)


class SetGender(cmmn.Base):
    _csrftoken: str = ''
    _uuid: str = ''
    biography: Optional[str] = None

    def __init__(self, gender: Optional[WhichGender] = None, custom_gender: Optional[str] = None, *args, **kwargs):
        if gender is None and custom_gender is None:
            raise ValueError("Either gender or custom_gender needs to be provided")

        self.gender = gender
        self.custom_gender = custom_gender or ""
        super().__init__(*args, **kwargs)


class SetBiography(cmmn.Base):
    _csrftoken: Optional[str] = None
    _uid: Optional[str] = None
    _uuid: Optional[str] = None

    def __init__(self, raw_text: str, *args, **kwargs):
        self.raw_text = raw_text
        super().__init__(*args, **kwargs)


class Update(cmmn.Base):
    _csrftoken: Optional[str] = None
    _uid: Optional[str] = None
    _uuid: Optional[str] = None
    biography: Optional[str] = None

    def __init__(self, external_url: Optional[str], phone_number: Optional[str] = None, username: Optional[str] = None,
                 first_name: Optional[str] = None, email: Optional[str] = None, *args, **kwargs):
        self.external_url = external_url
        self.phone_number = phone_number
        self.username = username
        self.first_name = first_name
        self.email = email
        super().__init__(*args, **kwargs)


class Info(cmmn.Base):
    def __init__(self, user_id: Optional[int] = None, username: Optional[str] = None, *args, **kwargs):
        if not (user_id or username):
            raise ValueError("Argument required for either user_id or username.")
        self.user_id = user_id
        self.username = username
        super().__init__(*args, **kwargs)

    @property
    def endpoint(self):
        if self.user_id:
            return f'users/{self.user_id}/info/'
        elif self.username:
            return f'users/{self.username}/usernameinfo/'


class SetPicture(cmmn.Base):
    _csrftoken: Optional[str] = None
    _uuid: Optional[str] = None

    def __init__(self, upload_id: int, *args, **kwargs):
        self.upload_id = upload_id
        self.use_fbuploader = True
        super().__init__(*args, **kwargs)
