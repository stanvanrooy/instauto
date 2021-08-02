from instauto.api.client import ApiClient
import instauto.api.actions.structs.post as ps

client = ApiClient.initiate_from_file('.instauto.save')
obj = ps.RetrieveStory(12345678)
post = client.post_retrieve_story(obj)
