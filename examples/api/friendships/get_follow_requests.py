from instauto.api.client import ApiClient
import instauto.api.actions.friendships as fs

client = ApiClient.initiate_from_file('.instauto.save')

obj = fs.PendingRequests()
follow_requests = client.follow_requests_get(obj)

