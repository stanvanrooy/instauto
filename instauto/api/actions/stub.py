from pathlib import Path
from typing import Callable, Union, Dict

import requests

from instauto.api.structs import IGProfile, DeviceProfile, State, Method


class _request:
    def __call__(self,
                 endpoint: str,
                 method: Method,
                 query: dict = None,
                 body: Union[dict, list, bytes] = None,
                 headers: Dict[str, str] = None,
                 add_default_headers: bool = None,
                 sign_request: bool = None
                 ) -> requests.Response: ...


class _get_image_type:
    def __call__(self, p: Union[str, Path]) -> str: ...


class _build_default_rupload_params:
    def __call__(self, obj, quality: int, is_sidecar: bool) -> dict: ...


class _json_loads:
    def __call__(self, text: Union[str, bytes, bytearray]) -> Union[dict, list]: ...


class _json_dumps:
    def __call__(self, obj: Union[dict, list]) -> str: ...


class StubMixin:
    ig_profile: IGProfile
    device_profile: DeviceProfile
    state: State
    _user_agent: str
    _encode_password: Callable
    _session: requests.Session
    _request_finished_callbacks: list
    _handle_challenge: Callable
    _2fa_function: Callable[[str], str]
    _handle_2fa: Callable[[dict], None]
    _request: _request
    _username: str
    _raw_password: str
    _encoded_password: str
    _gen_uuid: Callable[[], str]
    _get_image_type: _get_image_type
    _build_default_rupload_params: _build_default_rupload_params
    _json_loads: _json_loads
    _json_dumps: _json_dumps
