from instauto.api.client import ApiClient
import instauto.api.actions.structs.post as ps

client = ApiClient.initiate_from_file('.instauto.save')
posts = [
  ps.PostFeed(
    "./test-feed.jpg",
    ""
  ),
  ps.PostFeed(
    "./test-feed.jpg",
    ""
  ),
]

resp = client.post_carousel(posts, "Hello from Instauto!", 80)

