from instauto.api.client import ApiClient
from instauto.helpers.post import retrieve_posts_from_tag

client = ApiClient.initiate_from_file('.instauto.save')
posts = retrieve_posts_from_tag(client, "instagram", 100)

