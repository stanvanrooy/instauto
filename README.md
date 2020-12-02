# Instauto
[![All Contributors](https://img.shields.io/badge/all_contributors-6-orange.svg?style=flat-square)](#contributors-)
![tests](https://github.com/stanvanrooy/instauto/workflows/tests/badge.svg)
[![GitHub stars](https://img.shields.io/github/stars/stanvanrooy/instauto)](https://github.com/stanvanrooy/instauto/stargazers)
[![PyPI license](https://img.shields.io/pypi/l/instauto)](https://pypi.python.org/project/instauto/)
[![Downloads](https://pepy.tech/badge/instauto/week)](https://pepy.tech/project/instauto)
![coverage](https://github.com/stanvanrooy/instauto/blob/master/coverage.svg)


Instauto is a Python package for automating various parts of Instagram, making use of the private Instagram API.

For feature requests, ideas, comments, etc., please open an issue. 

## Installation
The package can be installed with the following pip command:
```pip install instauto```

## Usage
Here is a simple example that likes a post.

```python
from instauto.api.client import ApiClient
from instauto.api.actions import post as ps

if __name__ == '__main__':
    client = ApiClient("your_username", "your_password")
    client.login()
    
    like = ps.Like(
        media_id="1734612737423614055_6400760974"
    )
    client.post_like(like)
```
Other examples of how to use the package, can be found in the [examples directory](https://github.com/stanvanrooy/instauto/tree/master/examples).

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)

## Contributors ✨

Thanks goes to these wonderful people ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tr>
    <td align="center"><a href="https://github.com/marosgonda"><img src="https://avatars1.githubusercontent.com/u/16307489?v=4" width="100px;" alt=""/><br /><sub><b>Maroš Gonda</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=marosgonda" title="Tests">⚠️</a> <a href="https://github.com/stanvanrooy/instauto/commits?author=marosgonda" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/gocnik95"><img src="https://avatars2.githubusercontent.com/u/68646331?v=4" width="100px;" alt=""/><br /><sub><b>Norbert Gocník</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=gocnik95" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/juhas96"><img src="https://avatars3.githubusercontent.com/u/25826778?v=4" width="100px;" alt=""/><br /><sub><b>Jakub Juhas</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=juhas96" title="Code">💻</a> <a href="https://github.com/stanvanrooy/instauto/commits?author=juhas96" title="Documentation">📖</a> <a href="https://github.com/stanvanrooy/instauto/commits?author=juhas96" title="Tests">⚠️</a></td>
    <td align="center"><a href="https://github.com/Samu1808"><img src="https://avatars3.githubusercontent.com/u/64809910?v=4" width="100px;" alt=""/><br /><sub><b>Samu1808</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=Samu1808" title="Code">💻</a></td>
    <td align="center"><a href="https://www.kevinjonathan.com"><img src="https://avatars3.githubusercontent.com/u/12078441?v=4" width="100px;" alt=""/><br /><sub><b>Kevin Jonathan</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=kevinjon27" title="Documentation">📖</a></td>
    <td align="center"><a href="https://github.com/marvic2409"><img src="https://avatars3.githubusercontent.com/u/25594875?v=4" width="100px;" alt=""/><br /><sub><b>Martin Nikolov</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=marvic2409" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/b177y"><img src="https://avatars1.githubusercontent.com/u/34008579?v=4" width="100px;" alt=""/><br /><sub><b>b177y</b></sub></a><br /><a href="https://github.com/stanvanrooy/instauto/commits?author=b177y" title="Code">💻</a> <a href="https://github.com/stanvanrooy/instauto/commits?author=b177y" title="Tests">⚠️</a> <a href="https://github.com/stanvanrooy/instauto/commits?author=b177y" title="Documentation">📖</a></td>
  </tr>
</table>

<!-- markdownlint-enable -->
<!-- prettier-ignore-end -->
<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!
