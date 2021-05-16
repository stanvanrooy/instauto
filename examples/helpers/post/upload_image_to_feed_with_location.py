from instauto.api.client import ApiClient
from instauto.helpers.post import upload_image_to_feed
from instauto.api.actions.structs.post import Location

client = ApiClient.initiate_from_file('.instauto.save')
location = Location(name="The white house")
upload_image_to_feed(client, "./test-feed.jpg", "Hello from instauto!", location)

