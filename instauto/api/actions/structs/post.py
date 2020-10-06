from . import common as cmmn
import uuid
import random
import time
import imagesize
import logging
import pprint

from pathlib import Path
from dataclasses import dataclass, field
from typing import Optional, List, Union

from ..helpers import get_image_type
from instauto.api.structs import WhereToPost

logger = logging.getLogger(__name__)

#####################################
# DATACLASSES
#####################################


@dataclass
class Location:
    """Contains all information about the location. This can be used to set the location tag for an Instagram post."""
    name: str = ""
    address: str = ""
    lat: float = None
    lng: float = None
    external_source: str = ""
    facebook_places: str = ""
    facebook_places_id: str = ""

    def __repr__(self):
        return pprint.pformat(self.__dict__)


@dataclass
class Device:
    """Contains information about the device that is used to post the image. This defaults to the same info used in
    the DeviceProfile of the ApiClient class."""
    manufacturer: str
    model: str
    android_version: int
    android_release: str

    def __repr__(self):
        return pprint.pformat(self.__dict__)


@dataclass
class Edits:
    """Contains information about how the image was edited (zooming and positioning). Defaults to no edits."""
    crop_original_size: List[int]
    crop_center: List[float] = field(default_factory=lambda: [0.0, 0.0])
    crop_zoom: float = 1.0

    def __repr__(self):
        return pprint.pformat(self.__dict__)


@dataclass
class Extra:
    """Contains information about the image uploaded. Defaults to the actual size of the image."""
    source_width: int
    source_height: int

    def __repr__(self):
        return pprint.pformat(self.__dict__)


#####################################
# STRUCTS
#####################################

class _Base(cmmn.Base):
    """Contains values that are pretty much shared across all API requests."""
    radio_type: str = ''
    is_carousel_bumped_post: str = 'False'
    container_module: str = None
    media_id: str = None
    feed_position: str = None

    def __init__(self, media_id: str, feed_position: str, container_module: str = None,
                 delivery_class: str = 'organic', is_carousel_bumped_post: str = 'False', *args, **kwargs):
        self.media_id = media_id
        self.container_module = container_module
        self.feed_position = feed_position
        self.delivery_class = delivery_class
        self.is_carousel_bumped_post = is_carousel_bumped_post
        self.radio_type = 'wifi-none'
        super().__init__(*args, **kwargs)
        self._exempt.append('media_id')


class Unlike(_Base):
    action = 'unlike'

    def __init__(self, media_id: str, container_module: str = "something", *args, **kwargs):
        super().__init__(media_id=media_id, container_module=container_module, *args, **kwargs)


class Like(_Base):
    action = 'like'

    def __init__(self, media_id: str, container_module: str = "something", *args, **kwargs):
        super().__init__(media_id=media_id, container_module=container_module, *args, **kwargs)


class Save(_Base):
    action = 'save'

    def __init__(self, media_id: str, container_module: str = "something", *args, **kwargs):
        super().__init__(media_id=media_id, container_module=container_module, *args, **kwargs)


class Comment(_Base):
    action = 'save'

    def __init__(self, media_id: str, comment_text: str, container_module: str = "something", *args, **kwargs):
        self.comment_text = comment_text
        self.idempotence_token: str = str(uuid.uuid4())
        super().__init__(media_id=media_id, container_module=container_module, *args, **kwargs)


class UpdateCaption(_Base):
    action = 'edit_media'

    def __init__(self, media_id: str, caption_text: Optional[str] = None, location: Optional[Location] = None, container_module: str = "something", *args, **kwargs):
        self.caption_text = caption_text
        self.location = location
        super().__init__(media_id=media_id, container_module=container_module, *args, **kwargs)


class Post(cmmn.Base):
    """Contains all information about a post, that is necessary to upload it to Instagram."""
    device_id: str = None

    def __init__(self, path: Union[str, Path], source_type: WhereToPost, caption: str,
                 location: Optional[Location] = None, edits: Optional[Edits] = None,
                 extra: Optional[Extra] = None, *args, **kwargs):
        # SET DEFAULTS
        self.upload_id = str(time.time())
        self.timezone_offset = str(time.localtime().tm_gmtoff)
        self.scene_capture_type = ''
        self.media_folder = 'Pictures'
        self.x_fb_waterfall_id = str(uuid.uuid4())
        self.suggested_venue_position = -1
        self.multi_sharing = '-1'

        # SET DATACLASSES
        if edits is not None and extra is None:
            self.extra = Extra(edits.crop_original_size[0], edits.crop_original_size[1])
        elif extra is not None and edits is None:
            self.edits = Edits([extra.source_width, extra.source_height])
        elif extra is None and edits is None:
            self.size = imagesize.get(path)
            self.edits = Edits(self.size)
            self.extra = Extra(*self.size)

        # SET IMAGE SPECIFIC VALUES
        self.source_type = str(source_type.value)
        with open(path, 'rb') as f:
            f.seek(0, 2)
            self.entity_length = f.tell()

        self.entity_name = f'{self.upload_id}_0_{random.randint(1000000000, 9999999999)}'
        image_type = get_image_type(path)

        # See issue #65
        if image_type not in ['jpg', 'jpeg']:
            raise ValueError("Instagram only accepts jpg/jpeg images")

        self.entity_type = f'image/{image_type}'
        self.image_path = path
        self.caption = caption
        self.location = location
        super().__init__(*args, **kwargs)


class RetrieveByUser(cmmn.Base):
    def __init__(self, user_id: str, exclude_comment: str = 'true', only_fetch_first_carousel_media: str = 'false', *args, **kwargs):
        self.user_id = user_id
        self.max_id: Optional[str] = None
        self.exclude_comment = exclude_comment
        self.only_fetch_first_carousel_media = only_fetch_first_carousel_media
        self.page = 0
        super().__init__(*args, **kwargs)
