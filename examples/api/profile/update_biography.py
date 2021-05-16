from instauto.api.client import ApiClient
import instauto.api.actions.structs.profile as pr

client = ApiClient.initiate_from_file('.instauto.save')
obj = pr.SetBiography("My new biography!")
client.profile_set_biography(obj)

