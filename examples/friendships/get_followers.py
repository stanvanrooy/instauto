import random
import os

from src.api.client import ApiClient
from time import sleep

from src.api.actions.structs.friendships import ShowFriendshipFollowers


if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name="your_username", password="your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    f = ShowFriendshipFollowers.create(user_id="2283025667")
    obj, result = client.get_followers(f)  # grabs first page
    while result:  # paginates until all followers are extracted
        parsed = result.json()
        print(f"Extracted {len(parsed['users'])} followers")
        print(f"The username of the first extracted follower is {parsed['users'][0]['username']}")
        obj, result = client.get_followers(obj)
        sleep(random.randint(10, 60))