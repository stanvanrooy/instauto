from typing import Callable, Dict
import pprint
import inspect
from dataclasses import asdict


class Base:
    def __init__(self, *args, **kwargs):
        for k, v in kwargs.items():
            setattr(self, k, v)
        self._exempt = ["REQUEST", "_exempt"]

    def fill(self, client) -> None:
        _datapoint_from_client: Dict[str, Callable[["instauto.api.client.ApiClient"], str]] = {
            "_csrftoken": lambda c: c._session.cookies['csrftoken'],
            "device_id": lambda c: c.state.device_id,
            "_uuid": lambda c: c.state.uuid,
            "_uid": lambda c: c.state.user_id
        }
        attrs = dir(self)
        for k, func in _datapoint_from_client.items():
            if k in attrs:
                setattr(self, k, func(client))

    def to_dict(self) -> Dict[str, str]:
        d = {}

        for k, v in self.__dict__.items():
            if k in self._exempt or v is None:
                continue
            if '__dataclass_fields__' in dir(v):
                d[k] = asdict(v)
            elif inspect.isclass(v) and issubclass(v, Base):
                d[k] = v.to_dict()
            else:
                d[k] = v
        return d

    def __repr__(self):
        return pprint.pformat(self.__dict__)
