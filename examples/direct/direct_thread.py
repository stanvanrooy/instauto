import os
import json
from instauto.api.client import ApiClient

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name=os.environ.get("INSTAUTO_USER") or "your_username", password=os.environ.get("INSTAUTO_PASS") or "your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    # get inbox
    inbox = client.direct_inbox().json()
    print(json.dumps(inbox, indent=4))

    # get latest thread
    latest_thread_id = inbox['inbox']['threads'][0]['thread_id']
    thread = client.direct_thread(latest_thread_id).json()
    print(json.dumps(thread, indent=4))
