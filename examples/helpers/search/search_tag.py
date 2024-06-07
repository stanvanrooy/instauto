import os, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..', '..', '..'))
# Note: the above 2 lines are not necessary if you have installed the package.

from instauto.api.client import ApiClient
from instauto.helpers.search import search_tags

client = ApiClient.initiate_from_file('../../../.instauto.save')
users = search_tags(client, "instagram", 10)
assert users is not None
assert len(users) > 1

