from instauto.api.client import ApiClient
import instauto.api.actions.structs.profile as pr
from instauto.api.structs import WhichGender

client = ApiClient.initiate_from_file('.instauto.save')
obj = pr.SetGender(WhichGender.female)
# or 
obj = pr.SetGender(WhichGender.other, "Some custom gender")
client.profile_set_gender(obj)

