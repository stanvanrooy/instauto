import os, sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..', '..', '..'))
# Note: the above 2 lines are not necessary if you have installed the package.

from instauto.api.client import ApiClient
from instauto.helpers.post import upload_image_to_story

client = ApiClient.initiate_from_file('../../../.instauto.save')
success = upload_image_to_story(client, "../../../test_story.jpg")
assert success

