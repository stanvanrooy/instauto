from requests import Response
from typing import Union, Dict

from .stub import StubMixin
from ..structs import Method
from .structs.profile import SetGender, SetBiography, Update, Info, SetPicture


class ProfileMixin(StubMixin):
    def _profile_act(self, obj: Union[Update, SetBiography, SetGender]) -> Response:
        # retrieve the existing data for all profile data fields
        current_data = self._request('accounts/current_user/', Method.GET, query={'edit': 'true'}).json()
        # ensure we don't overwrite existing data to nothing
        # TODO: fix Pyre ignores
        # pyre-ignore[16]
        if obj.phone_number is None: obj.phone_number = current_data['user']['phone_number']
        # pyre-ignore[16]
        if obj.first_name is None: obj.first_name = current_data['user']['full_name']
        # pyre-ignore[16]
        if obj.external_url is None: obj.external_url = current_data['user']['external_url']
        # pyre-ignore[16]
        if obj.email is None: obj.email = current_data['user']['email']
        # pyre-ignore[16]
        if obj.username is None: obj.username = current_data['user']['trusted_username']
        # pyre-ignore[16]
        if not isinstance(obj, SetBiography) or obj.biography is None:
            obj.biography = current_data['user']['biography_with_entities']['raw_text']

        endpoint = 'accounts/edit_profile/'
        obj.fill(self)
        return self._request(endpoint, Method.POST, body=obj.to_dict(), sign_request=True)

    def profile_set_biography(self, obj: SetBiography) -> Response:
        """Sets the biography of the currently logged in user"""
        obj.fill(self)
        return self._request('accounts/set_biography/', Method.POST, body=obj.to_dict())

    def profile_set_gender(self, obj: SetGender) -> Response:
        """Sets the gender of the currently logged in user"""
        obj.fill(self)
        return self._request('accounts/set_gender/', Method.POST, body=obj.to_dict(), sign_request=True)

    def profile_update(self, obj: Update):
        """Updates the name, username, email, phone number and url for the currently logged in user."""
        self._profile_act(obj)

    def profile_info(self, obj: Info) -> Union[Dict, int]:
        data = self._request(obj.endpoint, Method.GET).json()
        if data['status'] == 'ok':
            return data['user']
        return data['status']

    def profile_set_picture(self, obj: SetPicture) -> Response:
        def internal() -> None:
            """These requests are unrelated, but are always sent in the ig app."""
            self._request("accounts/current_user/?edit=true", Method.GET)
            self.profile_update(Update(None))

        internal()
        data = obj.to_dict()
        return self._request("accounts/change_profile_picture/", Method.POST, body=data)
