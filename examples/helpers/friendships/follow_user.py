import os, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..', '..', '..'))
# Note: the above 2 lines are not necessary if you have installed the package.

from instauto.api.client import ApiClient
from instauto.helpers.friendships import follow_user

client = ApiClient.initiate_from_file('../../../.instauto.save')
# success = follow_user(client, user_id="user_id")
success = follow_user(client, username="instagram")
assert success

