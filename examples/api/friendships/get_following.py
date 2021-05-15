from instauto.api.client import ApiClient
import instauto.api.actions.structs.friendships as fs

client = ApiClient.initiate_from_file('.instauto.save')

# Instauto has an `followers_get` endpoint for retrieving followers. The endpoint, returns 
# two values. The input object, and the retrieved response. You can re-use the input 
# object, to enable pagination: 
user_id = "12345678"
obj = fs.GetFollowing(user_id)
obj, response = client.following_get(obj)

following= response.json()['users']

# Let's retrieve the first 50 users following the user.
while response and len(following) < 50:
  # We check if the response is 'truthy'. This is important, since it will be `False` if
  # there are no more items to retrieve from your feed.
  obj, response = client.following_get(obj)
  following.extend(response.json()['users'])

