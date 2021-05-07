import os

from time import sleep
import random

from instauto.api.client import ApiClient
from instauto.api.actions import friendships as fs
from instauto.api.actions import search as se


if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(username=os.environ.get("INSTAUTO_USER") or "your_username", password=os.environ.get("INSTAUTO_PASS") or "your_password")
        client.log_in()
        client.save_to_disk('./.instauto.save')

    s = se.Username("instagram", 1)
    resp = client.search_username(s).json()
    user_id = resp['users'][0]['pk']

    f = fs.GetFollowing(user_id)
    obj, result = client.following_get(f)  # grabs the first page
    while result:  # paginate until all users are extracted
        parsed = result.json()
        print(f"Extracted {len(parsed['users'])} users following")
        print(f"The username of the first extracted user following is {parsed['users'][0]['username']}")
        obj, result = client.following_get(obj)
        sleep(random.randint(10, 60))
