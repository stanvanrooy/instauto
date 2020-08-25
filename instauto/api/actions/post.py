import json
import hmac

from requests import Session, Response
from typing import Callable, Union
from dataclasses import asdict

from ..structs import Method, State, DeviceProfile, IGProfile
from .structs.post import Post, Comment, UpdateCaption, Save, Like, Unlike, Device, RetrieveByUser

from .helpers import build_default_rupload_params


class PostMixin:
    """Handles everything related to Instagram posts."""
    _session: Session
    ig_profile: IGProfile
    state: State
    device_profile: DeviceProfile
    _request: Callable
    _gen_uuid: Callable
    _generate_user_breadcrumb: Callable

    breadcrumb_private_key: bytes
    bc_hmac: hmac.HMAC

    def _post_act(self, obj: Union[Save, Post, Comment, UpdateCaption, Like, Unlike]):
        """Peforms the actual action and calls the Instagram API with the data provided."""
        obj._csrftoken = self._session.cookies['csrftoken']
        obj._uid = self.state.user_id
        obj._uuid = self.state.uuid
        if obj.feed_position is None:
            delattr(obj, 'feed_position')

        endpoint = f'media/{obj.media_id}/{obj.action}/'
        return self._request(endpoint, Method.POST, data=obj.__dict__, signed=True)

    def post_like(self, obj: Like) -> Response:
        """Likes a post"""
        return self._post_act(obj)

    def post_unlike(self, obj: Unlike) -> Response:
        """Unlikes a post"""
        return self._post_act(obj)

    def post_save(self, obj: Save) -> Response:
        """Saves a post to your Instagram account"""
        return self._post_act(obj)

    def post_comment(self, obj: Comment) -> Response:
        """Comments on a post"""
        return self._post_act(obj)

    def post_update_caption(self, obj: UpdateCaption) -> Response:
        """Updates the caption of a post"""
        return self._post_act(obj)

    def post_post(self, obj: Post, quality: int = None) -> Response:
        """Uploads a new picture/video to your Instagram account.
        Parameters
        ----------
        obj : Post
            Should be instantiated with all the required params
        quality : int
            Quality of the image, defaults to 70.
        Returns
        -------
        Response
            The response returned by the Instagram API.
        """

        if quality is None:
            quality = 70

        # sets all data of the PostPost object that is stored in the ig_profile, device_profile or state attributes.
        obj._csrftoken = self._session.cookies['csrftoken']
        obj._uid = self.state.user_id
        obj._uuid = self.state.uuid
        obj.device_id = self.state.device_id
        if obj.device is None:
            d = Device(self.device_profile.manufacturer, self.device_profile.model,
                       int(self.device_profile.android_sdk_version), self.device_profile.android_release)
            obj.device = d

        as_dict = asdict(obj)
        # Instagram will refuse the request and respond with a 400 bad request if an empty location is send along
        if as_dict['location'] is None: as_dict.pop('location')

        rupload_params = build_default_rupload_params(obj, quality)

        # headers used when uploading the object to Instagram
        headers = {
            'x-fb-photo-waterfall-id': str(as_dict.pop('x_fb_waterfall_id')),
            'x-entity-length': str(as_dict.pop('entity_length')),
            'x-entity-name': as_dict.pop('entity_name'),
            'x-instagram-rupload-params': json.dumps(rupload_params),
            'x-entity-type': as_dict.pop('entity_type'),
            'offset': '0',
            'scene_capture_type': 'standard',
            'creation_logger_session_id': self.state.session_id
        }

        path = as_dict.pop('image_path')

        # upload the image to Instagram
        with open(path, 'rb') as f:
            self._request(f'https://i.instagram.com/rupload_igphoto/{headers["x-entity-name"]}', Method.POST,
                          headers=headers, data=f.read())
        # headers used for configuring the object just uploaded
        headers = {
            'retry_context': json.dumps({"num_reupload": 0, "num_step_auto_retry": 0, "num_step_manual_retry": 0})
        }
        return self._request('media/configure/', Method.POST, data=as_dict, headers=headers, signed=True)

    def post_retrieve_by_user(self, obj: RetrieveByUser) -> (RetrieveByUser, Union[dict, bool]):
        """Retrieves 12 posts of the user at a time. If there was a response / if there were any more posts
        available, the response can be found in original_requests/post.json:4

        Returns
        --------
        PostRetrieveByUser, (dict, bool)
            Will return the updated object and the response if there were any posts left, returns the object and
            False if not.
        """
        as_dict = obj.__dict__.copy()

        if obj.page > 0 and obj.max_id is None:
            return obj, False

        as_dict.pop('max_id')
        as_dict.pop('user_id')

        resp = self._request(f'feed/user/{obj.user_id}/', Method.GET, query=as_dict)
        resp_as_json = resp.json()

        obj.max_id = resp_as_json.get('next_max_id')
        obj.page += 1
        return obj, resp_as_json['items']
