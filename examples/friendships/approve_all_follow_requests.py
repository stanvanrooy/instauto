import os

from instauto import ApiClient
from instauto import friendships as fs

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name="your_username", password="your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    p = fs.PendingRequests()
    users = client.follow_requests_get(p)

    for user in users:  # approves all requests
        a = fs.ApproveRequest(str(user['pk']))
        resp = client.follow_request_approve(a)
