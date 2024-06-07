import os, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..', '..', '..'))
# Note: the above 2 lines are not necessary if you have installed the package.

from instauto.api.client import ApiClient
from instauto.helpers.post import retrieve_posts_from_user

client = ApiClient.initiate_from_file('../../../.instauto.save')
# posts = retrieve_posts_from_user(client, 10, user_id="user_id")
# or 
posts = retrieve_posts_from_user(client, 10, username="instagram")
assert posts is not None
assert len(posts) == 10

