import orjson
from requests import Response


def is_resp_ok(resp: Response) -> bool:
    if not resp.ok:
        return False
    if not resp.content:
        return False
    try:
        d = orjson.loads(resp.text)
    except orjson.JSONDecodeError:
        return False
    return d['status'] == 'ok'

