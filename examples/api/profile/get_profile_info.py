from instauto.api.client import ApiClient
import instauto.api.actions.structs.profile as pr

client = ApiClient.initiate_from_file(".instauto.save")
obj = pr.Info("user_id")
info = client.profile_info(obj)

