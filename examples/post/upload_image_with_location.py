import os

from instauto import ApiClient
from instauto import structs as st
from instauto import post as ps

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name=os.environ.get("INSTAUTO_USER") or "your_username", password=os.environ.get("INSTAUTO_PASS") or "your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    # Any of the below examples will work.
    # location = ps.Location(lat=38.897699584711, lng=-77.036494857373)
    # location = ps.Location(name="The white house")
    location = ps.Location(lat=68.14259, lng=148.84371, name="The white house")
    post = ps.Post.create(
        path='./test_story.jpg',
        source_type=st.WhereToPost.Feed,
        caption='This is an example. Follow me!',
        location=location
    )

    resp = client.post_post(post, 80)
    print("Success: ", resp.ok)
