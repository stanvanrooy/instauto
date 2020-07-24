package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Pf  reason: invalid class name and case insensitive filesystem */
public enum C29261Pf {
    AD("ad"),
    MEDIA("media"),
    SUGGESTED_BUSINESSES("suggested_businesses"),
    SUGGESTED_INTEREST_ACCOUNTS("suggested_interest_accounts"),
    SUGGESTED_HASHTAGS("suggested_hashtags"),
    SUGGESTED_USERS("suggested_users"),
    SUGGESTED_PRODUCERS("suggested_producers"),
    SUGGESTED_PRODUCERS_V2("suggested_producers_v2"),
    SUGGESTED_CLOSE_FRIENDS("suggested_close_friends"),
    SUGGESTED_SHOPS("suggested_shops"),
    FOLLOW_CHAIN_USERS("follow_chain_users"),
    SIMPLE_ACTION("simple_action"),
    EXPLORE_STORY("explore_story"),
    AD4AD("ad4ad"),
    FEED_SURVEY("in_feed_survey"),
    TAGGED_EDGE_POST("tagged_edge_story"),
    STORIES_NETEGO("stories_netego"),
    BUSINESS_CONVERSION_NETEGO("business_conversion_netego"),
    SEPARATOR_HEADER("separator_header"),
    SEPARATOR("separator"),
    INVITE_FROM_FB("invite_from_fb"),
    FB_UPSELL_NON_USER("fb_upsell_non_user"),
    FB_UPSELL_STALE_USER("fb_upsell_stale_user"),
    SEE_MORE("see_more_recs"),
    END_OF_FEED_DEMARCATOR("end_of_feed_demarcator"),
    GROUP_SET("group_set"),
    FB_UPSELL_EVENTS("fb_upsell_events"),
    PRODUCT_PIVOTS("product_pivots"),
    BLOKS_NETEGO("bloks_netego"),
    DISCOVER_ACCOUNTS_FEED_CARD("discover_accounts"),
    GUIDES_NETEGO("suggested_guides"),
    FOLLOW_REQUESTS("follow_requests"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (C29261Pf r3 : values()) {
            A01.put(r3.A00, r3);
        }
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C29261Pf(String str) {
        this.A00 = str;
    }
}
