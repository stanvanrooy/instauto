import unittest

from ..helpers import get_image_type


class TestFriendships(unittest.TestCase):
    def test_get_image_type(self):
        to_test = [
            ['test.png', 'png'],
            ['test.tar.gz', 'tar.gz'],
            ['test.jpg', 'jpg'],
            ['test.jpeg', 'jpeg'],
            ['/test/test2/test.png', 'png'],
            ['/test2/3t/test.jpg', 'jpg']
        ]
        for (inp, out) in to_test:
            self.assertEqual(get_image_type(inp), out)
