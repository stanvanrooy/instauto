import os

from instauto.api.client import ApiClient
from instauto.api.actions import profile as pr

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name=os.environ.get("INSTAUTO_USER") or "your_username", password=os.environ.get("INSTAUTO_PASS") or "your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    p = pr.SetBiography(
        biography="Does it work? Of course it works!"
    )
    client.profile_set_biography(p)
