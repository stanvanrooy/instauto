from instauto.api.client import ApiClient
from instauto.helpers.feed import get_feed

client = ApiClient.initiate_from_file('.instauto.save')
posts = get_feed(client, 100)

