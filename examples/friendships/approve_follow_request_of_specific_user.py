from src.api.client import ApiClient
import os

from src.api.actions.structs.search import SearchUsername
from src.api.actions.structs.friendships import ApproveFollowRequest


if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name="your_username", password="your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    s = SearchUsername.create("stan058_", 1)
    resp = client.search_username(s).json()
    user_id = resp['users'][0]['pk']

    a = ApproveFollowRequest.create(user_id)
    resp = client.approve_follow_request(a)
