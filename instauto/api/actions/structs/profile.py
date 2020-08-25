import logging

from dataclasses import dataclass
from instauto.api.structs import WhichGender

logger = logging.getLogger(__name__)


class _Base:
    """Contains values that are pretty much shared across all API requests."""
    _csrftoken: str = None
    _uid: str = None  # user id
    _uuid: str = None
    device_id: str = None
    external_url: str = None
    phone_number: str = None
    username: str = None
    first_name: str = None
    biography: str = None
    email: str = None

    def _create(self, **kwargs):
        """Creates an instance of the class, this method should be overwritten in the individual classes with
        arguments that are required, so it is clear which arguments are needed for which action.

        If the class has an attribute, the default value can be overwritten by providing an argument named after the
        attribute. This is probably not used often, since the default values should work for basically all cases,
        but it is nice to have the option.
        """
        for k, v in kwargs.items():
            if hasattr(self, k):
                setattr(self, k, v)
            else:
                logger.warning("{} was sent as a keyword argument, but isn't supported.")


@dataclass
class SetGender(_Base):
    """Is used for specifying what to set the gender to"""
    custom_gender: str = None
    gender: int = None

    @classmethod
    def create(cls, gender: WhichGender, custom_gender: str = None, **kwargs) -> "SetGender":
        """
        Parameters
        ----------
        gender : WhichGender
            specifies which gender to set the profile to, if set to WhichGender.prefer_not_to_say the custom_gender
            argument is required.
        custom_gender : str
            what the custom gender should be. Only used if gender is set to WhichGender.custom
        kwargs
        """
        i = cls()
        if gender == WhichGender.other:
            i._create(gender=gender.value, custom_gender=custom_gender, **kwargs)
        else:
            i._create(gender=gender, **kwargs)
        return i


class SetBiography(_Base):
    raw_text: str = None

    @classmethod
    def create(cls, biography: str, **kwargs):
        """
        Parameters
        ----------
        biography : str
            The new biography
        """
        i = cls()
        i._create(raw_text=biography, **kwargs)
        return i


class Update(_Base):
    """Is used specifying to what to update the url, phone number, username, first name and email"""
    @classmethod
    def create(cls, external_url: str = None, phone_number: str = None, username: str = None, first_name: str = None,
               email: str = None, **kwargs):
        """If no params are provided, the profile will stay as it currently is. If one param is provided, that param
        is updated on the profile and the rest stays how it currently is, if you provide two params, two values in
        the profile are updated, etc.

        Parameters
        ----------
        external_url : str, optional
        phone_number : str, optional
        username : str, optional
        first_name : str, optional
        email : str, optional
        """
        i = cls()
        i._create(external_url=external_url, phone_number=phone_number, username=username, first_name=first_name,
                  email=email, **kwargs)
        return i


class Info:
    user_id: int = None

    @classmethod
    def create(cls, user_id: int = None) -> "Info":
        i = cls()
        i.user_id = user_id
        return i
