from instauto.api.client import ApiClient
import os
from instauto.api.actions.structs.profile import ProfileSetBiography

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name="your_username", password="your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    p = ProfileSetBiography.create(
        biography="Does it work? Of course it works!"
    )
    client.profile_set_biography(p)
