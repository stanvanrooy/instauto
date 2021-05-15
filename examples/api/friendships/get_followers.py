from instauto.api.client import ApiClient
import instauto.api.actions.structs.friendships as fs

client = ApiClient.initiate_from_file('.instauto.save')

# Instauto has an `followers_get` endpoint for retrieving followers. The endpoint, returns 
# two values. The input object, and the retrieved response. You can re-use the input 
# object, to enable pagination: 
user_id = "12345678"
obj = fs.GetFollowers(user_id)
obj, response = client.followers_get(obj)

followers = response.json()['users']

# Let's retrieve the first 50 followers of the user.
while response and len(followers) < 50:
  # We check if the response is 'truthy'. This is important, since it will be `False` if
  # there are no more items to retrieve from your feed.
  obj, response = client.followers_get(obj)
  followers.extend(response.json()['users'])

