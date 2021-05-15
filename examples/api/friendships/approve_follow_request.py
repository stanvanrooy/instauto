from instauto.api.client import ApiClient
import instauto.api.actions.friendships as fs

client = ApiClient.initiate_from_file('.instauto.save')

obj = fs.PendingRequests()
follow_request = client.follow_requests_get(obj)[0]

obj = fs.ApproveRequest(follow_request['pk'])
client.follow_request_approve(obj)

