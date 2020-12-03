import os
import json
from instauto.api.client import ApiClient
from instauto.api.actions.structs.direct import DirectThread
from instauto.api.structs import Thread

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name=os.environ.get("INSTAUTO_USER") or "your_username", password=os.environ.get("INSTAUTO_PASS") or "your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    client.direct_get_inbox()
    latest_thread_id = client.inbox.threads[0]['thread_id']
    thread = DirectThread(latest_thread_id)
    thread: Thread = client.direct_get_thread(thread)
    print(thread)
