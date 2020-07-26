import json
from pathlib import Path
from typing import Union


def get_image_type(p: Union[str, Path]) -> str:
    """Returns the type of image, i.e. jpeg or png."""
    if isinstance(p, Path):
        return p.suffix
    return p.split('.')[1]


def build_default_rupload_params(obj, quality: int) -> dict:
    """Builds default parameters used to upload media."""
    return {
        'upload_id': obj.upload_id,
        'media_type': 1,
        'retry_context': json.dumps({
            'num_reupload': 0,
            'num_step_auto_retry': 0,
            'num_step_manual_retry': 0,
        }),
        'xsharing_user_ids': json.dumps([]),
        'image_compression': json.dumps({
            'lib_name': 'moz',
            'lib_version': '3.1.m',
            'quality': str(quality)
        })
    }