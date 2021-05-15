from instauto.api.client import ApiClient
import instauto.api.actions.structs.direct as dr

client = ApiClient.initiate_from_file('.instauto.save')
client.direct_update_inbox()
random_thread_id = client.inbox.threads[0].thread_id

recipient = "12345678"
media_id = "123232131231321_12121344"
msg = dr.MediaShare(
  media_id,
  recipients=[[recipient]]
)
client.direct_send(msg)

# see the wiki for more information: 
# https://github.com/stanvanrooy/instauto/wiki/Using-the-direct-messaging-API

