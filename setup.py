import setuptools
from distutils.core import setup

setup(
  name = 'instauto',         # How you named your package folder (MyLib)
  packages = setuptools.find_packages(),   # Chose the same as "name"
  version = '0.0.6',      # Start with a small number and increase it with every change you make
  license='GNU GPLv3',        # Chose a license from here: https://help.github.com/articles/licensing-a-repository
  description = 'Python wrapper for the private Instagram API',   # Give a short description about your library
  author = 'Stan van Rooy',                   # Type in your name
  author_email = 'stan@rooy.dev',      # Type in your E-Mail
  url = 'https://github.com/stanvanrooy/instauto',   # Provide either the link to your github or to your website
  download_url = 'https://github.com/stanvanrooy/instauto/archive/0.0.6.tar.gz',    # I explain this later on
  keywords = ['instagram api', 'private instagram api'],   # Keywords that define your package best
  install_requires=[            # I get to this in a second
          'requests',
          'apscheduler',
          'pycryptodomex',
          'imagesize',
      ],
  classifiers=[
    'Development Status :: 3 - Alpha',
    'Intended Audience :: Developers',
    'Topic :: Software Development :: Libraries :: Python Modules',
    'License :: OSI Approved :: GNU General Public License v3 (GPLv3)  ',
    'Programming Language :: Python :: 3.8',
  ],
)