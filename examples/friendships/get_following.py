from src.api.client import ApiClient
import os


from time import sleep
import random
from src.api.actions.structs.friendships import ShowFriendshipFollowing


if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name="your_username", password="your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    f = ShowFriendshipFollowing.create(user_id="2283025667")
    obj, result = client.get_following(f)  # grabs the first page
    while result:  # paginate until all users are extracted
        parsed = result.json()
        print(f"Extracted {len(parsed['users'])} users following")
        print(f"The username of the first extracted user following is {parsed['users'][0]['username']}")
        obj, result = client.get_following(obj)
        sleep(random.randint(10, 60))
