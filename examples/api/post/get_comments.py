from instauto.api.client import ApiClient
import instauto.api.actions.structs.post as ps

client = ApiClient.initiate_from_file('.instauto.save')
obj = ps.RetrieveComments("media_id")
comments = client.post_get_comments(obj)

