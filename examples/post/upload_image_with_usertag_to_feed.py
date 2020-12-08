import os

from instauto.api.client import ApiClient
from instauto.api.actions import post as ps

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name=os.environ.get("INSTAUTO_USER") or "your_username", password=os.environ.get("INSTAUTO_PASS") or "your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    # Any of the below examples will work.
    # ps.UserTag defines a single usertag
    # ps.UserTags takes all usertags in a list and could be given to the ps.PostFeed
    usertag1 = ps.UserTag(
        user_id="",     # user_id of user you want to tag
        x=0.2,          # relative x coordinate with 0<=x<=1, with 0 for left and 1 for right
        y=0.2           # relative y coordinate with 0<=x<=1, with 0 for top and 1 for bottom
    )
    usertags = ps.UserTags(
        usertags=[usertag1]
    )
    post = ps.PostFeed(
        path='./test_feed.jpg',
        caption='This is an example. Follow me!',
        usertags=usertags
    )

    resp = client.post_post(post, 80)
    print("Success: ", resp.ok)
