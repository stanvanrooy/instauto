from instauto.api.client import ApiClient

# note: to change your password, instauto needs the current password. If you've initialized 
# the client from your username and password, it'll be able to get it from there, but if
# you initialized the client from a save file, you'll need to provide it yourself, since
# instauto does not store your password in the save file.

client = ApiClient(username="your_username", password="your_password")
client.change_password("new_password")
# or
client = ApiClient.initiate_from_file('.instauto.save')
client.change_password("new_password", "current_password")

