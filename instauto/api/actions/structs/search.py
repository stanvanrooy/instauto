import time


class Username:
    timezone_offset: int
    q: str
    count: int

    @classmethod
    def create(cls, username: str, count: int):
        i = cls()
        i.timezone_offset = str(time.localtime().tm_gmtoff)
        i.q = username
        i.count = count
        return i
