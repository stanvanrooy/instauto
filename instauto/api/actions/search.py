from requests import Response
from instauto.api.actions.stubs import _request
from .structs.search import Username
from ..structs import Method


class SearchMixin:
    _request: _request

    def search_username(self, obj: Username) -> Response:
        """
        Returns
        -------
        Response
            If successfull, the returned response will contain the following data:
            {
              "num_results": 1,
              "users": [
                {
                  "pk": 2283025667,
                  "username": "username",
                  "full_name": "",
                  "is_private": false,
                  "profile_pic_url": "",
                  "profile_pic_id": "",
                  "is_verified": false,
                  "has_anonymous_profile_picture": false,
                  "mutual_followers_count": 0,
                  "account_badges": [],
                  "social_context": "Following",
                  "search_social_context": "Following",
                  "friendship_status": {
                    "following": true,
                    "is_private": false,
                    "incoming_request": false,
                    "outgoing_request": false,
                    "is_bestie": false,
                    "is_restricted": false
                  },
                  "latest_reel_media": 0
                }
              ],
              "has_more": false,
              "rank_token": "1595729245333|a75fdfda41d0680dba5347ad65e0a5399bb2b83cd21f7cb8d95eaa8bb5e0ee03",
              "clear_client_cache": false,
              "status": "ok"
            }
          }
        """
        return self._request('users/search/', Method.GET, query=obj.__dict__)
