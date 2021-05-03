from . import common as cmmn


class ActivityGet(cmmn.Base):
  def __init__(self, mark_as_seen: bool = False, *args, **kwargs):
    self.mark_as_seen = mark_as_seen
    super().__init__(*args, **kwargs)

