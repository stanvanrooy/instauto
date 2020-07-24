package p000X;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.1Nk  reason: invalid class name and case insensitive filesystem */
public enum C28841Nk {
    ADD_PHONE_NUMBER("instagram://change_phone"),
    REQUEST_CONFIRM_PHONE_NUMBER("instagram://confirm_phone"),
    REQUEST_CONFIRM_EMAIL_ADDRESS("instagram://confirm_email_address"),
    REQUEST_CONFIRM_EMAIL("instagram://confirm_email"),
    REQUEST_CHANGE_EMAIL("instagram://change_email"),
    REQUEST_CHANGE_PASSWORD("instagram://change_password"),
    REQUEST_TURN_ON_PUSH("instagram://enable_push"),
    REQUEST_TURN_ON_SMS("instagram://enable_sms"),
    REQUEST_ZERO_VIDEO_SETTING("instagram://zero_video_setting"),
    REQUEST_DATA_SAVER_MODE_SETTING("instagram://datasaver"),
    REQUEST_APPEARANCE_THEME_SETTING("instagram://theme_setting"),
    REQUEST_APP_LANGUAGE_SETTING("instagram://language_setting"),
    REQUEST_GDPR_CONSENT("instagram://gdpr_consent"),
    REQUEST_GDPR_DISMISS("instagram://gdpr_dismiss"),
    REQUEST_CLAIM_FB_PAGE("instagram://claim_page/"),
    REQUEST_DIRECT_INBOX_CAMERA("instagram://direct-inbox-camera"),
    REQUEST_BUSINESS_CONVERSION("instagram://business_conversion"),
    REQUEST_CREATOR_CONVERSION("instagram://creator_account_conversion"),
    REQUEST_SHARE_BUSINESS_POST_TO_STORY("instagram://share_business_post_to_story"),
    REQUEST_SHOUTOUT_TO_BUSINESS("instagram://shoutout_to_business"),
    REQUEST_BRANDED_CONTENT_APPROVALS_SETTINGS("instagram://branded_content_approval_settings"),
    REQUEST_BRANDED_CONTENT_LEARN_MORE("instagram://branded_content"),
    REQUEST_SHOPPING_CREATOR_NUX("instagram://shopping_creator_nux"),
    REQUEST_SHOPPING_GET_STARTED("instagram://shopping/get_started"),
    REQUEST_SHOPPING_HOME("instagram://shopping_home"),
    REQUEST_BUSINESS_SIGN_UP("instagram://business_signup"),
    REQUEST_FACEBOOK_CONNECT("instagram://facebook_connect"),
    REQUEST_REAUTHORIZE_FACEBOOK("instagram://re_auth_facebook"),
    REQUEST_CONTACT_IMPORT("instagram://contact_import"),
    REQUEST_CONTACT_PERMISSION("instagram://contact_permission"),
    REQUEST_SELF_FOLLOWING("instagram://self_following"),
    REQUEST_ADD_PROFILE_PHOTO("instagram://add_profile_photo"),
    OPEN_FEEDBACK_FLOW("instagram://open_leave_feedback_flow"),
    ACCOUNT_PRIVACY_SHEET("instagram://account_privacy"),
    CREATE_SECONDARY_ACCOUNT("instagram://create_new_account"),
    REQUEST_TWOFAC_TOTP("instagram://twofac_totp"),
    REQUEST_NAMETAG("instagram://nametag"),
    REQUEST_ACCOUNT_TRANSPARENCY("instagram://account_transparency"),
    REQUEST_COMMENT_CONTROL("instagram://comment_control"),
    REQUEST_YOUR_ACTIVITY("instagram://usage_insights"),
    REQUEST_OPEN_FAVORITES("instagram://open_favorites_home"),
    REQUEST_OPEN_FEED_ARCHIVE("instagram://open_feed_archive"),
    REQUEST_AD_ACTIVITY("instagram://ad_activity"),
    REQUEST_ADS_DATA_PREFERENCES_NOTICE("instagram://ads_data_preferences_notice"),
    AUTO_CROSSPOST_TO_FB("instagram://share_post_fb"),
    REQUEST_CREATE_SHOPPING_TAGGED_POST("instagram://create_shopping_tagged_post"),
    REQUEST_PROMOTE("instagram://promote"),
    INTEROP_UPGRADE("instagram://interop_upgrade"),
    REQUEST_BUSINESS_DONATE_SETTINGS("instagram://charitable_giving_business_settings"),
    WEB_SITE_HTTP("http://"),
    WEB_SITE_HTTPS("https://"),
    OPEN_FB_PMA("fb-pma://login"),
    SHOW_DIALOG_FB_PAGE_NOTIFICATION("fb-pma://show_dialog"),
    EDIT_PROFILE("instagram://editprofile"),
    EDIT_FULL_NAME("instagram://editname"),
    EDIT_BIO("instagram://edit_bio"),
    LOCATION_TRANSPARENCY_PRODUCER_HIGH_CONFIDENCE("instagram://location_high_confidence"),
    LOCATION_TRANSPARENCY_PRODUCER_LOW_CONFIDENCE("instagram://location_low_confidence"),
    STORY_CAMERA_WITH_STICKER("instagram://story_camera_with_sticker"),
    NEW_VIDEO_CALL("instagram://new_video_call"),
    CREATE_DONATION_STORY("instagram://create_donation_story"),
    CREATE_MESSENGER_ROOM("instagram://create_messenger_room"),
    ACTIVE_PROMOTIONS("instagram://active_promotions"),
    TURN_ON_SHOPPING_AUTOHIGHLIGHT("instagram://turn_on_shopping_auto_highlight"),
    QUICK_REPLIES("instagram://quick_replies"),
    FOLLOW_AND_INVITE_FRIENDS("instagram://follow_and_invite_friends"),
    REQUEST_AD_PAY_NOW("instagram://ads_pay_now"),
    OPEN_GUIDE_CHANNEL("instagram://guide_sectional_channel");
    
    public final String A00;

    public static C28841Nk A00(EnumSet enumSet, String str, AnonymousClass0C1 r7) {
        if (enumSet.remove(A0J) && A0J.A01(str, r7)) {
            return A0J;
        }
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.US);
            Iterator it = enumSet.iterator();
            while (it.hasNext()) {
                C28841Nk r1 = (C28841Nk) it.next();
                if (r1.A01(lowerCase, r7)) {
                    return r1;
                }
            }
        }
        return null;
    }

    public boolean A01(String str, AnonymousClass0C1 r3) {
        return str.startsWith(this.A00);
    }

    /* access modifiers changed from: public */
    C28841Nk(String str) {
        this.A00 = str;
    }
}
