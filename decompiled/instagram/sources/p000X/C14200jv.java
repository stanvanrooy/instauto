package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;

/* renamed from: X.0jv  reason: invalid class name and case insensitive filesystem */
public final class C14200jv {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "layout";
            case 2:
                return "shopping_pref_key";
            case 3:
                return "igLivePreferences";
            case 4:
                return "hiddenLiveCommentPreferences";
            case 5:
                return "FilterPreferences";
            case 6:
                return "ExploreCachePreferences";
            case 7:
                return "CAMERA_EFFECT_PERSISTENCE";
            case 8:
                return "NAME_COMMENT_EMOJIS_SHARED_PREF";
            case 9:
                return "CONTINUOUS_CONTACT_UPLOAD_SETTING_STORE";
            case 10:
                return "QuickPromotionData";
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                return "hiddenReelPreferences";
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                return "reportUserPreferences";
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                return "research_tool_preference";
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                return "hiddenLiveVideoPreferences";
            case 15:
                return "facebookLinkageServerState";
            case 16:
                return "direct_v2_preferences";
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                return "AutoCompleteChallengeService";
            case 18:
                return "AutoCompleteHashtagService";
            case 19:
                return "AutoCompletePlaceService";
            case 20:
                return "starredHidePreferences";
            case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                return "HiddenProductsPreferences";
            case C120125Dh.NUM_VIEW_TYPES /*22*/:
                return "ARClassv3";
            case 23:
                return "leadAdsPreferences";
            case 24:
                return "quickRepliesText";
            case 25:
                return "family_bridges_shared_prefs";
            case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                return "netegoItemHidePreferences";
            case 27:
                return "IgJobSchedulerPreferences";
            case 28:
                return "BanyanCache";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return "abandonment_rate";
            case 30:
                return "TimeSpentPreferences";
            case 31:
                return "contextual_nux_prefs";
            case 32:
                return "twitterPreferences";
            case 33:
                return "tumblrPreferences";
            case 34:
                return "QuickPromotionSurveyData";
            case 35:
                return "amebaPreferences";
            case 36:
                return "odnoklassnikiPreferences";
            case 37:
                return "searchDebugPreferences";
            case 38:
                return "selfUpdatePreferences";
            case 39:
                return "com.instagram.threadsapp.preferences.camera_preferences";
            case 40:
                return "threads_app_shutterhead_cache";
            case 41:
                return "com.instagram.threadsapp.preferences.post_capture_preferences";
            case 42:
                return "THREADS_APP_USER_PREFERENCES";
            case 43:
                return "com.instagram.threadsapp.preferences.internal_preferences";
            case 44:
                return "theme_preferences";
            case 45:
                return "lassoLinkageServerStateStore";
            case 46:
                return "PrefZeroRatingFilename";
            case 47:
                return "accountLinkageMetadata";
            case 48:
                return "com.instagram.threadsapp.preferences.automatic_status_preference_repository";
            case 49:
                return "com.instagram.threadsapp.main.impl.status.automatic.repository.LocationVisitLocalRepository";
            case AMD.MAX_LIKES_PER_FETCH /*50*/:
                return "com.instagram.threadsapp.main.impl.status.automatic.repository.CustomLocationStatusRepository";
            case 51:
                return "keywordBootstrapService";
            case 52:
                return "usersBootstrapService";
            case 53:
                return "USER_PREFERENCES";
            case 54:
                return "facebookPreferences";
            case 55:
                return "ig_pps_last_lookup_time_seconds";
            case 56:
                return "ig_privacy_options_last_review_followers_time_in_seconds";
            case 57:
                return "ig_mq_network_consent_prefs";
            case 58:
                return "ig_mq_network_consent_access_ts_pref";
            case 59:
                return "ig_camera_formats_ranking";
            case 60:
                return "ig_clips_drafts";
            case 61:
                return "bloks_tooltip_extension";
            case 62:
                return "presence_subscription_id";
            case 63:
                return "fbpay_ptt_auth_ticket_preference";
            default:
                return "photobooth";
        }
    }

    public static final boolean A01(Integer num) {
        switch (num.intValue()) {
            case 2:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
            case 15:
            case 16:
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
            case 18:
            case 19:
            case 20:
            case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
            case C120125Dh.NUM_VIEW_TYPES /*22*/:
            case 23:
            case 24:
            case 25:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 39:
            case 41:
            case 43:
            case 45:
            case 46:
            case 47:
            case 49:
            case AMD.MAX_LIKES_PER_FETCH /*50*/:
            case 51:
            case 52:
            case 54:
            case 57:
            case 58:
            case 62:
                return true;
            default:
                return false;
        }
    }
}
