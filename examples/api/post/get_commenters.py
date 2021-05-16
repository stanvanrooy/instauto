from instauto.api.client import ApiClient
import instauto.api.actions.structs.post as ps

client = ApiClient.initiate_from_file('.instauto.save')
obj = ps.RetrieveCommenters("media_id")
commenters = client.post_get_commenters(obj)

