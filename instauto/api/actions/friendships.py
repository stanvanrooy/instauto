from requests import Session, Response
from typing import Union, Callable, Tuple, List
from .structs.friendships import Create, Destroy, Remove, Show, \
    GetFollowers, GetFollowing, PendingRequests, ApproveRequest
from ..structs import State, Method


class FriendshipsMixin:
    _session: Session
    state: State
    _request: Callable

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
        # doesn't use _friendship_act, because it is a GET request.
        data = obj.fill(self)
        return self._request(f"friendships/{data['endpoint']}/{data['user_id']}/", Method.GET)

    def followers_get(self, obj: Union[GetFollowing, dict]) -> Tuple[dict, Union[Response, bool]]:
        """Retrieves the followers of an Instagram user. Examples of how to use can be found in
        examples/friendships/get_followers.py.
        Returns
        ---------
        GetFollowers
            The object that was passed in as an argument, but with updated max_id and page attributes. DO NOT CHANGE
            THOSE ATTRIBUTES.
        Response || bool
            Returns the response if users were retrieved, returns False if no more users are available. If there were
            users available, the returned response will contain the following object:
            ```json
            {
              "big_list": true,
              "global_blacklist_sample": null,
              "next_max_id": "QVFDN1BnZWpkTTF1SWdkaWVfVzVYbHNJV2NjemFlX2lWV0tjTUVvUGM2bTZrVHdpeGVnSVA4eXBCQVJ1MUVWeXZBNHBvRmtXa3VvWkFoS09PSG1rdVIwMg==",
              "page_size": 200,
              "sections": null,
              "status": "ok",
              "users": [
                  {
                    "account_badges": [],
                    "full_name": "",
                    "has_anonymous_profile_picture": False,
                    "is_private": False,
                    "is_verified": False,
                    "latest_reel_media": 0,
                    "pk": *********,
                    "profile_pic_id": "*******",
                    "profile_pic_url": "******",
                    "username": "********"
                  }
                ]
              }
            }
            ```
        """
        if isinstance(obj, GetFollowers):
            data = obj.fill(self)
        else:
            data = obj
        if obj['max_id'] is None and data['page'] > 0:
            return obj, False
        query_params = {
            'search_surface': data['search_surface'],
            'order': 'default',
            'enable_groups': "true",
            "query": "",
            "rank_token": data['rank_token'],
        }
        if data['page'] > 0:  # make sure we don't include max_id on the first request
            query_params['max_id'] = data['max_id']
        resp = self._request(f'friendships/{data["user_id"]}/followers/', Method.GET, query=query_params)
        as_json = resp.json()
        data['max_id'] = as_json['next_max_id']
        data['page'] += 1
        return data, resp

    def following_get(self, obj: Union[GetFollowing, dict]) -> Tuple[dict, Union[Response, bool]]:
        """Retrieves the following of an Instagram user. Examples of how to use can be found in
        examples/friendships/get_following.py.
        Returns
        ---------
        GetFollowers
            The object that was passed in as an argument, but with updated max_id and page attributes. DO NOT CHANGE
            THOSE ATTRIBUTES.
        Response || bool
            Returns the response if users were retrieved, returns False if no more users are available. If there were
            users available, the returned response will contain the following object:
            ```json
            {
              "big_list": true,
              "global_blacklist_sample": null,
              "next_max_id": "200",
              "page_size": 200,
              "sections": null,
              "status": "ok",
              "users": [
                  {
                    "account_badges": [],
                    "full_name": "",
                    "has_anonymous_profile_picture": False,
                    "is_private": False,
                    "is_verified": False,
                    "latest_reel_media": 0,
                    "pk": *******,
                    "profile_pic_id": "*******",
                    "profile_pic_url": "******",
                    "username": "********"
                  }
                ]
              }
            ```
        """
        if isinstance(obj, GetFollowing):
            data = obj.fill(self)
        else:
            data = obj
        if data['max_id'] is None and data['page'] > 0:  # max_id get's set to None when there are no more results.
            return data, False
        query_params = {
            'search_surface': data['search_surface'],
            'query': '',
            'enable_groups': 'true',
            'rank_token': data['rank_token'],
        }
        if data['page'] > 0:  # make sure we don't include max_id on the first request
            query_params['max_id'] = data['max_id']
        resp = self._request(f'friendships/{data["user_id"]}/following/', Method.GET, query=query_params)
        as_json = resp.json()
        data['max_id'] = as_json['next_max_id']
        data['page'] += 1
        return data, resp

    def follow_requests_get(self, obj: PendingRequests) -> List[dict]:
        """
        Returns
        -------
        List[dict]
            A list which contains all pending follow requests. If successfull, it will return an list of the
            following structures:
            {
                "account_badges": [],
                "full_name": "",
                "has_anonymous_profile_picture": false,
                "is_private": true,
                "is_verified": false,
                "latest_reel_media": 0,
                "pk": 2097017052,
                "profile_pic_id": "",
                "profile_pic_url": "",
                "username": ""
              }
        """
        resp = self._request('friendships/pending/', Method.GET)
        parsed = resp.json()
        return parsed['users']

    def follow_request_approve(self, obj: ApproveRequest) -> Response:
        data = obj.fill(self)
        return self._request(f'friendships/approve/{data["user_id"]}/', Method.POST, data=data)

    def _friendships_act(self, obj: Union[Create, Destroy, Remove]) -> Response:
        data = obj.fill(self)
        return self._request(f'friendships/{data["endpoint"]}/{data["user_id"]}/', Method.POST, data=data, signed=True)
