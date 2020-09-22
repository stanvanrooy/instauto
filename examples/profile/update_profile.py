import os

from instauto import profile as pr
from instauto import ApiClient

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name=os.environ.get("INSTAUTO_USER") or "your_username", password=os.environ.get("INSTAUTO_PASS") or "your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    p = pr.Update.create(
        external_url="https://google.com",
        first_name="Hello! It's me!"
    )
    client.profile_update(p)
