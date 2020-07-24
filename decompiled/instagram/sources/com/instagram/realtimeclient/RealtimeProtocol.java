package com.instagram.realtimeclient;

public class RealtimeProtocol {
    public static final String ADD_DIRECT_V2_INDICATE_ACTIVITY_TEMPLATE = "/direct_v2/threads/:direct_v2_thread_id/activity_indicator_id/:direct_v2_activity_indicator_id";
    public static final String DIRECT_V2 = "/direct_v2";
    public static final String DIRECT_V2_ACTIVITY_INDICATOR = "activity_indicator_id";
    public static final String DIRECT_V2_ACTIVITY_INDICATOR_ID = "direct_v2_activity_indicator_id";
    public static final String DIRECT_V2_ADMINS_TEMPLATE = "/direct_v2/threads/:direct_v2_thread_id/admin_user_ids/:direct_v2_user_id";
    public static final String DIRECT_V2_ADMIN_APPROVAL_REQUIRED_TEMPLATE = "/direct_v2/threads/:direct_v2_thread_id/approval_required_for_new_members";
    public static final String DIRECT_V2_ADMIN_IDS = "admin_user_ids";
    public static final String DIRECT_V2_APPROVAL_REQUIRED_FOR_NEW_MEMBERS = "approval_required_for_new_members";
    public static final String DIRECT_V2_HAS_SEEN = "has_seen";
    public static final String DIRECT_V2_INBOX = "inbox";
    public static final String DIRECT_V2_INBOX_NEWTHREAD_PREFIX = "/direct_v2/inbox/threads";
    public static final String DIRECT_V2_INBOX_NEWTHREAD_TEMPLATE = "/direct_v2/inbox/threads/:direct_v2_thread_id";
    public static final String DIRECT_V2_INBOX_PREFIX = "/direct_v2/inbox";
    public static final String DIRECT_V2_ITEM_ID = "direct_v2_item_id";
    public static final String DIRECT_V2_ITEM_REACTIONS = "reactions";
    public static final String DIRECT_V2_MESSAGE_POLICY_VIOLATION = "policy_violation";
    public static final String DIRECT_V2_MESSAGE_POLICY_VIOLATION_REPORTED = "reported_timestamp_ms";
    public static final String DIRECT_V2_MESSAGE_POLICY_VIOLATION_REVIEWED = "reviewed_timestamp_ms";
    public static final String DIRECT_V2_MESSAGE_POLICY_VIOLATION_VISIBILITY_CHANGED = "visibility";
    public static final String DIRECT_V2_PARTICIPANTS = "participants";
    public static final String DIRECT_V2_REACTION_LIKES = "likes";
    public static final String DIRECT_V2_SHH_MODE_ENABLED = "shh_mode_enabled";
    public static final String DIRECT_V2_STORIES = "visual_threads";
    public static final String DIRECT_V2_STORIES_PREFIX = "/direct_v2/visual_threads";
    public static final String DIRECT_V2_STORY = "visual_thread";
    public static final String DIRECT_V2_STORY_ACTION_BADGE = "visual_action_badge";
    public static final String DIRECT_V2_STORY_ACTION_BADGE_PREFIX = "/direct_v2/visual_action_badge";
    public static final String DIRECT_V2_STORY_INBOX = "visual_inbox";
    public static final String DIRECT_V2_STORY_INBOX_PREFIX = "/direct_v2/visual_inbox";
    public static final String DIRECT_V2_STORY_PREFIX = "/direct_v2/visual_thread";
    public static final String DIRECT_V2_THEME = "theme";
    public static final String DIRECT_V2_THEME_ID = "theme_id";
    public static final String DIRECT_V2_THEME_UPDATE_TEMPLATE = "/direct_v2/threads/:direct_v2_thread_id/theme/:theme_id";
    public static final String DIRECT_V2_THREAD = "threads";
    public static final String DIRECT_V2_THREAD_ID = "direct_v2_thread_id";
    public static final String DIRECT_V2_THREAD_MESSAGE_LIKE_TEMPLATE = "/direct_v2/threads/:direct_v2_thread_id/items/:direct_v2_item_id/reactions/likes/:direct_v2_user_id";
    public static final String DIRECT_V2_THREAD_MESSAGE_POLICY_VIOLATION_REPORTED_TEMPLATE = "/direct_v2/threads/:direct_v2_thread_id/items/:direct_v2_item_id/policy_violation/reported_timestamp_ms";
    public static final String DIRECT_V2_THREAD_MESSAGE_POLICY_VIOLATION_REVIEWED_TEMPLATE = "/direct_v2/threads/:direct_v2_thread_id/items/:direct_v2_item_id/policy_violation/reviewed_timestamp_ms";

    /* renamed from: DIRECT_V2_THREAD_MESSAGE_POLICY_VIOLATION_VISIBILITY_CHANGED_TEMPLATE */
    public static final String f157x9385be2b = "/direct_v2/threads/:direct_v2_thread_id/items/:direct_v2_item_id/policy_violation/visibility";
    public static final String DIRECT_V2_THREAD_MESSAGE_TEMPLATE = "/direct_v2/threads/:direct_v2_thread_id/items/:direct_v2_item_id";
    public static final String DIRECT_V2_THREAD_POLICY_VIOLATION_REPORTED_TEMPLATE = "/direct_v2/threads/:direct_v2_thread_id/policy_violation/reported_timestamp_ms";
    public static final String DIRECT_V2_THREAD_POLICY_VIOLATION_REVIEWED_TEMPLATE = "/direct_v2/threads/:direct_v2_thread_id/policy_violation/reviewed_timestamp_ms";
    public static final String DIRECT_V2_THREAD_POLICY_VIOLATION_VISIBILITY_CHANGED_TEMPLATE = "/direct_v2/threads/:direct_v2_thread_id/policy_violation/visibility";
    public static final String DIRECT_V2_THREAD_PREFIX = "/direct_v2/threads";
    public static final String DIRECT_V2_THREAD_SHH_MODE_ENABLED_TEMPLATE = "/direct_v2/threads/:direct_v2_thread_id/shh_mode_enabled";
    public static final String DIRECT_V2_UNSEEN_COUNT = "unseen_count";
    public static final String DIRECT_V2_USER_ID = "direct_v2_user_id";
    public static final String DIRECT_V2_VIDEO_CALL_IDENTIFIER = "video_call_identifier";
    public static final String DIRECT_V2_VIDEO_CALL_IDENTIFIER_TEMPLATE = "/direct_v2/threads/:direct_v2_thread_id/video_call_identifier";
    public static final String IG_LIVE = "/broadcast";
    public static final String INBOX = "inbox";
    public static final String ITEMS = "items";
    public static final String REPLACE_DIRECT_V2_MESSAGE_HAS_SEEN_TEMPLATE = "/direct_v2/threads/:direct_v2_thread_id/participants/:direct_v2_user_id/has_seen";
    public static final String REPLACE_USERS_ACCOUNT_STATE_TEMPLATE = "/users/:users_user_id/status";
    public static final String REPLACE_USERS_FRIENDSHIP_STATUS_BLOCKING_TEMPLATE = "/users/:users_user_id/friendship_status/blocking";

    /* renamed from: REPLACE_USERS_FRIENDSHIP_STATUS_IS_MESSAGING_ONLY_BLOCKING_TEMPLATE */
    public static final String f158xeaf2317 = "/users/:users_user_id/friendship_status/is_messaging_only_blocking";

    /* renamed from: REPLACE_USERS_FRIENDSHIP_STATUS_MESSAGING_PSEUDO_BLOCKING_TEMPLATE */
    public static final String f159xc82f5fc8 = "/users/:users_user_id/friendship_status/is_messaging_pseudo_blocking";
    public static final String USERS = "/users";
    public static final String USERS_ACCOUNT_STATUS = "status";
    public static final String USERS_BLOCKING = "blocking";
    public static final String USERS_FRIENDSHIP_STATUS = "friendship_status";
    public static final String USERS_IS_MESSAGING_ONLY_BLOCKING = "is_messaging_only_blocking";
    public static final String USERS_IS_MESSAGING_PSEUDO_BLOCKING = "is_messaging_pseudo_blocking";
    public static final String USERS_USER_ID = "users_user_id";
}
