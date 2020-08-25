import os

from instauto import ApiClient
from instauto import post as ps

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name="your_username", password="your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    like = ps.Comment.create(
        media_id="1734612737423614055_6400760974",
        comment_text="Such great!"
    )
    client.post_comment(like)
