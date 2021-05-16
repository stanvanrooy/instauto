from instauto.api.client import ApiClient
import instauto.api.actions.structs.post as ps

client = ApiClient.initiate_from_file('.instauto.save')
post = ps.PostStory(
  "./test-story.jpg"
)

response = client.post_post(post)

