import os

from instauto import ApiClient
from instauto import profile as pr

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name="your_username", password="your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    p = pr.SetBiography.create(
        biography="Does it work? Of course it works!"
    )
    client.profile_set_biography(p)
