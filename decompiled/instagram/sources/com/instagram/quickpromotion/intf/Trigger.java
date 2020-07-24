package com.instagram.quickpromotion.intf;

public enum Trigger {
    PROFILE_HEADER("instagram_profile_page", false),
    PROFILE_PROMPT("instagram_profile_page_prompt", false),
    PROFILE_TOOLTIP("instagram_self_profile_tooltip", false),
    PROFILE_OTHER_CHECKOUT_TOOLTIP("instagram_other_checkout_profile_tooltip", false),
    PROFILE_OTHER_HEADER("instagram_other_profile_page_header", false),
    PROFILE_OTHER_PROMPT("instagram_other_profile_page_prompt", false),
    PROFILE_OTHER_TOOLTIP("instagram_other_profile_tooltip", false),
    FEED_HEADER("instagram_feed_header", false),
    FEED_PROMPT("instagram_feed_prompt", false),
    FEED_SHARING_HEADER("instagram_feed_sharing_header", false),
    FEED_SHARING_PROMPT("instagram_feed_sharing_prompt", false),
    FEED_TOOLTIP("instagram_feed_tool_tip", false),
    HASHTAG_FEED_TOOLTIP("instagram_hashtag_feed_tooltip", false),
    INBOX_HEADER("instagram_inbox_header", false),
    INBOX_PROMPT("instagram_inbox_prompt", false),
    INBOX_TOOLTIP("instagram_inbox_tooltip", false),
    INBOX_SEARCH_HEADER("instagram_inbox_search_header", false),
    INBOX_FILTER_TOOLTIP("instagram_inbox_filter_tooltip", false),
    IGTV_VIEWER_PROMPT("instagram_tv_viewer_end_of_first_video", false),
    LIVE_COMPOSE_TOOLTIP("instagram_live_compose", false),
    DIRECT_APP_INBOX_HEADER("direct_inbox_header", false),
    DIRECT_APP_INBOX_PROMPT("direct_inbox_prompt", false),
    ACCOUNT_SETTING_TOOLTIP("instagram_account_setting_tip", false),
    ACTIVITY_FEED_HEADER("instagram_activity_feed_header", false),
    ACTIVITY_FEED_PROMPT("instagram_activity_feed_prompt", false),
    BRANDED_CONTENT_AND_SHOPPING_ACTIVITY_FEED_HEADER("instagram_branded_content_and_shopping_activity_feed", false),
    EXPLORE_HEADER("instagram_explore_header", false),
    EXPLORE_PROMPT("instagram_explore_prompt", false),
    SHOPPING_PRODUCT_DETAILS_LOADED("instagram_shopping_product_details_loaded", false),
    SHOPPING_SAVE_DIRECTORY_TOOLTIP("instagram_shopping_save_directory_tooltip", false),
    SAVE_HOME_LOADED("instagram_save_home_loaded", false),
    LOCATION_PAGE_INFO_LOADED("instagram_location_page_info_loaded", false),
    SHARE_POST_LOADED("instagram_share_post_loaded", false),
    SHARE_TO_FB_SWITCHED_ON("instagram_share_to_fb_switched_on", false),
    SHARE_TO_FB_SWITCHED_OFF("instagram_share_to_fb_switched_off", false),
    SURVEY("instagram_survey", true),
    ACCOUNT_INSIGHTS_HEADER("instagram_account_insights_header", false),
    LOGGED_IN_USER_ID_LOADED("instagram_other_logged_in_user_id_loaded", true),
    STORY_VIEW_FUNDRAISER_STICKER_TOOLTIP("instagram_fundraiser_sticker_tooltip", false),
    QUICK_PROMOTION_TEST("instagram_quick_promotion_test", false),
    EDIT_PROFILE("instagram_edit_profile_loaded", false),
    CLOSE_FRIENDS_HEADER("instagram_close_friends_header", false),
    IN_THREAD_MESSAGE_FOOTER("instagram_message_footer", false),
    SHOPPING_STORY_POSTED("instagram_shopping_enable_auto_highlight_interstitial", false),
    NAVIGATION_TOOLTIP("instagram_navigation_tooltip", false);
    
    public final String A00;
    public final boolean A01;

    /* access modifiers changed from: public */
    Trigger(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
