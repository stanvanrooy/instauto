import enum
from typing import Callable, Optional, Dict, Tuple, Union
from instauto.api.exceptions import MissingValue


class Base:
    class State(enum.Enum):
        required = 0
        optional = 1
        default = 2

    _datapoint_from_client: Dict[str, Tuple[bool, Callable[[], str]]] = {
        "_csrftoken": (False, lambda client: client._session.cookies['csrftoken']),
        "device_id": (False, lambda client: client.state.device_id),
        "_uuid": (False, lambda client: client.state.uuid),
        "_uid": (False, lambda client: client.state.user_id)
    }

    def __init__(self, **kwargs):
        self._custom_data = {}
        self._defaults = {}
        self._data = {}
        self._kwargs = kwargs

    def _enable_datapoint_from_client(self, key: str) -> None:
        self._datapoint_from_client[key][0] = True

    def _add_datapoint_from_client(self, key: str, f: Optional[Callable[[], str]], enabled: bool = False):
        self._datapoint_from_client[key] = (enabled, f)

    def fill(self, client) -> Dict[str, Union[str, int, float, bool]]:
        data = {}
        for key, (enabled, func) in filter(lambda k, v: v[0], self._datapoint_from_client.items()):
            if enabled:
                self._data[key] = func(client)

        for key, value in self._custom_data:
            if key in self._data and self._data[key] is not None:
                data[key] = self._data[key]
            elif key in self._defaults:
                data[key] = self._defaults[key]
            elif value == self.State.required:
                raise MissingValue("{key} is required but is not provided and has no default value.")

        for key, value in self._kwargs.items():
            data[key] = value

        return data
