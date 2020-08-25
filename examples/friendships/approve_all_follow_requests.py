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
    users = client.get_follow_requests(p)

    for user in users:  # approves all requests
        a = fs.ApproveRequest.create(str(user['pk']))
        resp = client.approve_follow_request(a)
