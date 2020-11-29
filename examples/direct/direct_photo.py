import os
from instauto.api.client import ApiClient
from instauto.api.actions.structs.direct import DirectPhoto
from instauto.api.actions.structs.post import PostFeed as PhotoUpload

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name=os.environ.get("INSTAUTO_USER") or "your_username", password=os.environ.get("INSTAUTO_PASS") or "your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    # upload photo
    ph = PhotoUpload(path="/tmp/test.jpg", caption="")
    response = client._upload_image(ph, quality=70)
    upload_id = response['upload_id']

    # send photo
    userid = "" # recipient of photo
    dp = DirectPhoto(upload_id=upload_id, recipients=[[userid]])
    client.direct_send(dp)
