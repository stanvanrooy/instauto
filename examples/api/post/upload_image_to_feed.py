from instauto.api.client import ApiClient
import instauto.api.actions.structs.post as ps

client = ApiClient.initiate_from_file('.instauto.save')
post = ps.PostFeed(
  "./test-feed.jpg",
  "Hello from Instauto!"
)

response = client.post_post(post)

