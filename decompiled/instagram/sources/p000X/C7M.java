package p000X;

/* renamed from: X.C7M */
public final class C7M {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ACCOUNT_ACTIVITY";
            case 2:
                return "ACCOUNT_AUDIENCE";
            case 3:
                return "AGE_RANGE_ALL";
            case 4:
                return "AGE_RANGE_MEN";
            case 5:
                return "AGE_RANGE_WOMEN";
            case 6:
                return "APPLY_BUTTON";
            case 7:
                return "CANCEL_BUTTON";
            case 8:
                return "CREATE_POST";
            case 9:
                return "CREATE_PROMOTION";
            case 10:
                return "CREATE_STORY";
            case C120125Dh.VIEW_TYPE_BANNER:
                return "EDUCATION_VIEW_OPENER";
            case C120125Dh.VIEW_TYPE_SPINNER:
                return "FOLLOWERS_HOURS";
            case C120125Dh.VIEW_TYPE_BADGE:
                return "FOLLOWERS_DAYS";
            case C120125Dh.VIEW_TYPE_LINK:
                return "POST_GRID_ITEM";
            case 15:
                return "POST_INSIGHTS_PEEK";
            case 16:
                return "POST_INSIGHTS_PDP_OPENER";
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                return "SEE_MORE_BUTTON";
            case 18:
                return "STORY_GRID_ITEM";
            case 19:
                return "SUMMARY";
            case 20:
                return "TOP_LOCATIONS_COUNTRIES";
            case C120125Dh.VIEW_TYPE_BRANDING:
                return "TOP_LOCATIONS_CITIES";
            case C120125Dh.NUM_VIEW_TYPES:
                return "CREATOR_LIST_ITEM";
            default:
                return "ACCOUNT_CONTENT";
        }
    }
}
