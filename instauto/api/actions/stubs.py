from instauto.api.structs import Method
import requests
from typing import Dict, Optional, Union


class _request:
    def __call__(self, endpoint: str, method: Method, query: dict = None, data: Optional[Union[dict, bytes]] = None, headers: Dict[str, str]
    = None, default_headers: bool = None, signed: bool = None) -> requests.Response: ...
