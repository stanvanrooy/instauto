from . import common as cmmn
import logging

from instauto.api.structs import WhichGender

from typing import Optional

logger = logging.getLogger(__name__)


class SetGender(cmmn.Base):
    _csrftoken: str = None
    _uuid: str = None

    def __init__(self, gender: Optional[WhichGender] = None, custom_gender: Optional[str] = None, *args, **kwargs):
        if gender is None and custom_gender is None:
            raise ValueError("Either gender or custom_gender needs to be provided")

        self.gender = gender
        self.custom_gender = custom_gender
        super().__init__(*args, **kwargs)


class SetBiography(cmmn.Base):
    _csrftoken: str = None
    _uid: str = None
    _uuid: str = None

    def __init__(self, raw_text: str, *args, **kwargs):
        self.raw_text = raw_text
        super().__init__(*args, **kwargs)


class Update(cmmn.Base):
    _csrftoken: str = None
    _uid: str = None  # user id
    _uuid: str = None
    raw_text: str = None

    def __init__(self, external_url: Optional[str], phone_number: Optional[str] = None, username: Optional[str] = None,
                 first_name: Optional[str] = None, email: Optional[str] = None, *args, **kwargs):
        if all([not x for x in [external_url, phone_number, username, first_name, email]]):
            raise ValueError("No value(s) to update provided.")
        self.external_url = external_url
        self.phone_number = phone_number
        self.username = username
        self.first_name = first_name
        self.email = email
        super().__init__(*args, **kwargs)


class Info(cmmn.Base):
    def __init__(self, user_id: int, *args, **kwargs):
        self.user_id = user_id
        super().__init__(*args, **kwargs)
