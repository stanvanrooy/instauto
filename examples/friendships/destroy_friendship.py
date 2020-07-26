from instauto.api.client import ApiClient
import os

from instauto.api.actions.structs.friendships import DestroyFriendship

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name="your_username", password="your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    f = DestroyFriendship.create(user_id="6889845893")
    client.unfollow_user(f)
