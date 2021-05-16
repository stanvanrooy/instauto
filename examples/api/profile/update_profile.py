from instauto.api.client import ApiClient
import instauto.api.actions.structs.profile as pr
from instauto.api.structs import WhichGender

client = ApiClient.initiate_from_file('.instauto.save')
# With the update object, you can update multiple attributes at the same time, but you
# can also just set one property.
obj = pr.Update(
  "https://github.com/stanvanrooy/instauto", 
  "your phone number", 
  "your new username", 
  "your new first name", 
  "your new email"
)
client.profile_update(obj)

