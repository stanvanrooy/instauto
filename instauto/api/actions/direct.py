from requests import Session, Response
from typing import Callable, Union, Dict
from instauto.api.actions.stubs import _request

from ..structs import IGProfile, State, DeviceProfile, Method
from .structs.direct import Message, MediaShare, LinkShare, ProfileShare, \
        DirectPhoto, DirectVideo

class DirectMixin:
    """Handles everything related to
    Instagram direct message threads"""
    _session: Session
    ig_profile: IGProfile
    state: State
    device_profile: DeviceProfile
    _request: _request
    _gen_uuid: Callable
    _generate_user_breadcrumb: Callable

    def direct_inbox(self) -> Response:
        return self._request('direct_v2/inbox', Method.GET)

    def direct_thread(self, thread_id: str) -> Response:
        return self._request(f"direct_v2/threads/{thread_id}",
                             Method.GET)

    def direct_send(self, obj: Union[Message, MediaShare, LinkShare,
                    ProfileShare, DirectPhoto, DirectVideo]) -> Response:
        as_dict = obj.to_dict()
        return self._request(obj.endpoint, Method.POST,
                             data=as_dict)
