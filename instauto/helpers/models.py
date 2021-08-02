import dataclasses

from typing import ByteString, List, Optional, Tuple


@dataclasses.dataclass
class FriendshipStatus:
    following: bool
    is_private: Optional[bool]
    incoming_request: Optional[bool]
    outgoing_request: Optional[bool]
    is_bestie: bool
    is_restricted: bool

    @classmethod
    def parse(cls, friendship_status: dict) -> "FriendshipStatus":
        return cls(
            friendship_status['following'], friendship_status.get('is_private'),
            friendship_status.get('incoming_request'), friendship_status['outgoing_request'],
            friendship_status['is_bestie'], friendship_status['is_restricted']
        )


@dataclasses.dataclass
class AccountBadge:
    pass

    @classmethod
    def parse(cls, account_badge: dict) -> "AccountBadge":
        if account_badge is not None:
            raise Exception("Parsing of account badge not implemented, please open an issue" \
                            "on Github. Account badge dict:", account_badge)
        return cls()


@dataclasses.dataclass
class User:
    pk: int
    username: str
    full_name: str
    is_private: bool
    profile_pic_url: str
    profile_pic_id: Optional[str]
    is_verified: Optional[bool]
    has_anonymous_profile_picture: Optional[bool]
    account_badges: List[AccountBadge]
    friendship_status: Optional[FriendshipStatus]
    latest_reel_media: Optional[int]
    live_broadcast_id: Optional[str]

    @classmethod
    def parse(cls, user: dict) -> "User":
        return cls(
            user['pk'], user['username'], user['full_name'], user['is_private'],
            user['profile_pic_url'], user.get('profile_pic_id'), user.get('is_verified'),
            user.get('has_anonymous_profile_picture'),
            [AccountBadge.parse(a) for a in user.get('account_badges') or []],
            FriendshipStatus.parse(user['friendship_status']) if user.get('friendship_status') else None,
            user.get('latest_reel_media'), user.get('live_broadcast_id')
        )


@dataclasses.dataclass
class Tag:
    id: int
    name: str
    media_count: int
    formatted_media_count: str
    search_result_subtitle: str
    profile_pic_url: str
    use_default_avatar: bool

    @classmethod
    def parse(cls, tag: dict) -> "Tag":
        return cls(
            tag['id'], tag['name'], tag['media_count'], tag['formatted_media_count'],
            tag['search_result_subtitle'], tag['profile_pic_url'], tag['use_default_avatar']
        )


@dataclasses.dataclass
class ImageVersion:
    key: str
    width: int
    height: int
    url: str
    scans_profile: Optional[str]
    estimated_scans_sizes: List[int]

    @classmethod
    def parse(cls, key: str, image_version: dict) -> Optional["ImageVersion"]:
        if cls is None:
            return None
        return cls(
            key, image_version['width'], image_version['height'], image_version['url'],
            image_version.get('scans_profile'), image_version.get('estimated_scans_sizes') or []
        )


@dataclasses.dataclass
class VideoVersion:
    type: int
    width: int
    height: int
    url: str
    id: str

    @classmethod
    def parse(cls, vv: dict) -> "VideoVersion":
        return cls(vv['type'], vv['width'], vv['height'], vv['url'], vv['id'])


@dataclasses.dataclass
class MusicAssetInfo:
    audio_cluster_id: str
    id: str
    title: str
    subtitle: str
    display_artist: str
    cover_artwork_uri: str
    cover_artwork_thumbnail_uri: str
    progressive_download_url: str
    reactive_audio_download_url: str
    highlight_start_times_in_ms: List[int]
    is_explicit: bool
    dash_manifest: str
    has_lyrics: str
    audio_asset_id: str
    duration_in_ms: str
    dark_message: str
    allows_saving: bool

    @classmethod
    def parse(cls, mai: dict) -> "MusicAssetInfo":
        return cls(
            mai['audio_cluster_id'], mai['id'], mai['title'], mai['subtitle'], mai['display_artist'],
            mai['cover_artwork_uri'], mai['cover_artwork_thumbnail_uri'], mai['progressive_download_url'],
            mai['reactive_audio_download_url'], mai['highlight_start_times_in_ms'],
            mai['is_explicit'], mai['dash_manifest'], mai['has_lyrics'], mai['audio_asset_id'],
            mai['duration_in_ms'], mai['dark_message'], mai['allows_saving']
        )


@dataclasses.dataclass
class ConsumptionInfo:
    is_bookmarked: bool
    should_mute_audio_reason: str
    is_trending_in_clips: bool

    @classmethod
    def parse(cls, ci) -> "ConsumptionInfo":
        return cls(ci['is_bookmarked'], ci['should_mute_audio_reason'], ci['is_trending_in_clips'])


@dataclasses.dataclass
class MusicInfo:
    music_asset_info: MusicAssetInfo
    music_consumption_info: ConsumptionInfo

    @classmethod
    def parse(cls, music_info: dict) -> "MusicInfo":
        return cls(MusicAssetInfo.parse(music_info['music_asset_info']),
                   ConsumptionInfo.parse(music_info['music_consumption_info']))


@dataclasses.dataclass
class Usertag:
    user: User
    position: Tuple[float, float]
    start_time_in_video_in_sec: Optional[float]
    duration_video_in_sec: Optional[float]

    @classmethod
    def parse(cls, user_tag: dict) -> "Usertag":
        return cls(
            User.parse(user_tag['user']), user_tag['position'], user_tag['start_time_in_video_in_sec'],
            user_tag['duration_in_video_in_sec']
        )


@dataclasses.dataclass
class SoundInfo:
    audio_asset_id: str
    progressive_download_url: str
    dash_manifest: str
    ig_artist: User
    should_mute_audio: bool
    original_media_id: str
    hide_remixing: bool
    duration_in_ms: int
    time_created: int
    original_audio_title: str
    consumption_info: ConsumptionInfo
    allow_creator_to_rename: bool
    can_remix_be_shared_to_fb: bool
    formatted_clips_media_count: int

    @classmethod
    def parse(cls, si: dict) -> "SoundInfo":
        return cls(
            si['audio_asset_id'], si['progressive_download_url'], si['dash_manifest'],
            User.parse(si['ig_artist']), si['should_mute_audio'], si['original_media_id'],
            si['hide_remixing'], si['duration_in_ms'], si['time_created'], si['original_audio_title'],
            ConsumptionInfo.parse(si['consumption_info']), si['allow_creator_to_rename'],
            si['can_remix_be_shared_to_fb'], si['formatted_clips_media_count']
        )


@dataclasses.dataclass
class AudioInfo:
    pass

    @classmethod
    def parse(cls, audio_info: dict) -> "AudioInfo":
        if audio_info is not None:
            raise Exception("Parsing of audio info not implemented, please open an issue" \
                            "on Github. Audio info dict:", audio_info)
        return cls()


@dataclasses.dataclass
class MashupInfo:
    mashups_allowed: bool
    can_toggle_mashups_allowed: bool
    has_been_mashed_up: bool
    formatted_mashups_count: Optional[int]
    original_media: Optional[int]

    @classmethod
    def parse(cls, mashup_info: dict) -> "MashupInfo":
        return cls(
            mashup_info['mashups_allowed'], mashup_info['can_toggle_mashups_allowed'],
            mashup_info['has_been_mashed_up'], mashup_info.get('formatted_mashups_count'),
            mashup_info.get('original_media')
        )


@dataclasses.dataclass
class NuxInfo:
    @classmethod
    def parse(cls, nux_info: dict) -> "NuxInfo":
        if nux_info is not None:
            raise Exception("Parsing of nux info not implemented, please open an issue" \
                            "on Github. Account badge dict:", nux_info)
        return cls()


@dataclasses.dataclass
class ViewerInteractionSettings:
    @classmethod
    def parse(cls, viewer_interaction_settings: dict) -> "ViewerInteractionSettings":
        if viewer_interaction_settings is not None:
            raise Exception("Parsing of viewer interaction settings not implemented, please open an issue" \
                            "on Github. Viewer interaction settings dict:", viewer_interaction_settings)
        return cls()


@dataclasses.dataclass
class BrandedContentTagInfo:
    can_add_tag: bool

    @classmethod
    def parse(cls, bcti: dict) -> "BrandedContentTagInfo":
        return cls(bcti['can_add_tag'])


@dataclasses.dataclass
class ShoppingInfo:
    @classmethod
    def parse(cls, shopping_info: dict) -> "ShoppingInfo":
        if ShoppingInfo is not None:
            raise Exception("Parsing of shopping info not implemented, please open an issue" \
                            "on Github. Shopping info dict:", shopping_info)
        return cls()


@dataclasses.dataclass
class AudioReatrributionInfo:
    should_allow_restore: bool

    @classmethod
    def parse(cls, audio_reatrribution_info: dict) -> "AudioReatrributionInfo":
        return cls(audio_reatrribution_info['should_allow_restore'])


@dataclasses.dataclass
class AdditionalAudioInfo:
    additional_audio_username: Optional[str]
    audio_reatrribution_info: AudioReatrributionInfo

    @classmethod
    def parse(cls, additional_audio_info: dict) -> "AdditionalAudioInfo":
        return cls(
            additional_audio_info.get('additional_audio_username'),
            AudioReatrributionInfo.parse(additional_audio_info['audio_reattribution_info'])
        )


@dataclasses.dataclass
class ClipsMetadata:
    music_info: Optional[MusicInfo]
    original_sound_info: Optional[SoundInfo]
    hybrid_audio_info: Optional[AudioInfo]
    audio_type: str
    music_canonical_id: str
    featured_label: Optional[str]
    mashup_info: Optional[MashupInfo]
    nux_info: Optional[NuxInfo]
    viewer_interaction_settings: Optional[ViewerInteractionSettings]
    branded_content_tag_info: Optional[BrandedContentTagInfo]
    shopping_info: Optional[ShoppingInfo]
    additional_audio_info: Optional[AdditionalAudioInfo]
    is_shared_to_fb: bool

    @classmethod
    def parse(cls, cm: dict) -> "ClipsMetadata":
        return cls(
            MusicInfo.parse(cm['music_info']) if cm.get('music_info') else None,
            SoundInfo.parse(cm['original_sound_info']) if cm.get('original_sound_info') else None,
            AudioInfo.parse(cm['hybrid_audio_info']) if cm.get('hybrid_audio_info') else None,
            cm['audio_type'], cm['music_canonical_id'], cm.get('featured_label'),
            MashupInfo.parse(cm['mashup_info']) if cm.get('mashup_info') else None,
            NuxInfo.parse(cm['nux_info']) if cm.get('nux_info') else None,
            ViewerInteractionSettings.parse(cm['viewer_interaction_settings']) if cm.get(
                'viewer_interaction_settings') else None,
            BrandedContentTagInfo.parse(cm['branded_content_tag_info']) if cm.get('branded_content_tag_info') else None,
            ShoppingInfo.parse(cm['shopping_info']) if cm.get('shopping_info') else None,
            AdditionalAudioInfo.parse(cm['additional_audio_info']) if cm.get('additional_audio_info') else None,
            cm['is_shared_to_fb']
        )


@dataclasses.dataclass
class MediaCroppingInfo:
    key: str
    crop_left: float
    crop_right: float
    crop_top: float
    crop_bottom: float

    @classmethod
    def parse(cls, key: str, mci: dict) -> "MediaCroppingInfo":
        return cls(
            key, mci['crop_left'], mci['crop_right'], mci['crop_top'], mci['crop_bottom']
        )


@dataclasses.dataclass
class Post:
    taken_at: int
    pk: int
    id: str
    device_timestamp: Optional[int]
    media_type: int
    code: Optional[str]
    client_cache_key: Optional[str]
    filter_type: Optional[int]
    should_request_ads: Optional[bool]
    user: User
    can_viewer_reshare: Optional[bool]
    caption_is_edited: bool
    like_and_view_counts_disabled: Optional[bool]
    is_commercial: Optional[bool]
    is_paid_partnership: Optional[bool]
    comment_likes_enabled: Optional[bool]
    comment_threading_enabled: Optional[bool]
    has_more_comments: Optional[bool]
    max_num_visible_preview_comments: Optional[int]
    can_view_more_preview_comments: Optional[bool]
    comment_count: Optional[int]
    hide_view_all_comment_entrypoint: Optional[bool]
    inline_composer_display_condition: Optional[str]
    inline_composer_imp_trigger_time: Optional[int]
    image_versions2: List[ImageVersion]
    original_width: Optional[int]
    original_height: Optional[int]
    like_count: int
    has_liked: bool
    top_likers: List[str]
    photo_of_you: bool
    usertags: List[Usertag]
    can_see_insights_as_brand: Optional[bool]
    video_versions: List[VideoVersion]
    has_audio: Optional[bool]
    video_duration: Optional[float]
    view_count: Optional[int]
    play_count: Optional[int]
    caption: str
    can_viewer_save: bool
    organic_tracking_token: Optional[str]
    sharing_friction_info: Optional[bool]
    product_type: Optional[str]
    is_in_profile_grid: Optional[bool]
    profile_grid_control_enabled: Optional[bool]
    deleted_reason: Optional[int]
    integrity_review_decision: str
    clips_metadata: Optional[ClipsMetadata]
    media_cropping_info: List[MediaCroppingInfo]

    @classmethod
    def parse(cls, post: dict) -> "Post":
        v = post.get('image_versions2')
        if v is not None:
            image_versions = [ImageVersion.parse('', p) for p in v['candidates']]
            image_versions.extend([ImageVersion.parse(k, v) for k, v in (v.get('additional_candidates') or {}).items()])
        else:
            image_versions = []
        return cls(
            post['taken_at'], post['pk'], post['id'], post.get('device_timestamp'),
            post['media_type'], post.get('code'), post.get('client_cache_key'), post.get('filter_type'),
            post.get('should_request_ads'), User.parse(post['user']),
            post.get('can_viewer_reshare'), post['caption_is_edited'],
            post.get('like_and_view_counts_disabled'), post.get('is_commercial'),
            post.get('is_paid_partnership'), post.get('comment_likes_enabled'),
            post.get('comment_threading_enabled'), post.get('has_more_comments'),
            post.get('max_num_visible_preview_comments'), post.get('can_view_more_preview_comments'),
            post.get('comment_count'), post.get('hide_view_all_comment_entrypoint'),
            post.get('inline_composer_display_condition'), post.get('inline_composer_imp_trigger_time'),
            image_versions, post.get('original_width'), post.get('original_height'), post['like_count'],
            post['has_liked'], post.get('top_likers') or [], post['photo_of_you'],
            [Usertag.parse(u) for u in (post.get('usertags') or {'in': []})['in']],
            post.get('can_see_insights_as_brand'),
            [VideoVersion.parse(v) for v in post.get('video_versions') or []],
            post.get('has_audio'), post.get('video_duration'), post.get('view_count'),
            post.get('play_count'), post['caption'], post['can_viewer_save'],
            post.get('organic_tracking_token'), post.get('sharing_friction_info'), post.get('product_type'),
            post.get('is_in_profile_grid'), post.get('profile_grid_control_enabled'),
            post.get('deleted_reason'), post.get('integrity_review_decision'),
            ClipsMetadata.parse(post['clips_metadata']) if post.get('clips_metadata') else None,
            [MediaCroppingInfo.parse(k, v) for k, v in (post.get('media_cropping_info') or {}).items()]
        )


@dataclasses.dataclass
class SharingFrictionInfo:
    bloks_app_url: Optional[str]
    should_have_sharing_friction: bool

    @classmethod
    def parse(cls, sfi: dict) -> "SharingFrictionInfo":
        return cls(sfi.get('bloks_app_url'), sfi['should_have_sharing_friction'])


@dataclasses.dataclass
class Story:
    can_reply: bool
    can_reshare: bool
    can_see_insights_as_brand: bool
    can_send_custom_emojis: Optional[bool]
    caption: Optional[str]
    caption_is_edited: bool
    caption_position: float
    client_cache_key: str
    code: str
    commerciality_status: str
    deleted_reason: int
    device_timestamp: int
    expiring_at: int
    filter_type: int
    has_audio: Optional[bool]
    id: str
    image_versions2: List[ImageVersion]
    imported_taken_at: Optional[int]
    integrity_review_decision: str
    is_commercial: bool
    is_dash_eligible: Optional[int]
    is_in_profile_grid: bool
    is_paid_partnership: bool
    is_reel_media: bool
    is_unified_video: bool
    like_and_view_counts_disabled: bool
    media_type: int
    number_of_qualities: int
    organic_tracking_token: str
    original_height: int
    original_width: int
    photo_of_you: bool
    pk: int
    playlist_eligibility: bool
    product_type: str
    profile_grid_control_enabled: bool
    sharing_friction_info: SharingFrictionInfo
    supports_reel_reactions: bool
    taken_at: int
    user: User
    video_codec: Optional[str]
    video_dash_manifest: Optional[str]
    video_duration: Optional[float]
    video_versions: List[VideoVersion]

    @classmethod
    def parse(cls, story: dict) -> "Story":
        v = story.get('image_versions2')
        if v is not None:
            image_versions = [ImageVersion.parse('', p) for p in v['candidates']]
            image_versions.extend([ImageVersion.parse(k, v) for k, v in (v.get('additional_candidates') or {}).items()])
        else:
            image_versions = []
        return cls(
            story['can_reply'], story['can_reshare'], story['can_see_insights_as_brand'],
            story.get('can_send_custom_emojis'), story.get('caption'), story['caption_is_edited'], story['caption_position'],
            story['client_cache_key'], story['code'], story['commerciality_status'], story['deleted_reason'],
            story['device_timestamp'], story['expiring_at'], story['filter_type'], story.get('has_audio'), story['id'],
            image_versions, story.get('imported_taken_at'), story['integrity_review_decision'], story['is_commercial'],
            story.get('is_dash_eligible'), story['is_in_profile_grid'], story['is_paid_partnership'], story['is_reel_media'],
            story['is_unified_video'], story['like_and_view_counts_disabled'], story['media_type'],
            story.get('number_of_qualities', 0), story['organic_tracking_token'], story['original_height'],
            story['original_width'], story['photo_of_you'], story['pk'], story['playlist_eligibility'],
            story['product_type'], story['profile_grid_control_enabled'],
            SharingFrictionInfo.parse(story['sharing_friction_info']), story['supports_reel_reactions'],
            story['taken_at'], User.parse(story['user']), story.get('video_codec'), story.get('video_dash_manifest'),
            story.get('video_duration'), [VideoVersion.parse(v) for v in story.get('video_versions') or []]
        )
