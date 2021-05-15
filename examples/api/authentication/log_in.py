from instauto.api.client import ApiClient

# There are multiple ways to authenticate in instauto, the first one, 
# is by creating a new session
client = ApiClient(username="your_username", password="your_password")
client.log_in()

# This is simple and fast, but doing this too often, will get your account flagged.
# That's why, instauto also supports saving sessions.
client.save_to_disk('.instauto.save')
# The above statement will save all important information that is necessary
# for reconstructing your session. To reconstruct your session, you can 
# call the `initiate_from_file` class method.
client = ApiClient.initiate_from_file('.instauto.save')

# That covers simple authentication, but what if you have 2FA enabled? No worries,
# that is also supported:
def get_2fa_code(username: str) -> str:
    # do something that'll retrieve a valid 2fa code here
    return str(random.randint(100000, 999999))
client = ApiClient(username="your_username", password="your_password", _2fa_function=get_2fa_code)

# Too much work to implement the `get_2fa_code` function? If it's not provided, instauto
# will prompt you for a 2fa code in the terminal before it continues.

# More information about authentication? Check out the authentication 
# wiki article https://github.com/stanvanrooy/instauto/wiki/Authentication

