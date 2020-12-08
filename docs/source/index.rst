Welcome to Instauto's documentation!
====================================

A Python wrapper for the private Instagram API.

Usage
===================
Instauto has 3 main api's that can be used: `instauto.api`, `instauto.bot` & `instauto.helpers`.

Everything in `instauto` is based around the 'core' `instauto.api` package. This package interacts directly
with the private Instagram API and contains all core functionality. This package is both the most flexible (you can
update all requests sent and receive the full response back, for example), but also the most complex.

The `instauto.helpers` package is an abstraction above the `instauto.api` package. It offers less flexibility, but is
simpler to use.

The `instauto.bot` package is another abstraction above the `instauto.helpers` package. This package has pretty much no
flexibility, but can be set up in 10 lines of Python code.

.. toctree::
   :maxdepth: 1

   instauto.api
   instauto.helpers
   instauto.bot


