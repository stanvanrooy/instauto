from instauto.api.client import ApiClient
from instauto.helpers.post import update_caption

client = ApiClient.initiate_from_file('.instauto.save')
update_caption(client, "media_id", "Hello from Instauto!")

