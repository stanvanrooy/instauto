import os

from instauto.api.client import ApiClient
import instauto.api.actions.post as ps

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name=os.environ.get("INSTAUTO_USER") or "username",
                           password=os.environ.get("INSTAUTO_PASS") or "password")
        client.login()
        client.save_to_disk('./.instauto.save')

    p = ps.RetrieveCommenters
    client.post_get_commenters('1770154859660826272')