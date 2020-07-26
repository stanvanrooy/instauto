from instauto.api.client import ApiClient
import os
from instauto.api.actions.structs.profile import ProfileSetGender
from instauto.api.structs import WhichGender

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name="your_username", password="your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    # FOR CUSTOM GENDER
    # p = ProfileSetGender.create(
    #     gender=WhichGender.other,
    #     custom_gender="Blue whale"
    # )

    # FOR MALE / FEMALE / PREFER NOT TO SAY
    p = ProfileSetGender.create(
        gender=WhichGender.male,
    )

    client.profile_set_gender(p)
