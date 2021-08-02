from instauto.api.client import ApiClient
from instauto.helpers.post import retrieve_story_from_user

client = ApiClient.initiate_from_file('.instauto.save')
stories = retrieve_story_from_user(client, username='instagram')
# or
stories = retrieve_story_from_user(client, user_id=12345678)
