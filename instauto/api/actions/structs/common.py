import time
from typing import Callable, Dict, Union
import pprint
import inspect
from dataclasses import asdict


class Base:
    def __init__(self, *args, **kwargs):
        for k, v in kwargs.items():
            setattr(self, k, v)
        #: list of attributes that will be skipped over in the `to_dict` method
        self._exempt = ["REQUEST", "_datapoint_from_client", "_exempt"]
        #: list of datapoints that need to be retrieved from the client
        self._datapoint_from_client: Dict[str, Callable[["instauto.api.client.ApiClient"], str]] = {
            "_csrftoken": lambda c: c._session.cookies['csrftoken'],
            "device_id": lambda c: c.state.android_id,
            "_uuid": lambda c: c.state.uuid,
            "_uid": lambda c: c.state.user_id,
            "phone_id": lambda c: c.state.phone_id,
            "battery_level": lambda c: c.state.battery_level,
            "timezone_offset": lambda _: str(time.localtime().tm_gmtoff),
            "is_charging": lambda c: c.state.is_charging,
            "is_dark_mode": lambda c: c.state.is_dark_mode,
            "session_id": lambda c: c.state.session_id,
            "bloks_versioning_id": lambda c: c.state.bloks_version_id
        }

    def fill(self, client) -> "Base":
        """Fills all of the datapoints that need to be retrieved from the client."""
        attrs = dir(self)
        for k, func in self._datapoint_from_client.items():
            if k in attrs:
                setattr(self, k, func(client))
        return self

    def to_dict(self) -> Dict[str, Union[dict, str, int]]:
        """Converts the object to a dictionary"""
        d = {}

        for k, v in self.__dict__.items():
            if k in self._exempt or v is None:
                continue
            if '__dataclass_fields__' in dir(v):
                d[k] = asdict(v)
            elif inspect.isclass(v) and issubclass(v, Base):
                d[k] = v.to_dict()
            elif hasattr(v, 'value'):  # we assume this is an Enum value.
                d[k] = v.value
            else:
                d[k] = v
        return d

    def __repr__(self):
        return pprint.pformat(self.__dict__)
