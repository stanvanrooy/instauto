import json
import hmac

from requests import Session, Response
from typing import Callable, Union
from instauto.api.actions.stubs import _request

from ..structs import Method, State, DeviceProfile, IGProfile, PostLocation
from .structs.post import PostFeed, PostStory, Comment, UpdateCaption, Save, Like, Unlike, Device, RetrieveByUser, Location
from ..exceptions import BadResponse

from .helpers import build_default_rupload_params


class PostMixin:
    """Handles everything related to Instagram posts."""
    _session: Session
    ig_profile: IGProfile
    state: State
    device_profile: DeviceProfile
    _request: _request
    _gen_uuid: Callable
    _generate_user_breadcrumb: Callable

    breadcrumb_private_key: bytes
    bc_hmac: hmac.HMAC

    def _post_act(self, obj: Union[Save, Comment, UpdateCaption, Like, Unlike]):
        """Peforms the actual action and calls the Instagram API with the data provided."""
        if obj.feed_position is None:
            delattr(obj, 'feed_position')

        endpoint = f'media/{obj.media_id}/{obj.action}/'
        return self._request(endpoint, Method.POST, data=obj.fill(self).to_dict(), signed=True)

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

    def _request_fb_places_id(self, obj: Location) -> str:
        if obj.lat is None or obj.lng is None:
            if obj.name is None:
                raise ValueError("Atleast a lat/lng combination or name needs to be specified.")
            resp = self._request("location_search", Method.GET, query={
                "search_query": obj.name,
                "rankToken": self._gen_uuid()
            })
        else:
            query = {
                "latitude": obj.lat,
                "longitude": obj.lng,
            }
            if obj.name:
                query['search_query'] = obj.name
            resp = self._request("location_search", Method.GET, query=query)

        as_json = resp.json()
        if as_json['status'] != 'ok':
            raise BadResponse

        return str(as_json['venues'][0]['external_id'])

    def _upload_image(self, obj: Union[PostStory, PostFeed], quality: int) -> dict:
        as_dict = obj.fill(self).to_dict()
        headers = {
            'x-fb-photo-waterfall-id': str(as_dict.pop('x_fb_waterfall_id')),
            'x-entity-length': str(as_dict.pop('entity_length')),
            'x-entity-name': as_dict.pop('entity_name'),
            'x-instagram-rupload-params': json.dumps(build_default_rupload_params(obj, quality)),
            'x-entity-type': as_dict.pop('entity_type'),
            'offset': '0',
            'scene_capture_type': 'standard',
            'creation_logger_session_id': self.state.session_id
        }

        path = as_dict.pop('image_path')
        if hasattr(obj, 'location') and obj.location is not None:
            if not obj.location.facebook_places_id:
                obj.location.facebook_places_id = self._request_fb_places_id(obj.location)
            as_dict['location'] = json.dumps(obj.location.__dict__)

        if obj.device is None:
            d = Device(self.device_profile.manufacturer, self.device_profile.model,
                       int(self.device_profile.android_sdk_version), self.device_profile.android_release)
            obj.device = d

        with open(path, 'rb') as f:
            self._request(f'https://i.instagram.com/rupload_igphoto/{headers["x-entity-name"]}', Method.POST,
                          headers=headers, data=f.read())
        return as_dict

    def post_post(self, obj: Union[PostStory, PostFeed], quality: int = None) -> Response:
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
        as_dict = self._upload_image(obj, quality)
        headers = {
            'retry_context': json.dumps({"num_reupload": 0, "num_step_auto_retry": 0, "num_step_manual_retry": 0})
        }
        if obj.source_type == PostLocation.Feed.value:
            return self._request('media/configure/', Method.POST, data=as_dict, headers=headers, signed=True)
        elif obj.source_type == PostLocation.Story.value:
            return self._request('media/configure_to_story/', Method.POST, data=as_dict, headers=headers, signed=True)
        else:
            raise Exception("{} is not a supported post location.", obj.source_type)

    def post_retrieve_by_user(self, obj: RetrieveByUser) -> (RetrieveByUser, Union[dict, bool]):
        """Retrieves 12 posts of the user at a time. If there was a response / if there were any more posts
        available, the response can be found in original_requests/post.json:4

        Returns
        --------
        PostRetrieveByUser, (dict, bool)
            Will return the updated object and the response if there were any posts left, returns the object and
            False if not.
        """
        as_dict = obj.to_dict()

        if obj.page > 0 and obj.max_id is None:
            return obj, False

        if obj.max_id is not None:
            as_dict.pop('max_id')
        as_dict.pop('user_id')

        resp = self._request(f'feed/user/{obj.user_id}/', Method.GET, query=as_dict)
        resp_as_json = resp.json()

        obj.max_id = resp_as_json.get('next_max_id')
        obj.page += 1
        return obj, resp_as_json['items']

    def post_get_likers(self, media_id: str) -> [any]:
        """Retrieve all likers of specific media_id"""
        endpoint = 'media/{media_id}/likers'.format(**{'media_id': media_id})
        resp = self._request(endpoint=endpoint, method=Method.GET)
        users_as_json = resp.json().get('users')

        return users_as_json

    def post_get_commenters(self, media_id: str) -> [any]:
        endpoint = 'media/{media_id}/comments'.format(**{'media_id': media_id})
        resp = self._request(endpoint=endpoint, method=Method.GET)
        users_as_json = resp.json().get('users')

        return users_as_json
