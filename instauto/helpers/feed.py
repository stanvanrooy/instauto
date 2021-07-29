from typing import List
import logging

import orjson

from instauto.api.actions.structs.feed import FeedGet
from instauto.api.client import ApiClient

from instauto.helpers import models

logging.basicConfig()
logger = logging.getLogger(__name__)


def get_feed(client: ApiClient, limit: int) -> List[models.Post]:
    ret = []
    obj = FeedGet()

    while len(ret) < limit:
        obj, resp = client.feed_get(obj)
        data = orjson.loads(resp.text)
        items = list(filter(lambda i: 'media_or_ad' in i, data['feed_items']))
        logger.info("Retrieved {} posts, {} more to go.".format(
            len(ret), limit - len(ret))
        )
        if len(items) == 0:
            break
        ret.extend(items)
    return [models.Post.parse(p) for p in ret]
