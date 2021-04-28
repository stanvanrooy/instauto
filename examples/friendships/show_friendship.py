import os

from instauto.api.client import ApiClient
from instauto.api.actions import friendships as fs

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(username=os.environ.get("INSTAUTO_USER") or "your_username", password=os.environ.get("INSTAUTO_PASS") or "your_password")
        client.log_in()
        client.save_to_disk('./.instauto.save')

    f = fs.Show(user_id="38720650610")
    resp = client.follower_show(f)
    print("status: ", self._json_loads(resp.text))
