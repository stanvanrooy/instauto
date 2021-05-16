from instauto.api.client import ApiClient
from instauto.helpers.post import comment_post

client = ApiClient.initiate_from_file('.instauto.save')
comment_post(client, "media_id", "Hello from Instauto!")

