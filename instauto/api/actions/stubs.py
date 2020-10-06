from instauto.api.structs import Method
import requests
from typing import Protocol, Dict


class _request(Protocol):
    def __call__(self, endpoint: str, method: Method, query: dict = None, data: dict = None, headers: Dict[str, str]
    = None, default_headers: bool = None, signed: bool = None) -> requests.Response: ...
