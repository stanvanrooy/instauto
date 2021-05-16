from instauto.api.client import ApiClient
from instauto.helpers.post import save_post

client = ApiClient.initiate_from_file('.instauto.save')
save_post(client, "media_id")

