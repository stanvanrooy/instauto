from instauto.api.client import ApiClient
import instauto.api.actions.structs.direct as dr

client = ApiClient.initiate_from_file('.instauto.save')
client.direct_update_inbox()
random_thread_id = client.inbox.threads[0].thread_id

user_id = "12345678"
msg = dr.LinkShare(
  "Hello from Instauto (https://github.com/stanvanrooy/instauto)!",
  ["https://github.com/stanvanrooy/instauto"],
  recipients=[[user_id]]
)
client.direct_send(msg)

# see the wiki for more information: 
# https://github.com/stanvanrooy/instauto/wiki/Using-the-direct-messaging-API

