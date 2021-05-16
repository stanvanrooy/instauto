from instauto.api.client import ApiClient
from instauto.helpers.search import search_tags

client = ApiClient.initiate_from_file(".instauto.save")
users = search_tags(client, "instagram", 10)

