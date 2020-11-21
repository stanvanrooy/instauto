import os

from instauto.api.client import ApiClient
from instauto.ready.interact_with_followers_of_account import interact_with_followers_of_account


if __name__ == '__main__':
    if os.path.isfile('./.instauto.save'):
        client = ApiClient.initiate_from_file('./.instauto.save')
    else:
        client = ApiClient(user_name=os.environ.get("INSTAUTO_USER") or "your_username", password=os.environ.get("INSTAUTO_PASS") or "your_password")
        client.login()
        client.save_to_disk('./.instauto.save')

    # This snippet, does the following:
    # from the followers of the Instagram account:
    #     like between 1 and 5 posts of the follower
    #     comment on 0 to 1 posts of the user
    #         with the comment: "Looks good, {full_name}!", where {full_name} is replaced
    #         by the name set on the ig account
    #     follow 1 out of 10 followers retrieved
    #     wait between 20 and 120 seconds before moving on to the next follower

    interact_with_followers_of_account(
        client=client,
        target="instagram",
        delay=[20.0, 120.0],
        duration=60.0 * 60.0,
        likes_per_follower=[1, 5],
        comments_per_follower=[0, 1],
        follow_chance=10,
        comments=["Looks good, {full_name}!"],
    )