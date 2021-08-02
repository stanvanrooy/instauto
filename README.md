# Instauto
[![All Contributors](https://img.shields.io/badge/all_contributors-15-orange.svg?style=flat-square)](#contributors-)
[![GitHub stars](https://img.shields.io/github/stars/stanvanrooy/instauto)](https://github.com/stanvanrooy/instauto/stargazers)
[![PyPI license](https://img.shields.io/pypi/l/instauto)](https://pypi.python.org/project/instauto/)
[![Downloads](https://pepy.tech/badge/instauto/week)](https://pepy.tech/project/instauto)
![coverage](https://github.com/stanvanrooy/instauto/blob/master/coverage.svg)
[![Documentation Status](https://readthedocs.org/projects/instauto/badge/?version=latest)](https://instauto.readthedocs.io/en/latest/?badge=latest)


`instauto` is a Python package for automating Instagram, making use of the private Instagram API. `instauto` tries to have feature parity with the Instagram app.

## Overview
Instauto has 3 main api's that can be used: `instauto.api`, `instauto.bot` and `instauto.helpers`. You should probably use `instauto.helpers` and only start using `instauto.api` when you actually need its functionality.

Everything in `instauto`, is based around the 'core' `instauto.api` package. This package interacts directly with the private Instagram API and contains all functionality. This package is both the most flexible (you can update all requests sent and receive the full response back, for example), but also the most complex. You likely do not need to use this package.

The `instauto.helpers` package, is an abstraction above the `instauto.api` pacakge. It offers a little bit less flexibility, but is a lot less complex to use. It also offers [typed models](https://github.com/stanvanrooy/instauto/blob/master/instauto/helpers/models.py).

The `instauto.bot` package, is another abstraction, but this time over the `instauto.helpers` package. This package has pretty much no flexibility, but can be set up in 10 lines of Python code.

## Installation
The package can be installed with the following pip command:
```pip install instauto```

## Getting started
Below are a few examples for getting stared quickly. After getting started, you'll probably want to take a quick look at the more [detailed documentation](https://instauto.readthedocs.io/) on readthedocs.

### Authentication
You'll want to do this as little as possible. Instagram sees logging in often as a huge red flag.
```python
from instauto.api import ApiClient
client = ApiClient(username='your_username', password='your_password')
client.log_in()
```

### Restoring state
Because of that, you can restore your session.
```python
client.save_to_disk('your-savefile.instauto')
client = ApiClient.initiate_from_file('your-savefile.instauto')
```

### Making new friends
Ofcourse `instauto` also supports (un)following users.
```python
from instauto.helpers.friendships import follow_user, unfollow_user
follow_user(client, username='stan000_')
unfollow_user(client, username='stan000_')
```

### Finding new friends
But before you can follow users, you'll need to find them first.
```python
from instauto.helpers.search import search_username
users = search_username(client, "username", 10)
```

### Retrieving 100 of your followers
Getting a list of users that follow you is also super simple. 
```python
from instauto.helpers.friendships import get_followers
followers = get_followers(client, username='your_username', limit=100)
```

### Uploading images
`instauto` also offers a simple API for uploading images to your feed and story.
```python
from instauto.helpers.post import upload_image_to_feed
upload_image_to_feed(client, './cat.jpg', 'Hello from instauto!')
```

### Looking at your feed
Your feed can't be missing, it's pretty much what Instagram is about, isn't it?
```python
from instato.helpers.feed import get_feed
posts = get_feed(client, 100)
```

## More examples 
Looking for something else? We have more examples:
- [feed helper functions](https://github.com/stanvanrooy/instauto/tree/master/examples/helpers/feed)
- [friendship helper functions](https://github.com/stanvanrooy/instauto/tree/master/examples/helpers/friendships)
- [post helper functions](https://github.com/stanvanrooy/instauto/tree/master/examples/helpers/post)
- [search helper function](https://github.com/stanvanrooy/instauto/tree/master/examples/helpers/search)
- [advanced examples](https://github.com/stanvanrooy/instauto/tree/master/examples/api)

Stil no look? Submit a feature request!

## Support
This is a hobby project, which means sometimes other things take priority. I will review issues and work on issues when I have the time. Spamming new issues, asking for a ton of updates, or things like that, will not speed up the process. It will probably even give me less motivation to work on it :)

If you're looking for paid support, please reach out to me at [stan@rooy.dev](mailto:stan@rooy.dev).

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

There's an [article up on the wiki](https://github.com/stanvanrooy/instauto/wiki/Setting-up-a-development-environment),  that explains how to set up a development environment.

## License
[MIT](https://choosealicense.com/licenses/mit/)

## Contributors ✨

Thanks goes to these wonderful people ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tr>
    <td align="center"><a href="https://github.com/marosgonda"><img src="https://avatars1.githubusercontent.com/u/16307489?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Maroš Gonda</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=marosgonda" title="Tests">⚠️</a> <a href="https://github.com/stanvanrooy/instauto/commits?author=marosgonda" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/gocnik95"><img src="https://avatars2.githubusercontent.com/u/68646331?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Norbert Gocník</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=gocnik95" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/juhas96"><img src="https://avatars3.githubusercontent.com/u/25826778?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Jakub Juhas</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=juhas96" title="Code">💻</a> <a href="https://github.com/stanvanrooy/instauto/commits?author=juhas96" title="Documentation">📖</a> <a href="https://github.com/stanvanrooy/instauto/commits?author=juhas96" title="Tests">⚠️</a></td>
    <td align="center"><a href="https://github.com/Samu1808"><img src="https://avatars3.githubusercontent.com/u/64809910?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Samu1808</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=Samu1808" title="Code">💻</a></td>
    <td align="center"><a href="https://www.kevinjonathan.com"><img src="https://avatars3.githubusercontent.com/u/12078441?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Kevin Jonathan</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=kevinjon27" title="Documentation">📖</a></td>
    <td align="center"><a href="https://github.com/marvic2409"><img src="https://avatars3.githubusercontent.com/u/25594875?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Martin Nikolov</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=marvic2409" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/b177y"><img src="https://avatars1.githubusercontent.com/u/34008579?v=4?s=100" width="100px;" alt=""/><br /><sub><b>b177y</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=b177y" title="Code">💻</a> <a href="https://github.com/stanvanrooy/instauto/commits?author=b177y" title="Tests">⚠️</a> <a href="https://github.com/stanvanrooy/instauto/commits?author=b177y" title="Documentation">📖</a></td>
  </tr>
  <tr>
    <td align="center"><a href="https://github.com/returnWOW"><img src="https://avatars3.githubusercontent.com/u/16145271?v=4?s=100" width="100px;" alt=""/><br /><sub><b>wowopo</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=returnWOW" title="Code">💻</a></td>
    <td align="center"><a href="https://rooy.works"><img src="https://avatars1.githubusercontent.com/u/49564025?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Stan van Rooy</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=stanvanrooy" title="Documentation">📖</a> <a href="https://github.com/stanvanrooy/instauto/commits?author=stanvanrooy" title="Code">💻</a> <a href="https://github.com/stanvanrooy/instauto/commits?author=stanvanrooy" title="Tests">⚠️</a></td>
    <td align="center"><a href="https://github.com/tibotix"><img src="https://avatars3.githubusercontent.com/u/38123657?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Tizian Seehaus</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=tibotix" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/ItsFlorkast"><img src="https://avatars.githubusercontent.com/u/43137808?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Florkast</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=ItsFlorkast" title="Documentation">📖</a></td>
    <td align="center"><a href="http://atnartur.dev"><img src="https://avatars.githubusercontent.com/u/5189110?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Artur</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=atnartur" title="Code">💻</a> <a href="https://github.com/stanvanrooy/instauto/commits?author=atnartur" title="Documentation">📖</a></td>
    <td align="center"><a href="https://github.com/Fislix"><img src="https://avatars.githubusercontent.com/u/84190063?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Felix Fischer</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=Fislix" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/alperenkaplan"><img src="https://avatars.githubusercontent.com/u/48252753?v=4?s=100" width="100px;" alt=""/><br /><sub><b>alperenkaplan</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=alperenkaplan" title="Code">💻</a> <a href="https://github.com/stanvanrooy/instauto/commits?author=alperenkaplan" title="Documentation">📖</a></td>
  </tr>
  <tr>
    <td align="center"><a href="https://github.com/javad94"><img src="https://avatars.githubusercontent.com/u/7765309?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Javadz</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=javad94" title="Code">💻</a> <a href="https://github.com/stanvanrooy/instauto/commits?author=javad94" title="Documentation">📖</a></td>
  </tr>
</table>

<!-- markdownlint-restore -->
<!-- prettier-ignore-end -->

<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!
