from instauto.api.client import ApiClient
import instauto.api.actions.structs.profile as pr
import instauto.api.actions.structs.post as ps

client = ApiClient.initiate_from_file('.instauto.save')

post = ps.PostNull(
    path='./test_feed.jpg',
)
resp = client.post_post(post, 80)

upload_id = resp.json()['upload_id']
p = pr.SetPicture(
    upload_id=upload_id
)
client.profile_set_picture(p)

