from instauto.api.client import ApiClient

client = ApiClient.initiate_from_file('.instauto.save')
assert client.direct_update_inbox()
inbox = client.inbox

threads = inbox.threads
thread_ids = [t.thread_id for t in threads]

# see the wiki for more information: 
# https://github.com/stanvanrooy/instauto/wiki/Using-the-direct-messaging-API
