from typing import Optional

from . import common as cmmn


class FeedGet(cmmn.Base):
  phone_id: str = ''
  battery_level: str = ''
  timezone_offset: str = ''
  device_id: str = ''
  _uuid: str = ''
  is_charging: str = ''
  is_dark_mode: str = ''
  session_id: str = ''
  bloks_versioning_id: str = ''
  max_id: Optional[str] = None

  def __init__(self, reason: str = 'cold_start_fetch', *args, **kwargs):
    self.reason = reason
    self.is_pull_to_refresh = reason == 'pull_to_refresh'
    self.will_sound_on = 0
    super().__init__(*args, **kwargs)
