from instauto.api.client import ApiClient
from instauto.helpers.search import get_user_id_from_username
from instauto.helpers.friendships import get_followers

# Initiate the client
client = ApiClient.initiate_from_file('.instauto.save')
# Get the user id by doing one of the below
user_id = "user_id"
user_id = get_user_id_from_username(client, "instagram")
# And retrieve 100 followers 
followers = get_followers(client, user_id, 100)

