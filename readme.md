# Instauto

Instauto is a Python package for automating various parts of Instagram, making use of the private Instagram API.

Instauto is currently fairly limited, because it is under development. Progress can be tracked [here](https://github.com/stanvanrooy/instauto/projects/1).
Instauto in it's current state, should not be used for production systems.

For feature requests, ideas, comments, etc., please open an issue. 

## Installation
The package is still under development and hasn't been published to PyPi yet. This will be done once it is in a more finished
and stable state.

## Usage
```python
from src.api.client import ApiClient
from src.api.actions.structs import PostLike

client = ApiClient(user_name="your_username", password="your_password")
client.login()

like = PostLike.create(media_id="1734612737423614055_6400760974")
client.post_like(like)
```
A few other examples of how to use the package, can be found in the examples directory.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[GNU GPLv3](https://choosealicense.com/licenses/gpl-3.0/)