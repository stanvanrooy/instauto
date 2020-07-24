package p000X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.1k7  reason: invalid class name and case insensitive filesystem */
public final class C37721k7 {
    public static List A00 = Arrays.asList(new QuickPromotionSlot[]{QuickPromotionSlot.PERSONAL_PROFILE, QuickPromotionSlot.OTHER_PROFILE, QuickPromotionSlot.MAIN_FEED, QuickPromotionSlot.MEDIA_CAPTURE, QuickPromotionSlot.ACCOUNT_SETTING, QuickPromotionSlot.ACTIVITY_FEED, QuickPromotionSlot.BRANDED_CONTENT_AND_SHOPPING_ACTIVITY_FEED, QuickPromotionSlot.DIRECT_INBOX, QuickPromotionSlot.DIRECT_INBOX_SEARCH, QuickPromotionSlot.DIRECT_APP_INBOX, QuickPromotionSlot.DIRECT_THREAD, QuickPromotionSlot.EXPLORE, QuickPromotionSlot.HASHTAG_FEED, QuickPromotionSlot.IGTV_VIEWER, QuickPromotionSlot.LIVE_COMPOSE, QuickPromotionSlot.SHOPPING_HOME, QuickPromotionSlot.SHOPPING_PRODUCT_DETAILS, QuickPromotionSlot.SAVE_HOME, QuickPromotionSlot.LOCATION_PAGE_INFO, QuickPromotionSlot.SHARE_POST, QuickPromotionSlot.SURVEY, QuickPromotionSlot.ACCOUNT_INSIGHTS_HEADER, QuickPromotionSlot.STORY_VIEW, QuickPromotionSlot.EDIT_PROFILE, QuickPromotionSlot.CLOSE_FRIENDS});
    public static Map A01;
    public static Map A02;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x01c8, code lost:
        r11.put(r4, java.util.EnumSet.of(r3, r2, r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x022e, code lost:
        r2.put(r4, java.util.EnumSet.of(r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x032c, code lost:
        r1.put(r4, java.util.EnumSet.of(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0333, code lost:
        r5 = r5 + 1;
     */
    static {
        Map map;
        Trigger trigger;
        Map map2;
        Trigger trigger2;
        Trigger trigger3;
        Map map3;
        Trigger trigger4;
        Trigger trigger5;
        Trigger trigger6;
        Trigger trigger7;
        Class<QuickPromotionSlot> cls = QuickPromotionSlot.class;
        A02 = new EnumMap(cls);
        A01 = new EnumMap(cls);
        QuickPromotionSlot[] values = QuickPromotionSlot.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            QuickPromotionSlot quickPromotionSlot = values[i];
            switch (quickPromotionSlot.ordinal()) {
                case 0:
                    A02.put(quickPromotionSlot, Collections.unmodifiableList(Arrays.asList(new C37731k8[]{C37731k8.PROFILE_MEGAPHONE_SURFACE, C37731k8.PROFILE_TOOLTIP_SURFACE, C37731k8.PROFILE_INTERSTITIAL_SURFACE})));
                    A01.put(quickPromotionSlot, EnumSet.of(Trigger.PROFILE_HEADER, Trigger.PROFILE_PROMPT, Trigger.PROFILE_TOOLTIP));
                    break;
                case 1:
                    A02.put(quickPromotionSlot, Collections.unmodifiableList(Arrays.asList(new C37731k8[]{C37731k8.PROFILE_OTHER_MEGAPHONE_SURFACE, C37731k8.PROFILE_OTHER_TOOLTIP_SURFACE, C37731k8.PROFILE_OTHER_INTERSTITIAL_SURFACE})));
                    map3 = A01;
                    trigger4 = Trigger.PROFILE_OTHER_CHECKOUT_TOOLTIP;
                    trigger5 = Trigger.PROFILE_OTHER_HEADER;
                    trigger6 = Trigger.PROFILE_OTHER_PROMPT;
                    trigger7 = Trigger.PROFILE_OTHER_TOOLTIP;
                    break;
                case 2:
                    A02.put(quickPromotionSlot, Collections.unmodifiableList(Arrays.asList(new C37731k8[]{C37731k8.FEED_MEGAPHONE_SURFACE, C37731k8.FEED_TOOLTIP_SURFACE, C37731k8.FEED_INTERSTITIAL_SURFACE})));
                    map3 = A01;
                    trigger4 = Trigger.FEED_HEADER;
                    trigger5 = Trigger.FEED_PROMPT;
                    trigger6 = Trigger.FEED_TOOLTIP;
                    trigger7 = Trigger.NAVIGATION_TOOLTIP;
                    break;
                case 3:
                    A02.put(quickPromotionSlot, Collections.unmodifiableList(Arrays.asList(new C37731k8[]{C37731k8.FEED_SHARING_HEADER_SURFACE, C37731k8.FEED_SHARING_INTERSTITIAL_SURFACE})));
                    map2 = A01;
                    trigger2 = Trigger.FEED_SHARING_HEADER;
                    trigger3 = Trigger.FEED_SHARING_PROMPT;
                    break;
                case 4:
                    A02.put(quickPromotionSlot, Collections.singletonList(C37731k8.ACCOUNT_SETTING_TOOLTIP_SURFACE));
                    map = A01;
                    trigger = Trigger.ACCOUNT_SETTING_TOOLTIP;
                    break;
                case 5:
                    A02.put(quickPromotionSlot, Collections.unmodifiableList(Arrays.asList(new C37731k8[]{C37731k8.ACTIVITY_FEED_HEADER_SURFACE, C37731k8.ACTIVITY_FEED_INTERSTITIAL_SURFACE})));
                    map2 = A01;
                    trigger2 = Trigger.ACTIVITY_FEED_HEADER;
                    trigger3 = Trigger.ACTIVITY_FEED_PROMPT;
                    break;
                case 6:
                    A02.put(quickPromotionSlot, Collections.singletonList(C37731k8.BRANDED_CONTENT_AND_SHOPPING_ACTIVITY_FEED_HEADER_SURFACE));
                    map = A01;
                    trigger = Trigger.BRANDED_CONTENT_AND_SHOPPING_ACTIVITY_FEED_HEADER;
                    break;
                case 7:
                    A02.put(quickPromotionSlot, Collections.unmodifiableList(Arrays.asList(new C37731k8[]{C37731k8.INBOX_HEADER_SURFACE, C37731k8.INBOX_INTERSTITIAL_SURFACE, C37731k8.INBOX_TOOLTIP_SURFACE})));
                    map3 = A01;
                    trigger4 = Trigger.INBOX_HEADER;
                    trigger5 = Trigger.INBOX_PROMPT;
                    trigger6 = Trigger.INBOX_TOOLTIP;
                    trigger7 = Trigger.INBOX_FILTER_TOOLTIP;
                    break;
                case 8:
                    A02.put(quickPromotionSlot, Collections.singletonList(C37731k8.INBOX_SEARCH_HEADER_SURFACE));
                    map = A01;
                    trigger = Trigger.INBOX_SEARCH_HEADER;
                    break;
                case 9:
                    A02.put(quickPromotionSlot, Collections.unmodifiableList(Arrays.asList(new C37731k8[]{C37731k8.DIRECT_APP_INBOX_HEADER_SURFACE, C37731k8.DIRECT_APP_INBOX_INTERSTITIAL_SURFACE})));
                    map2 = A01;
                    trigger2 = Trigger.DIRECT_APP_INBOX_HEADER;
                    trigger3 = Trigger.DIRECT_APP_INBOX_PROMPT;
                    break;
                case 10:
                    A02.put(quickPromotionSlot, Collections.singletonList(C37731k8.DIRECT_IN_THREAD_MESSAGE_FOOTER));
                    map = A01;
                    trigger = Trigger.IN_THREAD_MESSAGE_FOOTER;
                    break;
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                    A02.put(quickPromotionSlot, Collections.unmodifiableList(Arrays.asList(new C37731k8[]{C37731k8.EXPLORE_HEADER_SURFACE, C37731k8.EXPLORE_INTERSTITIAL_SURFACE})));
                    map2 = A01;
                    trigger2 = Trigger.EXPLORE_HEADER;
                    trigger3 = Trigger.EXPLORE_PROMPT;
                    break;
                case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                    A02.put(quickPromotionSlot, Collections.singletonList(C37731k8.HASHTAG_FEED_TOOLTIP_SURFACE));
                    map = A01;
                    trigger = Trigger.HASHTAG_FEED_TOOLTIP;
                    break;
                case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                    A02.put(quickPromotionSlot, Collections.unmodifiableList(Arrays.asList(new C37731k8[]{C37731k8.IGTV_VIEWER_INTERSTITIAL_SURFACE})));
                    map = A01;
                    trigger = Trigger.IGTV_VIEWER_PROMPT;
                    break;
                case C120125Dh.VIEW_TYPE_LINK /*14*/:
                    A02.put(quickPromotionSlot, Collections.singletonList(C37731k8.SHOPPING_HOME_TOOLTIP_SURFACE));
                    map = A01;
                    trigger = Trigger.SHOPPING_SAVE_DIRECTORY_TOOLTIP;
                    break;
                case 15:
                    A02.put(quickPromotionSlot, Collections.singletonList(C37731k8.SHOPPING_PRODUCT_DETAILS_TOOLTIP_SURFACE));
                    map = A01;
                    trigger = Trigger.SHOPPING_PRODUCT_DETAILS_LOADED;
                    break;
                case 16:
                    A02.put(quickPromotionSlot, Collections.singletonList(C37731k8.SAVE_HOME_TOOLTIP_SURFACE));
                    map = A01;
                    trigger = Trigger.SAVE_HOME_LOADED;
                    break;
                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                    A02.put(quickPromotionSlot, Collections.singletonList(C37731k8.LOCATION_PAGE_INFO_TOOLTIP_SURFACE));
                    map = A01;
                    trigger = Trigger.LOCATION_PAGE_INFO_LOADED;
                    break;
                case 18:
                    A02.put(quickPromotionSlot, Collections.unmodifiableList(Arrays.asList(new C37731k8[]{C37731k8.SHARE_POST_TOOLTIP_SURFACE, C37731k8.SHARE_POST_INTERSTITIAL_SURFACE})));
                    map = A01;
                    trigger = Trigger.SHARE_POST_LOADED;
                    break;
                case 19:
                    A02.put(quickPromotionSlot, Collections.singletonList(C37731k8.SURVEY_INTERSTITIAL_SURFACE));
                    break;
                case 20:
                    A02.put(quickPromotionSlot, Collections.singletonList(C37731k8.ACCOUNT_INSIGHTS_HEADER_SURFACE));
                    map = A01;
                    trigger = Trigger.ACCOUNT_INSIGHTS_HEADER;
                    break;
                case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                    A02.put(quickPromotionSlot, Collections.singletonList(C37731k8.STORY_VIEW_TOOLTIP_SURFACE));
                    map = A01;
                    trigger = Trigger.STORY_VIEW_FUNDRAISER_STICKER_TOOLTIP;
                    break;
                case C120125Dh.NUM_VIEW_TYPES /*22*/:
                    A02.put(quickPromotionSlot, Collections.singletonList(C37731k8.QUICK_PROMOTION_TEST_MEGAPHONE_SURFACE));
                    map = A01;
                    trigger = Trigger.QUICK_PROMOTION_TEST;
                    break;
                case 23:
                    A02.put(quickPromotionSlot, Collections.singletonList(C37731k8.EDIT_PROFILE_TOOLTIP_SURFACE));
                    map = A01;
                    trigger = Trigger.EDIT_PROFILE;
                    break;
                case 24:
                    A02.put(quickPromotionSlot, Collections.singletonList(C37731k8.CLOSE_FRIENDS_HEADER_SURFACE));
                    map = A01;
                    trigger = Trigger.CLOSE_FRIENDS_HEADER;
                    break;
                case 25:
                    A02.put(quickPromotionSlot, Collections.singletonList(C37731k8.LIVE_COMPOSE_TOOLTIP_SURFACE));
                    map = A01;
                    trigger = Trigger.LIVE_COMPOSE_TOOLTIP;
                    break;
                default:
                    throw new IllegalArgumentException(AnonymousClass000.A0E("Slot type is not supported: ", quickPromotionSlot.name()));
            }
        }
    }

    public static List A00(QuickPromotionSlot quickPromotionSlot) {
        List list = (List) A02.get(quickPromotionSlot);
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        return new ArrayList(list);
    }
}
