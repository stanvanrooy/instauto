from instauto.api.client import ApiClient
from instauto.helpers.friendships import follow_user

client = ApiClient.initiate_from_file('.instauto.save')
follow_user(client, user_id="user_id")
# or 
follow_user(client, username="instagram")

