from typing import List, Optional

from instauto.api.client import ApiClient
from instauto.api.actions import post as ps
from instauto.api.actions.structs.post import RetrieveCommenters, RetrieveLikers
from instauto.api.exceptions import NotFoundError
from instauto.helpers.common import is_resp_ok
from instauto.helpers.search import get_user_id_from_username
from instauto.helpers import models

import logging
logger = logging.getLogger(__name__)


def upload_image_to_feed(
    client: ApiClient, image_path: str,
    caption: Optional[str] = None, location: Optional[ps.Location] = None
) -> bool:
    """Upload an image to your feed. Location and caption are optional.

    Args:
        client: your `ApiClient`
        image_path: path to the image to upload
        caption: the caption of the post
        location: the location tag of the post

    Returns:
        `True` if success else `False`
    """
    post = ps.PostFeed(
        path=image_path,
        caption=caption or '',
        location=location,
    )
    resp = client.post_post(post, 80)
    logger.info(f"Uploaded image to feed")
    return is_resp_ok(resp)


def upload_image_to_story(client: ApiClient, image_path: str) -> bool:
    """Upload an image to your story.

    Args:
        client: your `ApiClient`
        image_path: path to the image to upload

    Returns:
        `True` if success else `False`
    """
    post = ps.PostStory(
        path=image_path
    )
    resp = client.post_post(post)
    logger.info(f"Uploaded image to story")
    return is_resp_ok(resp)


def update_caption(client: ApiClient, media_id: str, new_caption: str) -> bool:
    """Update the caption of a post.

    Args:
        client: your `ApiClient`
        media_id: the media_id of a post
        new_caption: the new caption

    Returns:
        `True` if success else `False`
    """
    caption = ps.UpdateCaption(
        media_id=media_id,
        caption_text=new_caption
    )
    resp = client.post_update_caption(caption)
    logger.info(f"Updated caption of post {media_id} to {new_caption}")
    return is_resp_ok(resp)


def like_post(client: ApiClient, media_id: str) -> bool:
    """Like a post.

    Args:
        client: your `ApiClient`
        media_id: the post to like

    Returns:
        `True` if success else `False`
    """
    like = ps.Like(
        media_id=media_id
    )
    resp = client.post_like(like)
    logger.info(f"liked post {media_id}")
    return is_resp_ok(resp)


def comment_post(client: ApiClient, media_id: str, comment: str) -> bool:
    """Leave a comment on a post.

    Args:
        client: your `ApiClient`
        media_id: the post to comment on
        comment: the comment to place

    Returns:
        `True` if success else `False`
    """
    obj = ps.Comment(media_id=media_id, comment_text=comment)
    resp = client.post_comment(obj)
    logger.info(f"Commented {comment} on post {media_id}")
    return is_resp_ok(resp)


def unlike_post(client: ApiClient, media_id: str) -> bool:
    """Undo the liking of a post.

    Args:
        client: your `ApiClient`
        media_id: the media_id of a post

    Returns:
        `True` if success else `False`
    """
    like = ps.Unlike(
        media_id=media_id
    )
    resp = client.post_unlike(like)
    logger.info(f"Unliked post {media_id}")
    return is_resp_ok(resp)


def save_post(client: ApiClient, media_id: str) -> bool:
    """Save a post.

    Args:
        client: your `ApiClient`
        media_id: the media_id of a post

    Returns:
        `True` if success else `False`
    """
    save = ps.Save(
        media_id=media_id
    )
    resp = client.post_save(save)
    logger.info(f"Saved post {media_id}")
    return is_resp_ok(resp)


def retrieve_posts_from_user(
    client: ApiClient, limit: int,
    username: Optional[str] = None,
    user_id: Optional[int] = None
) -> List[models.Post]:
    """Retrieve x amount of posts from a user.

    Either `user_id` or `username` need to be provided. If both are provided,
    the user_id takes precedence.

    Args:
        client: your `ApiClient`
        limit: maximum amount of posts to retrieve
        username: username of the account to retrieve posts from
        user_id: user_id of the account to retrieve posts from

    Returns:
        A list of Instagram post objects (objects/post.json).
    """
    if username is None and user_id is None:
        raise ValueError("Either `username` or `user_id` param need to be provider")
    if username is not None and user_id is None:
        user_id = get_user_id_from_username(client, username)
    elif username is not None and user_id is not None:
        logger.warning("Both `username` and `user_id` are provided. `user_id` will be used.")

    if user_id is None:
        raise NotFoundError(f"Couldn't find user {username}")
    obj = ps.RetrieveByUser(user_id=user_id)
    obj, result = client.post_retrieve_by_user(obj)
    retrieved_items = []

    while result and len(retrieved_items) < limit:
        logger.info(f"Retrieved {len(retrieved_items)} posts from user {username or user_id}")
        # pyre-ignore[6]
        retrieved_items.extend(result)
        obj, result = client.post_retrieve_by_user(obj)
    return [models.Post.parse(p) for p in retrieved_items[:limit:]]


def retrieve_posts_from_tag(client: ApiClient, tag: str, limit: int) -> List[models.Post]:
    """Retrieve x amount of posts tagged with a tag.

    Args:
        client: your `ApiClient`
        limit: maximum amount of posts to retrieve
        tag: the tag to search for

    Returns:
        A list of Instagram post objects (objects/post.json).
    """
    obj = ps.RetrieveByTag(
        tag_name=tag
    )
    obj, result = client.post_retrieve_by_tag(obj)
    retrieved_items = []

    while result and len(retrieved_items) < limit:
        logger.info(f"Retrieved {len(retrieved_items)} posts by tag")
        # pyre-ignore[6]
        retrieved_items.extend(result)
        obj, result = client.post_retrieve_by_tag(obj)
    return [models.Post.parse(p) for p in retrieved_items[:limit:]]


def get_likers_of_post(client: ApiClient, media_id: str) -> List[models.User]:
    """Get users that liked a post.

    Args:
        client: your `ApiClient`
        media_id: the post to retrieve the likers from

    Returns:
        A list of Instagram user objects (objects/user.json).
    """
    logger.info(f"Getting likers of {media_id}")
    return [models.User.parse(l) for l in client.post_get_likers(RetrieveLikers(media_id))]


def get_commenters_of_post(client: ApiClient, media_id: str) -> List[models.User]:
    """Get users that commented on a post.

    Args:
        client: your `ApiClient`
        media_id: the post to retrieve the commenters from

    Returns:
        A list of Instagram user objects (objects/post.json).
    """
    logger.info(f"Getting commenters of {media_id}")
    return [models.User.parse(l) for l in client.post_get_likers(RetrieveLikers(media_id))]


def retrieve_story_from_user(
    client: ApiClient,
    username: Optional[str] = None,
    user_id: Optional[int] = None
) -> List[models.Story]:
    """Retrieve x amount of posts from a user.

    Either `user_id` or `username` need to be provided. If both are provided,
    the user_id takes precedence.

    Args:
        client: your `ApiClient`
        limit: maximum amount of posts to retrieve
        username: username of the account to retrieve posts from
        user_id: user_id of the account to retrieve posts from

    Returns:
        A list of Instagram post objects (objects/post.json).
    """
    if username is None and user_id is None:
        raise ValueError("Either `username` or `user_id` param need to be provider")
    if username is not None and user_id is None:
        user_id = get_user_id_from_username(client, username)
    elif username is not None and user_id is not None:
        logger.warning("Both `username` and `user_id` are provided. `user_id` will be used.")

    if user_id is None:
        raise NotFoundError(f"Couldn't find user {username}")
    obj = ps.RetrieveStory(user_id=user_id)
    resp = client.post_retrieve_story(obj).json()
    items = resp['reel'].get('items')
    return [models.Story.parse(i) for i in items]

