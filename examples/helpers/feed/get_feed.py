import os, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..', '..', '..'))
# Note: the above 2 lines are not necessary if you have installed the package.

from instauto.api.client import ApiClient
from instauto.helpers.feed import get_feed

client = ApiClient.initiate_from_file('../../../.instauto.save')
posts = get_feed(client, 10)
assert posts is not None
assert len(posts) == 10

print(posts[0].id)

