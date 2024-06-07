import os, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..', '..', '..'))
# Note: the above 2 lines are not necessary if you have installed the package.

from instauto.api.client import ApiClient
from instauto.helpers.search import get_user_id_from_username
from instauto.helpers.friendships import get_followers

# Initiate the client
client = ApiClient.initiate_from_file('../../../.instauto.save')

# Get the user id by doing one of the below
# user_id = "user_id"
user_id = get_user_id_from_username(client, "instagram")

# And retrieve 10 followers 
followers = get_followers(client, user_id, 10)
assert followers is not None
assert len(followers) == 10
