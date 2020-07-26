from requests import Session, Response
from typing import Union, Callable, Tuple, List
from .structs.friendships import CreateFriendship, DestroyFriendship, RemoveFriendship, ShowFriendship, \
    ShowFriendshipFollowers, ShowFriendshipFollowing, PendingFollowRequests, ApproveFollowRequest
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
        """Follow a user"""
        return self._friendships_act(obj)

    def unfollow_user(self, obj: DestroyFriendship) -> Response:
        """Unfollow a user"""
        return self._friendships_act(obj)

    def remove_follower(self, obj: RemoveFriendship) -> Response:
        """Remove someone from your followers list, that is currently following you"""
        return self._friendships_act(obj)

    def show_follower(self, obj: ShowFriendship) -> Response:
        """Retrieve information about a user"""
        # doesn't use _friendship_act, because it is a GET request.
        return self._request(f"friendships/{obj.endpoint}/{obj.user_id}/", Method.GET)
    
    def get_followers(self, obj: ShowFriendshipFollowers) -> Tuple[ShowFriendshipFollowers, Union[Response, bool]]:
        """Retrieves the followers of an Instagram user. Examples of how to use can be found in
        examples/friendships/get_followers.py.
        Returns
        ---------
        ShowFriendshipFollowers
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
        if obj.max_id is None and obj.page > 0:
            return obj, False
        query_params = {
            'search_surface': obj.search_surface,
            'order': 'default',
            'enable_groups': "true",
            "query": "",
            "rank_token": obj.rank_token
        }
        if obj.page > 0:  # make sure we don't include max_id on the first request
            query_params['max_id'] = obj.max_id
        resp = self._request(f'friendships/{obj.user_id}/followers/', Method.GET, query=query_params)
        as_json = resp.json()
        obj.max_id = as_json['next_max_id']
        obj.page += 1
        return obj, resp

    def get_following(self, obj: ShowFriendshipFollowing) -> Tuple[ShowFriendshipFollowing, Union[Response, bool]]:
        """Retrieves the following of an Instagram user. Examples of how to use can be found in
        examples/friendships/get_following.py.
        Returns
        ---------
        ShowFriendshipFollowers
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
        if obj.max_id is None and obj.page > 0:  # max_id get's set to None when there are no more results.
            return obj, False
        query_params = {
            'search_surface': obj.search_surface,
            'query': '',
            'enable_groups': 'true',
            'rank_token': obj.rank_token,
        }
        if obj.page > 0:  # make sure we don't include max_id on the first request
            query_params['max_id'] = obj.max_id
        resp = self._request(f'friendships/{obj.user_id}/following/', Method.GET, query=query_params)
        as_json = resp.json()
        obj.max_id = as_json['next_max_id']
        obj.page += 1
        return obj, resp

    def get_follow_requests(self, obj: PendingFollowRequests) -> List[dict]:
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

    def approve_follow_request(self, obj: ApproveFollowRequest) -> Response:
        obj._csrftoken = self._session.cookies.get('csrftoken', domain='instagram.com')
        obj._uid = self.state.user_id
        obj._uuid = self.state.uuid
        return self._request(f'friendships/approve/{obj.user_id}/', Method.POST, data=obj.__dict__)
