import unittest

from .. import common as cmmn
from ....exceptions import MissingValue
from ....client import ApiClient


class _TestClass(cmmn.Base):
    def __init__(self, test11: str, **kwargs):
        super().__init__(**kwargs)
        self._custom_data['test10'] = self.State.required
        self._custom_data['test11'] = self.State.optional
        self._custom_data['test12'] = self.State.default

        self._defaults['test12'] = "test12"

        self._data['test11'] = test11


class TestCommon(unittest.TestCase):
    def test_1(self):
        """Test exception is raised when a required param isn't provided"""
        self.assertRaises(MissingValue, lambda: _TestClass("test11").fill(ApiClient(testing=True)))

    def test_2(self):
        """Test no exception is raise when all required params are probided"""
        _TestClass("test11", test10="test10")

    def test_3(self):
        """Test exception is raised when an unknow param is provided"""
        self.assertRaises(MissingValue, lambda: _TestClass("test11", imnotreal="?").fill(ApiClient(testing=True)))

    def test_4(self):
        """Test default value is set"""
        t = _TestClass("test11", test10="test10")
        data = t.fill(ApiClient(testing=True))
        self.assertEqual(data['test12'], "test12")

