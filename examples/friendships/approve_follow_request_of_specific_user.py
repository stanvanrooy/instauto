import os

from instauto import ApiClient
from instauto import search as se
from instauto import friendships as fs

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name=os.environ.get("INSTAUTO_USER") or "your_username", password=os.environ.get("INSTAUTO_PASS") or "your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    s = se.Username.create("stan058_", 1)
    resp = client.search_username(s).json()
    user_id = resp['users'][0]['pk']

    a = fs.ApproveRequest(user_id)
    resp = client.follow_request_approve(a)
