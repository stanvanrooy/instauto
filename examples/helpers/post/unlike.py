from instauto.api.client import ApiClient
from instauto.helpers.post import unlike_post 

client = ApiClient.initiate_from_file('.instauto.save')
unlike_post(client, "media_id")

