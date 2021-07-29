import uuid
from typing import Tuple, Union

import requests

from instauto.api.actions.structs.feed import FeedGet
from instauto.api.actions.stub import StubMixin
from instauto.api.structs import Method


class FeedMixin(StubMixin):
    def feed_get(self, obj: FeedGet) -> Tuple[Union[FeedGet], requests.Response]:
        as_dict = obj.fill(self).to_dict()
        as_dict['request_id'] = str(uuid.uuid4())
        resp = self._request('feed/timeline/', Method.POST, body=as_dict)

        data = self._json_loads(resp.text)
        if obj.reason == 'cold_start_fetch':
            obj.reason = 'pagination'

        # pyre-ignore[6]
        obj.max_id = data['next_max_id']
        return obj, resp
