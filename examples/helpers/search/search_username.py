from instauto.api.client import ApiClient
from instauto.helpers.search import search_username

client = ApiClient.initiate_from_file(".instauto.save")
users = search_username(client, "instagram", 10)

