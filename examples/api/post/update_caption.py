from instauto.api.client import ApiClient
import instauto.api.actions.structs.post as ps

client = ApiClient.initiate_from_file('.instauto.save')
obj = ps.UpdateCaption("media_id", "new_caption")
response = client.post_update_caption(obj)

