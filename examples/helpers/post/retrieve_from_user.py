from instauto.api.client import ApiClient
from instauto.helpers.post import retrieve_posts_from_user

client = ApiClient.initiate_from_file('.instauto.save')
posts = retrieve_posts_from_user(client, 100, username="instagram")
# or 
posts = retrieve_posts_from_user(client, 100, user_id="user_id")

