import os, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..', '..', '..'))
# Note: the above 2 lines are not necessary if you have installed the package.

from instauto.api.client import ApiClient
from instauto.helpers.friendships import unfollow_user

client = ApiClient.initiate_from_file('../../../.instauto.save')
# unfollow_user(client, user_id="user_id")
# or 
success = unfollow_user(client, username="instagram")
assert success
