from pathlib import Path
from typing import Union

import orjson

from instauto.api.actions.stub import StubMixin


class HelperMixin(StubMixin):
    @staticmethod
    def get_image_type(p: Union[str, Path]) -> str:
        """Returns the type of image, i.e. jpeg or png."""
        if not isinstance(p, Path):
            p = Path(p)
        return ''.join(p.suffixes).replace('.', '', 1)

    def _build_default_rupload_params(self, obj, quality: int, is_sidecar: bool) -> dict:
        """Builds default parameters used to upload media."""
        return {
            'upload_id': obj.upload_id,
            'media_type': 1,
            'retry_context': self._json_dumps({
                'num_reupload': 0,
                'num_step_auto_retry': 0,
                'num_step_manual_retry': 0,
            }),
            'xsharing_user_ids': self._json_dumps([]),
            'image_compression': self._json_dumps({
                'lib_name': 'moz',
                'lib_version': '3.1.m',
                'quality': str(quality)
            }),
            "is_sidecar": str(int(is_sidecar))
        }

    def _json_loads(self, text: Union[str, bytes, bytearray]) -> Union[dict, list]:
        return orjson.loads(text)

    def _json_dumps(self, obj: Union[dict, list]) -> str:
        return orjson.dumps(obj).decode()
