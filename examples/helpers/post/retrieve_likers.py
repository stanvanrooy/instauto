import os, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..', '..', '..'))
# Note: the above 2 lines are not necessary if you have installed the package.

from instauto.api.client import ApiClient
from instauto.helpers.post import get_likers_of_post

client = ApiClient.initiate_from_file('../../../.instauto.save')
posts = get_likers_of_post(client, "3384581222172362999_2120189741")
assert posts is not None

