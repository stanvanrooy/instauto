import random
import time
import logging
import typing

from instauto.helpers.search import *
from instauto.helpers.post import retrieve_posts_from_user, like_post, comment_post
from instauto.helpers.friendships import get_followers, follow_user
from instauto.api.exceptions import AuthorizationError

from ._helpers import fill_comment, get_random_num

logger = logging.getLogger("Instauto")
logger.setLevel(logging.INFO)


def _get_posts(client: ApiClient, limit: int, user_id: str) -> typing.Tuple[List[dict], str]:
    """Helper function for retrieving posts from a user"""
    try:
        # if the List is empty and no `AuthorizationError` was thrown, we assume the user has no posts
        return retrieve_posts_from_user(client, limit, user_id=user_id), "User has no posts"
    except AuthorizationError as e:
        return [], str(e)


def _do_likes(client: ApiClient, limit: int, posts: List[dict]) -> None:
    already_liked = []
    while len(already_liked) < limit:
        pi = get_random_num(0, len(posts) - 1, already_liked)
        post = posts[pi]
        logger.info(f"Liking post {post['id']} of {post['user']['username']}")
        like_post(client, post['id'])


def _do_comments(client: ApiClient, limit: int, comments: List[str], user: dict, posts: List[dict]) -> None:
    already_commented_comments = []
    already_commented_posts = []

    while len(already_commented_posts) < limit:
        # get random comment
        comment = comments[get_random_num(0, len(comments) - 1, already_commented_comments)]
        comment = fill_comment(comment, user)

        # get random post
        pi = get_random_num(0, len(posts) - 1, already_commented_posts)
        post = posts[pi]
        logger.info(f"Commenting {comment} on post {post['id']} of user {user['username']}")
        # comment random comment on random post
        comment_post(client, post['id'], comment)


def interact_with_followers_of_account(client: ApiClient, target: str, delay: typing.Tuple[float, float],
                                       duration: float, likes_per_follower: typing.Tuple[int, int],
                                       comments_per_follower: typing.Tuple[int, int], follow_chance: int,
                                       comments: List[str] = None):

    if comments_per_follower[1] > 0 and comments is None:
        raise ValueError("No comments provided.")
    if comments_per_follower[1] > len(comments):
        raise ValueError("The limit for comments per user is set higher then the length of the set of comments")
    if follow_chance < 0 or follow_chance > 100:
        raise ValueError("Follow chance needs to be a value between 0 and 100")

    target_user_id = get_user_id_from_username(client, target)
    followers = get_followers(client, target_user_id, int(duration // delay[1]))
    logger.info(f"Retrieved a total of {len(followers)} followers from {target}")

    for follower in followers:
        logger.info(f"Retrieving posts from {follower['username']}")

        posts, message = _get_posts(client, likes_per_follower[1] + comments_per_follower[1], follower['pk'])
        if not posts:
            logger.info(f"Can't retrieve posts from {follower['username']}: {message}")
            continue

        logger.info(f"Retrieved {len(posts)} posts from {follower['username']}")
        _do_likes(client, min(random.randint(*likes_per_follower), len(posts)), posts)
        _do_comments(client, min(random.randint(*comments_per_follower), len(posts)), comments, follower, posts)

        r = random.randint(0, 100)
        if r < int(follow_chance * 100):
            logger.info(f"Following user {follower['username']}")
            follow_user(client, user_id=follower['pk'])
        time.sleep(delay)


# TODO: add de-duplication functionality, so we do not like/comment on the same user multiple times.
# TODO: add multi-level comment fill-in functionality
