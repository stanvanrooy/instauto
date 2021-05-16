from instauto.api.client import ApiClient
import instauto.api.actions.structs.search as se

# This returns the first 10 search results, for 'instagram'.
client = ApiClient.initiate_from_file('.instauto.save')
obj = se.Username("instagram", 10)
response = client.search_username(obj)

