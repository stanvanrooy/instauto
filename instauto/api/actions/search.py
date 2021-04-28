from requests import Response
from .structs.search import Username, Tag
from .stub import StubMixin
from ..structs import Method


class SearchMixin(StubMixin):
    def search_username(self, obj: Username) -> Response:
        return self._request('users/search/', Method.GET, query=obj.to_dict())

    def search_tag(self, obj: Tag) -> Response:
        return self._request('tags/search/', Method.GET, query=obj.to_dict())
