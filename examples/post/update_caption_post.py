import os

from instauto import ApiClient
from instauto import post as ps

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name=os.environ.get("INSTAUTO_USER") or "your_username", password=os.environ.get("INSTAUTO_PASS") or "your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    caption = ps.UpdateCaption(
        media_id="1734612737423614055_6400760974",
        caption_text="This is an example for update caption post."
    )
    client.post_update_caption(caption)
