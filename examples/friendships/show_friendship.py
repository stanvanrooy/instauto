from src.api.client import ApiClient
import os

from src.api.actions.structs.friendships import ShowFriendship

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name="your_username", password="your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    f = ShowFriendship.create(user_id="38720650610")
    resp = client.show_follower(f)
    print("status: ", resp.json())
