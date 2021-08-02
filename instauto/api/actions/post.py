from time import time

import requests
from requests import Response
from typing import Union, List, Tuple, Dict, Optional

from .stub import StubMixin
from ..structs import Method, PostLocation
from .structs.post import PostFeed, PostStory, Comment, UpdateCaption, Save, Like, Unlike, Device, RetrieveByUser, \
    Location, RetrieveByTag, RetrieveLikers, RetrieveCommenters, UserTags, PostNull, RetrieveComments, RetrieveById ,\
    Archive, Unarchive, RetrieveStory

from ..exceptions import BadResponse


class PostMixin(StubMixin):
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

    def post_archive(self, obj: Archive) -> Response:
        return self._post_act(obj)

    def post_unarchive(self, obj: Unarchive) -> Response:
        return self._post_act(obj)

    def post_post(self, obj: Union[PostStory, PostFeed, PostNull], quality: Optional[int] = None) -> Response:
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
        resp, as_dict = self._upload_image(obj, quality)
        headers = {
            'retry_context': self._json_dumps({"num_reupload": 0, "num_step_auto_retry": 0, "num_step_manual_retry": 0})
        }
        if obj.source_type == PostLocation.Feed.value:
            return self._request('media/configure/', Method.POST, body=as_dict, headers=headers, sign_request=True)
        elif obj.source_type == PostLocation.Story.value:
            return self._request('media/configure_to_story/', Method.POST, body=as_dict, headers=headers, sign_request=True)
        elif obj.source_type == PostLocation.Null.value:
            return resp
        else:
            raise Exception("{} is not a supported post location.", obj.source_type)

    def post_retrieve_by_id(self, obj: RetrieveById) -> Response:
        url = f'media/{obj.media_id}/info/'
        return self._request(url, Method.GET)

    def post_retrieve_by_user(self, obj: RetrieveByUser) -> Tuple[RetrieveByUser, Union[dict, bool]]:
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
        as_dict.pop('user_id')

        resp = self._request(f'feed/user/{obj.user_id}/', Method.GET, query=as_dict)
        resp_as_json = self._json_loads(resp.text)

        # pyre-ignore[16]
        obj.max_id = resp_as_json.get('next_max_id')
        obj.page += 1
        # pyre-ignore[6]
        return obj, resp_as_json['items']

    def post_retrieve_story(self, obj: RetrieveStory) -> requests.Response:
        qp = {
            'supported_capabilities_new': obj.capabilities_string
        }
        return self._request(f'feed/user/{obj.user_id}/story/', Method.GET, qp)

    def post_retrieve_by_tag(self, obj: RetrieveByTag) -> Tuple[RetrieveByTag, Union[dict, bool]]:
        as_dict = obj.to_dict()

        if obj.page > 0 and obj.max_id is None:
            return obj, False

        as_dict.pop('tag_name')

        resp = self._request(f'feed/tag/{obj.tag_name}/', Method.GET, query=as_dict)
        resp_as_json = self._json_loads(resp.text)

        # pyre-ignore[16]
        obj.max_id = resp_as_json.get('next_max_id')
        obj.page += 1
        # pyre-ignore[6]
        return obj, resp_as_json['items']

    def post_get_likers(self, obj: RetrieveLikers) -> List[Dict]:
        """Retrieve all likers of specific media_id"""
        endpoint = 'media/{media_id}/likers'.format(media_id=obj.media_id)
        resp = self._request(endpoint=endpoint, method=Method.GET)
        # pyre-ignore[6]
        users_as_json = self._json_loads(resp.text)['users']
        return users_as_json

    def post_get_commenters(self, obj: RetrieveCommenters) -> List[Dict]:
        endpoint = 'media/{media_id}/comments'.format(media_id=obj.media_id)
        resp = self._request(endpoint=endpoint, method=Method.GET)
        # pyre-ignore[6]
        users_as_json = [c['user'] for c in self._json_loads(resp.text)['comments']]
        return users_as_json

    def post_get_comments(self, obj: RetrieveComments) -> Response:
        endpoint = 'media/{media_id}/comments'.format(media_id=obj.media_id)
        resp = self._request(endpoint=endpoint, method=Method.GET)
        return resp

    def post_carousel(self, posts: List[PostFeed], caption: str, quality: int) -> Dict[str, Response]:
        upload_id = str(time()).replace('.', '')
        data = {
            "timezone_offset": posts[0].timezone_offset,
            "_csrftoken": self._session.cookies['csrftoken'],
            "source_type": str(PostLocation.Feed.value),
            "_uid": self.state.user_id,
            "device_id": self.state.android_id,
            "_uuid": self.state.uuid,
            "creation_logger_session_id": self._gen_uuid(),
            "caption": caption,
            "device": posts[0].to_dict()['device'],
            "client_sidecar_id": upload_id,
            "children_metadata": [],
        }

        for post in posts:
            data['children_metadata'].append({
                "scene_capture_type": post.scene_capture_type,
                "upload_id": post.upload_id,
                "caption": "",
                "timezone_offset": post.timezone_offset,
                "source_type": str(post.source_type),
                "scene_type": None,
                # pyre-ignore[6]
                "edits": self._json_dumps(post.to_dict()['edits']),
                # pyre-ignore[6]
                "extra": self._json_dumps(post.to_dict()['extra']),
                # pyre-ignore[6]
                "device": self._json_dumps(post.to_dict()['device'])
            })
            if hasattr(post, 'user_tags'):
                self._add_user_tags(data, post.user_tags)

        headers = {
            'retry_context': self._json_dumps({"num_reupload": 0, "num_step_auto_retry": 0, "num_step_manual_retry": 0})
        }

        responses: Dict[str, Response] = dict()
        for i, post in enumerate(posts):
            responses[f'post{i}'] = self._upload_image(post, quality, True)[0]

        responses['configure_sidecar'] = self._request('media/configure_sidecar/', Method.POST, body=data, headers=headers, sign_request=True)
        return responses

    def _add_user_tags(self, data, user_tags: Optional[UserTags]):
        if user_tags is None:
            return
        tags = user_tags.to_dict()
        for i, user_tag in enumerate(tags['in']):
            tags['in'][i] = user_tag.to_dict()
        data['children_metadata'][-1]['usertags'] = self._json_dumps(tags)

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
                # pyre-ignore[6]
                query['search_query'] = obj.name
            resp = self._request("location_search", Method.GET, query=query)

        as_json = self._json_loads(resp.text)
        # pyre-ignore[6]
        if as_json['status'] != 'ok':
            raise BadResponse

        # pyre-ignore[6]
        return str(as_json['venues'][0]['external_id'])

    def _upload_image(self, obj: Union[PostStory, PostFeed], quality: int, is_sidecar: bool = False) -> Tuple[Response, dict]:
        if obj.device is None:
            d = Device(self.device_profile.manufacturer, self.device_profile.model,
                       int(self.device_profile.android_sdk_version), self.device_profile.android_release)
            obj.device = d

        as_dict = obj.fill(self).to_dict()
        headers = {
            'x-fb-photo-waterfall-id': str(as_dict.pop('x_fb_waterfall_id')),
            'x-entity-length': str(as_dict.pop('entity_length')),
            'x-entity-name': as_dict.pop('entity_name'),
            'x-instagram-rupload-params': self._json_dumps(self._build_default_rupload_params(obj, quality, is_sidecar)),
            'x-entity-type': as_dict.pop('entity_type'),
            'offset': '0',
            'scene_capture_type': 'standard',
            'creation_logger_session_id': self.state.session_id
        }

        path = obj.image_path
        as_dict.pop('image_path')
        # pyre-ignore[16] we check if the object has a location attribute.
        if hasattr(obj, 'location') and obj.location is not None:
            if not obj.location.facebook_places_id:
                obj.location.facebook_places_id = self._request_fb_places_id(obj.location)
            as_dict['location'] = self._json_dumps(obj.location.__dict__)

        # pyre-ignore[16] we check if the object has a usertags attribute.
        if hasattr(obj, 'usertags') and obj.user_tags is not None:
            data = obj.user_tags.to_dict()
            for i, usertag in enumerate(data['in']):
                data['in'][i] = usertag.to_dict()
            as_dict['usertags'] = self._json_dumps(data)

        with open(path, 'rb') as f:
            resp = self._request(f'https://i.instagram.com/rupload_igphoto/{headers["x-entity-name"]}', Method.POST,
                                 headers=headers, body=f.read())
        return resp, as_dict

    def _post_act(self, obj: Union[Save, Comment, UpdateCaption, Like, Unlike, Archive, Unarchive]):
        """Peforms the actual action and calls the Instagram API with the data provided."""
        if obj.feed_position is None:
            delattr(obj, 'feed_position')

        endpoint = f'media/{obj.media_id}/{obj.action}/'
        return self._request(endpoint, Method.POST, body=obj.fill(self).to_dict(), sign_request=True)
