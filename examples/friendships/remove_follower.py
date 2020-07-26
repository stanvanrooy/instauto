from instauto.api.client import ApiClient
import os

from instauto.api.actions.structs.friendships import RemoveFriendship

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name="your_username", password="your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    f = RemoveFriendship.create(user_id="38720650610")
    client.remove_follower(f)
