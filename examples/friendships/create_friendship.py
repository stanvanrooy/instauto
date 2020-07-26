from src.api.client import ApiClient
import os

from src.api.actions.structs.friendships import CreateFriendship

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name="your_username", password="your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    f = CreateFriendship.create(user_id="6889845893")
    client.follow_user(f)
