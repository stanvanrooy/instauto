from instauto.api.client import ApiClient
from instauto.helpers.post import like_post

client = ApiClient.initiate_from_file('.instauto.save')
like_post(client, "media_id")

