from instauto.api.client import ApiClient
import instauto.api.actions.structs.post as ps

client = ApiClient.initiate_from_file('.instauto.save')
obj = ps.Comment("media_id", "Hello from instauto!")
response = client.post_comment(obj)

