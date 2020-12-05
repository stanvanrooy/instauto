from typing import List

from instauto.api.client import ApiClient
from instauto.api.actions import post as ps

from .common import is_resp_ok
from .search import get_user_id_from_username

import logging

from ..api.actions.structs.post import RetrieveCommenters, RetrieveLikers

logger = logging.getLogger(__name__)


def upload_image_to_feed(client: ApiClient, image_path: str, caption: str = None, location: ps.Location = None) -> bool:
    post = ps.PostFeed(
        path=image_path,
        caption=caption or '',
        location=location,
    )
    resp = client.post_post(post, 80).ok
    logger.info(f"Uploaded image to feed")
    return is_resp_ok(resp)


def upload_image_to_story(client: ApiClient, image_path: str) -> bool:
    post = ps.PostStory(
        path=image_path
    )
    resp = client.post_post(post)
    logger.info(f"Uploaded image to story")
    return is_resp_ok(resp)


def update_caption(client: ApiClient, media_id: str, new_caption: str) -> bool:
    caption = ps.UpdateCaption(
        media_id=media_id,
        caption_text=new_caption
    )
    resp = client.post_update_caption(caption)
    logger.info(f"Updated caption of post {media_id} to {new_caption}")
    return is_resp_ok(resp)


def unlike_post(client: ApiClient, media_id: str) -> bool:
    like = ps.Unlike(
        media_id=media_id
    )
    resp = client.post_unlike(like)
    logger.info(f"Unliked post {media_id}")
    return is_resp_ok(resp)


def save_post(client: ApiClient, media_id: str) -> bool:
    save = ps.Save(
        media_id=media_id
    )
    resp = client.post_save(save)
    logger.info(f"Saved post {media_id}")
    return is_resp_ok(resp)


def retrieve_posts_from_user(client: ApiClient, limit: int, username: str = None, user_id: str = None) -> List[dict]:
    if username is None and user_id is None:
        raise ValueError("Either `username` or `user_id` param need to be provider")

    if username is not None and user_id is None:
        user_id = get_user_id_from_username(client, username)
        if user_id is None:
            logger.info(f"Couldn't find user {username}")
            return []
    elif username is not None and user_id is not None:
        logger.warning("Both `username` and `user_id` are provided. `user_id` will be used.")

    obj = ps.RetrieveByUser(
        user_id=user_id
    )
    obj, result = client.post_retrieve_by_user(obj)
    retrieved_items = []

    while result and len(retrieved_items) < limit:
        logger.info(f"Retrieved {len(retrieved_items)} posts from user {username or user_id}")
        retrieved_items.extend(result)
        obj, result = client.post_retrieve_by_user(obj)
    return retrieved_items[:limit:]


def retrieve_posts_from_tag(client: ApiClient, tag: str, limit: int) -> List[dict]:
    obj = ps.RetrieveByTag(
        tag_name=tag
    )
    obj, result = client.post_retrieve_by_tag(obj)
    retrieved_items = []

    while result and len(retrieved_items) < limit:
        logger.info(f"Retrieved {len(retrieved_items)} posts by tag")
        retrieved_items.extend(result)
        obj, result = client.post_retrieve_by_tag(obj)
    return retrieved_items[:limit:]


def get_likers_of_post(client: ApiClient, media_id: str) -> List[dict]:
    logger.info(f"Getting likers of {media_id}")
    return client.post_get_likers(RetrieveLikers(media_id))


def get_commenters_of_post(client: ApiClient, media_id: str) -> List[dict]:
    logger.info(f"Getting commenters of {media_id}")
    return client.post_get_commenters(RetrieveCommenters(media_id))


def like_post(client: ApiClient, media_id: str) -> bool:
    like = ps.Like(
        media_id=media_id
    )
    resp = client.post_like(like)
    logger.info(f"liked post {media_id}")
    return is_resp_ok(resp)


def comment_post(client: ApiClient, media_id: str, comment: str) -> bool:
    comment = ps.Comment(
        media_id=media_id,
        comment_text=comment
    )
    resp = client.post_comment(comment)
    logger.info(f"Commented {comment} on post {media_id}")
    return is_resp_ok(resp)
