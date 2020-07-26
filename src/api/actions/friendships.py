from requests import Session, Response
from typing import Union, Callable
from .structs.friendships import CreateFriendship, DestroyFriendship, RemoveFriendship, ShowFriendship
from ..structs import State, Method


class FriendshipsMixin:
    _session: Session
    state: State
    _request: Callable

    def _friendships_act(self, obj: Union[CreateFriendship, DestroyFriendship, RemoveFriendship]) -> Response:
        obj._csrftoken = self._session.cookies['csrftoken']
        obj.device_id = self.state.device_id
        obj._uid = self.state.user_id
        obj._uuid = self.state.uuid
        as_d = obj.__dict__
        as_d['radio_type'] = obj.radio_type  # why does this get removed, even though it has a default value?

        return self._request(f'friendships/{obj.endpoint}/{obj.user_id}/', Method.POST, data=as_d, signed=True)

    def follow_user(self, obj: CreateFriendship) -> Response:
        return self._friendships_act(obj)

    def unfollow_user(self, obj: DestroyFriendship) -> Response:
        return self._friendships_act(obj)

    def remove_follower(self, obj: RemoveFriendship) -> Response:
        return self._friendships_act(obj)

    def show_follower(self, obj: ShowFriendship) -> Response:
        # doesn't use _friendship_act, because it is a GET request.
        return self._request(f"friendships/{obj.endpoint}/{obj.user_id}/", Method.GET)
