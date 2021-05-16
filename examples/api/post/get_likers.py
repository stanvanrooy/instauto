from instauto.api.client import ApiClient
import instauto.api.actions.structs.post as ps

client = ApiClient.initiate_from_file('.instauto.save')
obj = ps.RetrieveLikers("media_id")
likers = client.post_get_likers(obj)

