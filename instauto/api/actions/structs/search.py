from . import common as cmmn
import time


class Username(cmmn.Base):
    timezone_offset: int
    q: str
    count: int

    def __init__(self, q: str, count: int, *args, **kwargs):
        self.q = q
        self.count = count
        self.timezone_offset = str(time.localtime().tm_gtoff)
        super().__init__(*args, **kwargs)
