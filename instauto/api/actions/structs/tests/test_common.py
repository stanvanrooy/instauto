import unittest

from .. import common as cmmn
from ....exceptions import MissingValue


class _TestClass(cmmn.Base):
    def __init__(self, test11: str, **kwargs):
        super().__init__(**kwargs)
        self._custom_data['test1.0'] = self.State.required
        self._custom_data['test1.1'] = self.State.optional
        self._custom_data['test1.2'] = self.State.default

        self._defaults['test1.2'] = "test1.2"

        self._data['test1.1'] = test11


class TestCommon(unittest.TestCase):
    def test_1(self):
        """Test exception is raised when a required param isn't provided"""
        self.assertRaises(MissingValue, lambda: _TestClass("test11").fill())
