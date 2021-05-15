from instauto.api.client import ApiClient
import instauto.api.actions.structs.direct as dr

client = ApiClient.initiate_from_file('.instauto.save')
client.direct_update_inbox()
random_thread_id = client.inbox.threads[0].thread_id

recipient_1 = "12345678"
recipient_2 = "87654321"
profile_to_share = "12348765"
msg = dr.ProfileShare(
  profile_to_share,
  recipients=[[recipient_1], [recipient_2]]
)
client.direct_send(msg)

# see the wiki for more information: 
# https://github.com/stanvanrooy/instauto/wiki/Using-the-direct-messaging-API

