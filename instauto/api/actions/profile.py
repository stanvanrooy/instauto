from requests import Session, Response
from typing import Callable, Union, Dict
from instauto.api.actions.stubs import _request

from ..structs import IGProfile, State, DeviceProfile, Method
from .structs.profile import SetGender, SetBiography, Update, Info


class ProfileMixin:
    """Handles everything related to updating an Instagram profile."""
    _session: Session
    ig_profile: IGProfile
    state: State
    device_profile: DeviceProfile
    _request: _request
    _gen_uuid: Callable
    _generate_user_breadcrumb: Callable

    def _profile_act(self, obj: Union[Update, SetBiography, SetGender]) -> Response:
        # retrieve the existing data for all profile data fields
        current_data = self._request('accounts/current_user/', Method.GET, query={'edit': 'true'}).json()
        # ensure we don't overwrite existing data to nothing
        if obj.phone_number is None: obj.phone_number = current_data['user']['phone_number']
        if obj.first_name is None: obj.first_name = current_data['user']['full_name']
        if obj.external_url is None: obj.external_url = current_data['user']['external_url']
        if obj.email is None: obj.email = current_data['user']['email']
        if obj.biography is None: obj.biography = current_data['user']['biography']
        if obj.username is None: obj.username = current_data['user']['trusted_username']

        endpoint = 'accounts/edit_profile/'
        return self._request(endpoint, Method.POST, data=obj.to_dict(), signed=True)

    def profile_set_biography(self, obj: SetBiography) -> Response:
        """Sets the biography of the currently logged in user"""
        return self._request('accounts/set_biography/', Method.POST, data=obj.to_dict())

    def profile_set_gender(self, obj: SetGender) -> Response:
        """Sets the gender of the currently logged in user"""
        return self._request('accounts/set_gender/', Method.POST, data=obj.to_dict(), signed=False)

    def profile_update(self, obj: Update):
        """Updates the name, username, email, phone number and url for the currently logged in user."""
        self._profile_act(obj)

    def profile_info(self, obj: Info) -> Union[Dict, int]:
        if obj.user_id is None:
            obj.user_id = self.state.user_id
        data = self._request(f'users/{obj.user_id}/info/', Method.GET).json()
        if data['status'] == 'ok':
            return data['user']
        return data['status']
