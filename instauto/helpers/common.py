import json

from requests import Response


def is_resp_ok(resp: Response) -> bool:
    if not resp.ok:
        return False
    if not resp.content:
        return False
    try:
        d = resp.json()
    except json.JSONDecodeError:
        return False
    return d['status'] == 'ok'
