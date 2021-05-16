from instauto.api.client import ApiClient
import instauto.api.actions.structs.post as ps

client = ApiClient.initiate_from_file('.instauto.save')
post = ps.PostFeed(
  "./test-feed.jpg",
  "Hello from Instauto!",
  usertags=ps.UserTags([
    ps.UserTag("user_id", 0.2, 0.2)
  ])
)

response = client.post_post(post)

