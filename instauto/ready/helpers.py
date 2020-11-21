import random
import string
from typing import List


def _get_fill_ins_from_comment(comment: str) -> List[str]:
    """Get all format strings in the comment"""
    return [tup[1] for tup in string.Formatter().parse(comment) if tup[1] is not None]


def fill_comment(comment: str, user: dict) -> str:
    """Fill in the format strings in a comment from the user object. Currently, only top-level keys are supported."""
    fill_ins = _get_fill_ins_from_comment(comment)
    for fill_in in fill_ins:
        comment = comment.format(**{fill_in: user[fill_in]})
    return comment


def get_random_num(sr: int, er: int, exclude: List[int]) -> int:
    n = random.randint(sr, er)
    while n in exclude:
        n = random.randint(sr, er)
    exclude.append(n)
    return n
