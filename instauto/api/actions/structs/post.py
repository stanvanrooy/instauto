from . import common as cmmn
import uuid
import random
import time
# pyre-ignore[21]
import imagesize
import logging
import pprint

from pathlib import Path
from dataclasses import dataclass, field
from typing import Optional, List, Union, Tuple

from ..helpers import HelperMixin
from instauto.api.structs import PostLocation
from instauto.api.constants import DEFAULT_DEVICE_PROFILE

logger = logging.getLogger(__name__)


#####################################
# DATACLASSES
#####################################

@dataclass
class UserTag:
    """
    Contains all information about a UserTag. This can be used to set the user tag for an UserTags object.

    :param user_id: Id of the tagged user
    :param x: relative x-coordinate with 0 <= x <= 1, with 0 for left and 1 for right
    :param y: relative y-coordinate with 0 <= y <= 1, with 0 for top and 1 for bottom
    """
    user_id: str = ""
    x: Optional[float] = None
    y: Optional[float] = None

    def to_dict(self) -> dict:
        if self.x is None or self.y is None:
            raise Exception("Invalid x, y coordinates.")
        data = {
            "user_id": self.user_id,
            "position": [
                # pyre-ignore[6]
                round(self.x, ndigits=8),
                # pyre-ignore[6]
                round(self.y, ndigits=8)
            ]
        }
        return data

    def __repr__(self):
        return pprint.pformat(self.to_dict())


@dataclass
class UserTags:
    """
    Contains all information about UserTags. This can be used to set usertags for an Instagram post.
    :param usertags: this takes a list of UserTag objects
    """
    usertags: Optional[List[UserTag]] = None

    def to_dict(self) -> dict:
        data = {
            "in": []
        }
        for usertag in self.usertags or []:
            data["in"].append(usertag)
        return data

    def __repr__(self):
        return pprint.pformat(self.to_dict())


@dataclass
class Location:
    """Contains all information about the location. This can be used to set the location tag for an Instagram post."""
    name: str = ""
    address: str = ""
    lat: Optional[float] = None
    lng: Optional[float] = None
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
    is_carousel_bumped_post: Optional[str] = None
    container_module: Optional[str] = None
    media_id: Optional[str] = None
    feed_position: Optional[str] = None

    def __init__(self, media_id: str, feed_position: Optional[str] = None, container_module: Optional[str] = None,
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
    action = 'comment'

    def __init__(self, media_id: str, comment_text: str, container_module: str = "something", *args, **kwargs):
        self.comment_text = comment_text
        self.idempotence_token: str = str(uuid.uuid4())
        super().__init__(media_id=media_id, container_module=container_module, *args, **kwargs)


class Archive(_Base):
    action = 'only_me'

    def __init__(self, media_id: str, container_module: str = "something", *args, **kwargs):
        super().__init__(media_id=media_id, container_module=container_module, *args, **kwargs)


class Unarchive(_Base):
    action = 'undo_only_me'

    def __init__(self, media_id: str, container_module: str = "something", *args, **kwargs):
        super().__init__(media_id=media_id, container_module=container_module, *args, **kwargs)


class UpdateCaption(_Base):
    action = 'edit_media'

    def __init__(self, media_id: str, caption_text: Optional[str] = None, location: Optional[Location] = None,
                 container_module: str = "something", *args, **kwargs):
        self.caption_text = caption_text
        self.location = location
        super().__init__(media_id=media_id, container_module=container_module, *args, **kwargs)


class _PostBase(cmmn.Base):
    timezone_offset: str = ''
    size: Optional[Tuple[Union[int, float], Union[int, float]]] = None

    def __init__(self, path: Union[str, Path], source_type: PostLocation, edits: Optional[Edits],
                 extra: Optional[Extra], device: Optional[Device], *args, **kwargs):
        self.upload_id = str(time.time() + random.randint(1, 100000)).split('.')[0]
        self.scene_capture_type = ''
        self.media_folder = 'Pictures'
        self.x_fb_waterfall_id = str(uuid.uuid4())
        self.entity_name = f'{self.upload_id}_0_{random.randint(1000000000, 9999999999)}'

        self.source_type = source_type.value

        image_type = HelperMixin.get_image_type(path)
        # See issue #65
        if image_type not in ['jpg', 'jpeg']:
            raise ValueError("Instagram only accepts jpg/jpeg images")

        self.entity_type = f'image/{image_type}'
        self.image_path = path

        with open(path, 'rb') as f:
            f.seek(0, 2)
            self.entity_length = f.tell()

        if edits is not None and extra is None:
            self.extra = Extra(edits.crop_original_size[0], edits.crop_original_size[1])
        elif extra is not None and edits is None:
            self.edits = Edits([extra.source_width, extra.source_height])
        elif extra is None and edits is None:
            if self.size is not None:
                size = self.size
            else:
                size = imagesize.get(self.image_path)
            self.edits = Edits(size)
            self.extra = Extra(*size)

        self.device = device or Device(
            DEFAULT_DEVICE_PROFILE['manufacturer'],
            DEFAULT_DEVICE_PROFILE['model'],
            DEFAULT_DEVICE_PROFILE['android_sdk_version'],
            DEFAULT_DEVICE_PROFILE['android_release']
        )
        super().__init__(*args, **kwargs)


class PostFeed(_PostBase):
    """Contains all information about a post, that is necessary to upload it to Instagram."""
    device_id: Optional[str] = None

    def __init__(
        self, path: Union[str, Path], caption: Optional[str], location: Optional[Location] = None,
        usertags: Optional[UserTags] = None, edits: Optional[Edits] = None, extra: Optional[Extra] = None,
        device: Optional[Device] = None, source_type: PostLocation = PostLocation.Feed, *args, **kwargs
    ):
        self.suggested_venue_position = -1
        self.multi_sharing = '-1'
        self.caption = caption
        self.location = location
        self.size = imagesize.get(path)
        self.user_tags = usertags
        super().__init__(path, source_type, edits, extra, device, *args, **kwargs)


class PostStory(_PostBase):
    _csrftoken: Optional[str] = None
    _uid: Optional[str] = None
    _uuid: Optional[str] = None
    device_id: Optional[str] = None

    def __init__(self, path: Union[str, Path], edits: Optional[Edits] = None,
                 extra: Optional[Extra] = None, device: Optional[Device] = None, *args, **kwargs):
        self.camera_session_id = str(uuid.uuid4())
        self.creation_surface = 'camera'
        current_time = time.time()
        self.imported_taken_at = str(current_time - random.randint(10000, 200000)).split('.')[0]
        self.client_timestamp = str(current_time - 3).split('.')[0]
        self.client_shared_at = str(current_time + 1).split('.')[0]
        self.capture_type = 'normal'
        self.configure_mode = '1'
        self.supported_capabilities_new = "[{\"name\":\"SUPPORTED_SDK_VERSIONS\",\"value\":\"66.0,67.0,68.0,69.0,70.0,71.0,72.0,73.0,74.0,75.0,76.0,77.0,78.0,79.0,80.0,81.0,82.0,83.0,84.0,85.0,86.0,87.0,88.0,89.0,90.0,91.0,92.0\"},{\"name\":\"FACE_TRACKER_VERSION\",\"value\":\"14\"},{\"name\":\"segmentation\",\"value\":\"segmentation_enabled\"},{\"name\":\"COMPRESSION\",\"value\":\"ETC2_COMPRESSION\"},{\"name\":\"world_tracker\",\"value\":\"world_tracker_enabled\"},{\"name\":\"gyroscope\",\"value\":\"gyroscope_enabled\"}]"
        super().__init__(path, PostLocation.Story, edits, extra, device, *args, **kwargs)
        self._datapoint_from_client['device_id'] = lambda client: client.state.android_id


class PostNull(PostFeed):
    def __init__(self, path: Union[str, Path], edits: Optional[Edits] = None,
                 extra: Optional[Extra] = None, device: Optional[Device] = None, *args, **kwargs):
        super().__init__(path, None, None, None, edits, extra, device, PostLocation.Null, *args,**kwargs)


class RetrieveById(cmmn.Base):
    def __init__(self, media_id: str, *args, **kwargs) -> None:
        self.media_id = media_id
        super().__init__(*args, **kwargs)


class RetrieveByUser(cmmn.Base):
    def __init__(
        self, user_id: int, exclude_comment: str = 'true',
        only_fetch_first_carousel_media: str = 'false',
        *args, **kwargs
    ):
        self.user_id = user_id
        self.max_id: Optional[str] = None
        self.exclude_comment = exclude_comment
        self.only_fetch_first_carousel_media = only_fetch_first_carousel_media
        self.page = 0
        super().__init__(*args, **kwargs)


class RetrieveByTag(cmmn.Base):
    def __init__(self, tag_name: str, exclude_comment: str = 'true', only_fetch_first_carousel_media: str = 'false', *args, **kwargs):
        self.max_id: Optional[str] = None
        self.exclude_comment = exclude_comment
        self.only_fetch_first_carousel_media = only_fetch_first_carousel_media
        self.page = 0
        self.tag_name = tag_name
        super().__init__(*args, **kwargs)


class RetrieveStory(cmmn.Base):
    def __init__(self, user_id: int, *args, **kwargs):
        self.user_id = user_id
        self.capabilities_string = \
                              "%5B%7B%22name%22%3A%22SUPPORTED_SDK_VERSIONS%22%2C%22value%22%3A%2266.0%2C67.0%2C68." \
                              "0%2C69.0%2C70.0%2C71.0%2C72.0%2C73.0%2C74.0%2C75.0%2C76.0%2C77.0%2C78.0%2C79.0%2C80." \
                              "0%2C81.0%2C82.0%2C83.0%2C84.0%2C85.0%2C86.0%2C87.0%2C88.0%2C89.0%2C90.0%2C91.0%2C92." \
                              "0%22%7D%2C%7B%22name%22%3A%22FACE_TRACKER_VERSION%22%2C%22value%22%3A%2214%22%7D%2C%" \
                              "7B%22name%22%3A%22segmentation%22%2C%22value%22%3A%22segmentation_enabled%22%7D%2C%7" \
                              "B%22name%22%3A%22COMPRESSION%22%2C%22value%22%3A%22ETC2_COMPRESSION%22%7D%2C%7B%22na" \
                              "me%22%3A%22world_tracker%22%2C%22value%22%3A%22world_tracker_enabled%22%7D%2C%7B%22n" \
                              "ame%22%3A%22gyroscope%22%2C%22value%22%3A%22gyroscope_enabled%22%7D%5D"
        super().__init__(*args, **kwargs)


class RetrieveLikers(cmmn.Base):
    REQUEST = "post/retrieve_likers.json"

    def __init__(self, media_id: str, *args, **kwargs):
        self.media_id = media_id
        super().__init__(*args, **kwargs)


class RetrieveCommenters(cmmn.Base):
    REQUEST = "post/retrieve_commenters.json"

    def __init__(self, media_id: str, *args, **kwargs):
        self.media_id = media_id
        super().__init__(*args, **kwargs)


class RetrieveComments(cmmn.Base):
    REQUEST = "post/retrieve_commenters.json"

    def __init__(self, media_id: str, *args, **kwargs):
        self.media_id = media_id
        super().__init__(*args, **kwargs)

