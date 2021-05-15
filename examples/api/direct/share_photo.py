from instauto.api.client import ApiClient
import instauto.api.actions.structs.direct as dr

client = ApiClient.initiate_from_file('.instauto.save')
client.direct_update_inbox()
random_thread_id = client.inbox.threads[0].thread_id

# to share an photo, we first have to upload it:
from instauto.api.actions.structs.post import PostNull
post = PostNull('./path-to-image.jpg')
upload_id = client._upload_image(post, quality=70)['upload_id']

# and then we can send it
recipient = "12345678"
msg = dr.DirectPhoto(
  upload_id,
  recipients=[[recipient]]
)
client.direct_send(photo)

# see the wiki for more information: 
# https://github.com/stanvanrooy/instauto/wiki/Using-the-direct-messaging-API

