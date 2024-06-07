import os, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..', '..', '..'))
# Note: the above 2 lines are not necessary if you have installed the package.

from instauto.api.client import ApiClient
from instauto.helpers.post import comment_post

client = ApiClient.initiate_from_file('../../../.instauto.save')
success = comment_post(client, "MEDIA_ID", "Hello from Instauto!")
assert success

