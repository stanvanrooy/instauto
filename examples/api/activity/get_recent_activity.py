from instauto.api.client import ApiClient
import instauto.api.actions.structs.activity as act


client = ApiClient(username="your_username", password="your_password")
# or ApiClient.initiate_from_file('.instauto.save')
client.save_to_disk('.instauto.save')


obj = act.ActivityGet(mark_as_seen=False)
recent_activity = client.activity_get(obj)

