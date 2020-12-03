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

    client.direct_get_inbox()
    latest_thread_id = client.inbox.threads[0]['thread_id']
    thread = client.direct_get_thread(latest_thread_id).json()
    print(json.dumps(thread, indent=4))
