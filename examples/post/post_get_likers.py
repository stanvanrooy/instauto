import os

from instauto.api.client import ApiClient

if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name=os.environ.get("INSTAUTO_USER") or "yourusername", password=os.environ.get("INSTAUTO_PASSWORD") or "yourpassword")
        client.login()
        client.save_to_disk("./.instauto.save")

    retrieved_data = client.post_get_likers("1770154859660826272")

    print(retrieved_data)

