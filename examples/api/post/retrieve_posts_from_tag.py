from instauto.api.client import ApiClient
import instauto.api.actions.structs.post as ps

client = ApiClient.initiate_from_file('.instauto.save')

# Instauto has an `feed_get` endpoint for retrieving images, videos and ads from your feed. The 
# endpoint, returns two values. The input object, and the retrieved response. You can re-use
# the input object, to enable pagination: 
obj = ps.RetrieveByTag("username")
obj, response = client.post_retrieve_by_tag(obj)
posts = response

# Let's retrieve the first 50 items posts from the tag.
while response and len(posts) < 25:
  # We check if the response is 'truthy'. This is important, since it will be `False` if
  # there are no more items to retrieve from your feed.
  obj, response = client.post_retrieve_by_tag(obj)
  posts.extend(response)

