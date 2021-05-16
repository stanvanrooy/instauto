from instauto.api.client import ApiClient
import instauto.api.actions.structs.post as ps

client = ApiClient.initiate_from_file('.instauto.save')
user_tags = ps.UserTags([
  ps.UserTag(
    "user_id",
    0.2,
    0.2
  )
])
posts = [
  ps.PostFeed(
    "./test-feed.jpg",
    "",
    usertags=user_tags
  ),
  ps.PostFeed(
    "./test-feed.jpg",
    "",
    usertags=user_tags
  ),
]

resp = client.post_carousel(posts, "Hello from Instauto!", 80)

