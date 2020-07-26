# Instauto

Instauto is a Python package for automating various parts of Instagram, making use of the private Instagram API.

Instauto is currently fairly limited, because it is under development. Progress can be tracked [here](https://github.com/stanvanrooy/instauto/projects/1).
Instauto in it's current state, should not be used for production systems.

For feature requests, ideas, comments, etc., please open an issue. 

## Installation
The package is still under development, but an alpha version has been published to PyPy. The package can be installed with the following pip command:
```pip install instauto```

## Usage
Here is an example that extracts all followers from an Instagram account: 

```python
import random
import os

from time import sleep

from instauto import ApiClient
from instauto.friendships_structs import ShowFriendshipFollowers

client = ApiClient(user_name="yourusername", password="yourpassword")
client.login()

f = ShowFriendshipFollowers.create(user_id="2283025667")
obj, result = client.get_followers(f)  # grabs first page
while result:  # paginates until all followers are extracted
    parsed = result.json()
    print(f"Extracted {len(parsed['users'])} followers")
    print(f"The username of the first extracted follower is {parsed['users'][0]['username']}")
    obj, result = client.get_followers(obj)
    sleep(random.randint(10, 60))
```
A few other examples of how to use the package, can be found in the examples directory.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[GNU GPLv3](https://choosealicense.com/licenses/gpl-3.0/)
