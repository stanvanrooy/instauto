from instauto.api.client import ApiClient
from instauto.helpers.post import upload_image_to_feed

client = ApiClient.initiate_from_file('.instauto.save')
upload_image_to_feed(client, "./test-feed.jpg", "Hello from instauto!")

