from instauto.api.client import ApiClient
import instauto.api.actions.structs.post as ps

client = ApiClient.initiate_from_file('.instauto.save')
obj = ps.RetrieveById("media_id")
post = client.post_retrieve_by_id(obj)

