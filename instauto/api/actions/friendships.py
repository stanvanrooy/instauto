from requests import Response
from typing import Union, Tuple, List
from .structs.friendships import Create, Destroy, Remove, Show, \
    GetFollowers, GetFollowing, PendingRequests, ApproveRequest
from .stub import StubMixin
from ..structs import Method


class FriendshipsMixin(StubMixin):
    def user_follow(self, obj: Create) -> Response:
        """Follow a user"""
        return self._friendships_act(obj)

    def user_unfollow(self, obj: Destroy) -> Response:
        """Unfollow a user"""
        return self._friendships_act(obj)

    def follower_remove(self, obj: Remove) -> Response:
        """Remove someone from your followers list, that is currently following you"""
        return self._friendships_act(obj)

    def follower_show(self, obj: Show) -> Response:
        """Retrieve information about a user"""
        obj.fill(self)
        return self._request(f"friendships/{obj.endpoint}/{obj.user_id}", Method.GET)

    def followers_get(self, obj: GetFollowers) -> Tuple[GetFollowers, Union[Response, bool]]:
        """Retrieves the followers of an Instagram user.

        Returns
             (GetFollowers, Response || bool): A tuple that contains the object that was passed in
             as an argument, but with updated max_id and page attributes, and the response or False. If the
             second item is False, there were no more items available.
        """
        # pyre-ignore[7]
        return self._get_base(obj)

    def following_get(self, obj: GetFollowing) -> Tuple[GetFollowing, Union[Response, bool]]:
        """Retrieves the following of an Instagram user.

        Returns:
             (GetFollowing, Response || bool): A tuple that contains the object that was passed in
             as an argument, but with updated max_id and page attributes, and the response or False. If the
             second item is False, there were no more items available.
        """
        # pyre-ignore[7]
        return self._get_base(obj)

    def follow_requests_get(self, obj: PendingRequests) -> List[dict]:
        """Retrieve all follow requests"""
        resp = self._request('friendships/pending/', Method.GET)
        parsed = self._json_loads(resp.text)
        # pyre-ignore[6]
        return parsed['users']

    def follow_request_approve(self, obj: ApproveRequest) -> Response:
        """Accept a follow request/"""
        obj.fill(self)
        return self._request(f'friendships/approve/{obj.user_id}/', Method.POST, body=obj.to_dict())

    def _friendships_act(self, obj: Union[Create, Destroy, Remove]) -> Response:
        obj.fill(self)
        return self._request(f"friendships/{obj.endpoint}/{obj.user_id}/", Method.POST, body=obj.to_dict(), sign_request=True)

    def _get_base(self, obj: Union[GetFollowing, GetFollowers]) -> \
            Tuple[Union[GetFollowing, GetFollowers], Union[Response, bool]]:
        obj.fill(self)
        data = obj.to_dict()
        # pyre-ignore[58]
        if 'max_id' not in data and data.get('page', 0) > 0:
            return obj, False

        query_params = {
            'search_surface': obj.search_surface,
            'order': 'default',
            'enable_groups': "true",
            "query": "",
            "rank_token": obj.rank_token
        }
        # pyre-ignore[58]
        if data.get('page', 0) > 0:  # make sure we don't include max_id on the first request
            query_params['max_id'] = obj.max_id
        endpoint = 'friendships/{user_id}/followers/' if isinstance(obj, GetFollowers) else 'friendships/{user_id}/following/'
        resp = self._request(endpoint.format(user_id=obj.user_id), Method.GET, query=query_params)
        as_json = self._json_loads(resp.text)
        if 'next_max_id' not in as_json:
            return obj, False
        # pyre-ignore[6]
        obj.max_id = as_json['next_max_id']
        # pyre-ignore[58]
        obj.page = data.get('page', 0) + 1
        return obj, resp

