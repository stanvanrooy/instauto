package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;

/* renamed from: X.AGM */
public final class AGM {
    public static Integer A00(String str) {
        if (str.equals("ACCOUNT_ACTIONS")) {
            return Constants.ZERO;
        }
        if (str.equals("ACCOUNT_ACTIVITY")) {
            return Constants.ONE;
        }
        if (str.equals("ACCOUNT_ACTIVITY_PRODUCTS")) {
            return Constants.A0C;
        }
        if (str.equals("ACCOUNT_AUDIENCE")) {
            return Constants.A0N;
        }
        if (str.equals("ACCOUNT_CONTENT")) {
            return Constants.A0Y;
        }
        if (str.equals("ACCOUNT_CONTENT_INFO")) {
            return Constants.A0j;
        }
        if (str.equals("ACCOUNT_DISCOVERY")) {
            return Constants.A0u;
        }
        if (str.equals("ACCOUNT_HEADER")) {
            return Constants.A12;
        }
        if (str.equals("ACCOUNT_CONTENT_PARTNER_POSTS")) {
            return Constants.A14;
        }
        if (str.equals("ACCOUNT_CONTENT_PARTNER_STORIES")) {
            return Constants.A15;
        }
        if (str.equals("ACCOUNT_TABS")) {
            return Constants.A02;
        }
        if (str.equals("CREATORS_LIST")) {
            return Constants.A03;
        }
        if (str.equals("STORY_INLINE_INSIGHTS")) {
            return Constants.A04;
        }
        if (str.equals("STORY_INSIGHTS_ACTIONS")) {
            return Constants.A05;
        }
        if (str.equals("STORY_INSIGHTS_DISCOVERY")) {
            return Constants.A06;
        }
        if (str.equals("STORY_INSIGHTS_NOT_ENOUGH_REACH")) {
            return Constants.A07;
        }
        if (str.equals("STORY_GRID")) {
            return Constants.A08;
        }
        if (str.equals("STORY_FILTER")) {
            return Constants.A09;
        }
        if (str.equals("EDUCATION_VIEW")) {
            return Constants.A0A;
        }
        if (str.equals("POST_INSIGHTS")) {
            return Constants.A0B;
        }
        if (str.equals("POST_INSIGHTS_PEEK")) {
            return Constants.A0D;
        }
        if (str.equals("POST_INSIGHTS_FULLSCREEN")) {
            return Constants.A0E;
        }
        if (str.equals("POST_INSIGHTS_ACTIONS")) {
            return Constants.A0F;
        }
        if (str.equals("POST_INSIGHTS_DISCOVERY")) {
            return Constants.A0G;
        }
        if (str.equals("POST_SHOPPING_PRODUCT")) {
            return Constants.A0H;
        }
        if (str.equals("POST_INSIGHTS_PDP")) {
            return Constants.A0I;
        }
        if (str.equals("POST_GRID")) {
            return Constants.A0J;
        }
        if (str.equals("POST_FILTER")) {
            return Constants.A0K;
        }
        if (str.equals("PRODUCT_INSIGHTS")) {
            return Constants.A0L;
        }
        if (str.equals("PRODUCT_INSIGHTS_INTERACTIONS")) {
            return Constants.A0M;
        }
        if (str.equals("PRODUCT_INSIGHTS_OVERVIEW")) {
            return Constants.A0O;
        }
        if (str.equals("LANDING_INSIGHTS")) {
            return Constants.A0P;
        }
        if (str.equals("FOLLOWERS")) {
            return Constants.A0Q;
        }
        if (str.equals("FOLLOWERS_LOCATION_CHART")) {
            return Constants.A0R;
        }
        if (str.equals("FOLLOWERS_AGE_CHART")) {
            return Constants.A0S;
        }
        if (str.equals("FOLLOWERS_GENDER_CHART")) {
            return Constants.A0T;
        }
        if (str.equals("FOLLOWERS_ACTIVITY")) {
            return Constants.A0U;
        }
        if (str.equals("FOLLOWERS_GROWTH_CHART")) {
            return Constants.A0V;
        }
        if (str.equals("FOLLOWERS_INFO")) {
            return Constants.A0W;
        }
        if (str.equals("TOP_POSTS")) {
            return Constants.A0X;
        }
        if (str.equals("TOP_STORIES")) {
            return Constants.A0Z;
        }
        if (str.equals("PROMOTIONS")) {
            return Constants.A0a;
        }
        if (str.equals("PRODUCT_POST_GRID")) {
            return Constants.A0b;
        }
        if (str.equals("PRODUCT_STORY_GRID")) {
            return Constants.A0c;
        }
        if (str.equals("COMBINED_MIXED_GRID")) {
            return Constants.A0d;
        }
        throw new IllegalArgumentException(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ACCOUNT_ACTIVITY";
            case 2:
                return "ACCOUNT_ACTIVITY_PRODUCTS";
            case 3:
                return "ACCOUNT_AUDIENCE";
            case 4:
                return "ACCOUNT_CONTENT";
            case 5:
                return "ACCOUNT_CONTENT_INFO";
            case 6:
                return "ACCOUNT_DISCOVERY";
            case 7:
                return "ACCOUNT_HEADER";
            case 8:
                return "ACCOUNT_CONTENT_PARTNER_POSTS";
            case 9:
                return "ACCOUNT_CONTENT_PARTNER_STORIES";
            case 10:
                return "ACCOUNT_TABS";
            case C120125Dh.VIEW_TYPE_BANNER:
                return "CREATORS_LIST";
            case C120125Dh.VIEW_TYPE_SPINNER:
                return "STORY_INLINE_INSIGHTS";
            case C120125Dh.VIEW_TYPE_BADGE:
                return "STORY_INSIGHTS_ACTIONS";
            case C120125Dh.VIEW_TYPE_LINK:
                return "STORY_INSIGHTS_DISCOVERY";
            case 15:
                return "STORY_INSIGHTS_NOT_ENOUGH_REACH";
            case 16:
                return "STORY_GRID";
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                return "STORY_FILTER";
            case 18:
                return "EDUCATION_VIEW";
            case 19:
                return "POST_INSIGHTS";
            case 20:
                return "POST_INSIGHTS_PEEK";
            case C120125Dh.VIEW_TYPE_BRANDING:
                return "POST_INSIGHTS_FULLSCREEN";
            case C120125Dh.NUM_VIEW_TYPES:
                return "POST_INSIGHTS_ACTIONS";
            case 23:
                return "POST_INSIGHTS_DISCOVERY";
            case 24:
                return "POST_SHOPPING_PRODUCT";
            case 25:
                return "POST_INSIGHTS_PDP";
            case OdexSchemeArtXdex.OREO_SDK_INT:
                return "POST_GRID";
            case 27:
                return "POST_FILTER";
            case 28:
                return "PRODUCT_INSIGHTS";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return "PRODUCT_INSIGHTS_INTERACTIONS";
            case 30:
                return "PRODUCT_INSIGHTS_OVERVIEW";
            case 31:
                return "LANDING_INSIGHTS";
            case 32:
                return "FOLLOWERS";
            case 33:
                return "FOLLOWERS_LOCATION_CHART";
            case 34:
                return "FOLLOWERS_AGE_CHART";
            case 35:
                return "FOLLOWERS_GENDER_CHART";
            case 36:
                return "FOLLOWERS_ACTIVITY";
            case 37:
                return "FOLLOWERS_GROWTH_CHART";
            case 38:
                return "FOLLOWERS_INFO";
            case 39:
                return "TOP_POSTS";
            case 40:
                return "TOP_STORIES";
            case 41:
                return "PROMOTIONS";
            case 42:
                return "PRODUCT_POST_GRID";
            case 43:
                return "PRODUCT_STORY_GRID";
            case 44:
                return "COMBINED_MIXED_GRID";
            default:
                return "ACCOUNT_ACTIONS";
        }
    }
}
