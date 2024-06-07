import os, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..', '..', '..'))
# Note: the above 2 lines are not necessary if you have installed the package.

from instauto.api.client import ApiClient
from instauto.helpers.post import retrieve_story_from_user

client = ApiClient.initiate_from_file('../../../.instauto.save')
# stories = retrieve_story_from_user(client, user_id=12345678)
# or
stories = retrieve_story_from_user(client, username='instagram')
assert stories is not None
