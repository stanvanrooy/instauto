from instauto.api.client import ApiClient
import instauto.api.actions.structs.feed as feed

client = ApiClient.initiate_from_file('.instauto.save')

# Instauto has an `feed_get` endpoint for retrieving images, videos and ads from your feed. The 
# endpoint, returns two values. The input object, and the retrieved response. You can re-use
# the input object, to enable pagination: 
obj = feed.FeedGet()
obj, response = client.feed_get(obj)

posts = response.json()['feed_items']

# Let's retrieve the first 50 items from your feed.
while response and len(posts) < 50:
  # We check if the response is 'truthy'. This is important, since it will be `False` if
  # there are no more items to retrieve from your feed.
  obj, response = client.feed_get(obj)
  posts.extend(response.json()['feed_items'])

