import requests

from instauto.api.actions.stub import StubMixin
from instauto.api.structs import Method
from instauto.api.actions.structs.activity import ActivityGet


class ActivityMixin(StubMixin):
    def activity_get(self, obj: ActivityGet) -> requests.Response:
      url = 'news/inbox'
      qp = {
        'mark_as_seen': obj.mark_as_seen
      }
      return self._request(url, Method.GET, query=qp)

