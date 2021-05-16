from instauto.api.client import ApiClient
import instauto.api.actions.structs.post as ps

client = ApiClient.initiate_from_file(".instauto.save")

# Any of the below examples will work.
# location = ps.Location(lat=38.897699584711, lng=-77.036494857373)
# location = ps.Location(name="The white house")
location = ps.Location(lat=68.14259, lng=148.84371, name="The white house")
post = ps.PostFeed(
    path='./test_feed.jpg',
    caption='Hello from Instauto!',
    location=location
)

response = client.post_post(post, 80)

