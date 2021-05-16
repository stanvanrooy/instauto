from instauto.api.client import ApiClient
from instauto.helpers.post import get_likers_of_post

client = ApiClient.initiate_from_file('.instauto.save')
posts = get_likers_of_post(client, "media_id")

