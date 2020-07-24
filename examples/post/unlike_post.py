from src.api.client import ApiClient
from src.api.actions.structs.post import PostUnlike
import os


if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name="your_username", password="your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    like = PostUnlike.create(
        media_id="1734612737423614055_6400760974"
    )
    client.post_unlike(like)
