from instauto.api.client import ApiClient
from instauto.api.structs import PostLocation
from instauto.api.actions.structs.post import PostPost
import os


if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name="your_username", password="your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    post = PostPost.create(
        path='./black_square.jpg',
        source_type=PostLocation.Feed,
        caption='This is an example. Follow me!'
    )

    resp = client.post_post(post, 80)
    print("Success: ", resp.ok)
