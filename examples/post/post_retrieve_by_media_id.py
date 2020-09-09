import os

from instauto import ApiClient
from instauto import structs as st
from instauto import post as ps

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name="your_username", password="your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    post = ps.RetrieveByMediaId.create("2260147965089934067_3012885304")

    resp = client.post_retrieve_by_media_id(post)
    print("Success: ", resp.ok)
