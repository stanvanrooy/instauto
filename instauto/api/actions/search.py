from requests import Response
from instauto.api.actions.stubs import _request
from .structs.search import Username,Tag
from ..structs import Method


class SearchMixin:
    _request: _request

    def search_username(self, obj: Username) -> Response:
        """Search for an username, returns n matching results.

        Returns:
            Response: contains an object: {'users': [user, user]}
        """
        return self._request('users/search/', Method.GET, query=obj.to_dict())

    def search_tag(self, obj: Tag) -> Response:
        """Search for an tag, returns n matching results.

        Returns:
            Response: contains an object: {'tags': [tag]}
        """
        return self._request('tags/search/', Method.GET, query=obj.to_dict())
