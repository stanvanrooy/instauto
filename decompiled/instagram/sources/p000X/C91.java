package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;

/* renamed from: X.C91 */
public final class C91 {
    public static Integer A00(String str) {
        if (str != null && !str.isEmpty()) {
            int length = str.length();
            switch (((Character.toUpperCase(str.charAt(0)) * 961) + (Character.toUpperCase(str.charAt(length - 1)) * 31) + length) & 31) {
                case 0:
                    if (str.equalsIgnoreCase("CART_BUTTON")) {
                        return Constants.A0d;
                    }
                    break;
                case 1:
                    if (str.equalsIgnoreCase("ICON_ELEMENT")) {
                        return Constants.A0e;
                    }
                    break;
                case 2:
                    if (str.equalsIgnoreCase("ELEMENT_GROUP")) {
                        return Constants.A06;
                    }
                    if (str.equalsIgnoreCase("OFFER")) {
                        return Constants.A0B;
                    }
                    if (str.equalsIgnoreCase("FBT_BUTTON")) {
                        return Constants.A0G;
                    }
                    break;
                case 3:
                    if (str.equalsIgnoreCase("BUNDLE")) {
                        return Constants.A0E;
                    }
                    break;
                case 5:
                    if (str.equalsIgnoreCase("SLIDESHOW")) {
                        return Constants.A0Y;
                    }
                    break;
                case 6:
                    if (str.equalsIgnoreCase("PHOTO")) {
                        return Constants.A0C;
                    }
                    if (str.equalsIgnoreCase("INSTAGRAM_PRODUCT")) {
                        return Constants.A0I;
                    }
                    break;
                case 7:
                    if (str.equalsIgnoreCase("RICH_TEXT")) {
                        return Constants.ONE;
                    }
                    if (str.equalsIgnoreCase("COMPOSITE_BLOCK")) {
                        return Constants.A04;
                    }
                    if (str.equalsIgnoreCase("WEBVIEW")) {
                        return Constants.A0D;
                    }
                    if (str.equalsIgnoreCase("DAILY_DIALOGUE_FB_TIPS")) {
                        return Constants.A0L;
                    }
                    if (str.equalsIgnoreCase("CALL_TO_ACTION_CARD_LIST")) {
                        return Constants.A0P;
                    }
                    if (str.equalsIgnoreCase("DESTINATION_SOCIAL_UNIT")) {
                        return Constants.A0R;
                    }
                    break;
                case 8:
                    if (str.equalsIgnoreCase("PRODUCT_LIST")) {
                        return Constants.A0H;
                    }
                    break;
                case 9:
                    if (str.equalsIgnoreCase("EXPANDABLE_SECTION")) {
                        return Constants.A0u;
                    }
                    break;
                case 10:
                    if (str.equalsIgnoreCase("SHOP_BY_CATEGORY")) {
                        return Constants.A0X;
                    }
                    break;
                case C120125Dh.VIEW_TYPE_SPINNER:
                    if (str.equalsIgnoreCase("VIDEO")) {
                        return Constants.A14;
                    }
                    if (str.equalsIgnoreCase("LEAD_GEN_FORM")) {
                        return Constants.A0S;
                    }
                    if (str.equalsIgnoreCase("PRODUCT_GRID_CATEGORY")) {
                        return Constants.A0b;
                    }
                    if (str.equalsIgnoreCase("SHOP_BANNER")) {
                        return Constants.A0f;
                    }
                    break;
                case C120125Dh.VIEW_TYPE_LINK:
                    if (str.equalsIgnoreCase("STORE_LOCATOR")) {
                        return Constants.A08;
                    }
                    break;
                case 15:
                    if (str.equalsIgnoreCase("STATEFUL")) {
                        return Constants.A12;
                    }
                    if (str.equalsIgnoreCase("UFI")) {
                        return Constants.A0F;
                    }
                    if (str.equalsIgnoreCase("PROMOTIONAL_ELEMENT")) {
                        return Constants.A0Z;
                    }
                    if (str.equalsIgnoreCase("SECTION_HEADER")) {
                        return Constants.A0h;
                    }
                    break;
                case 16:
                    if (str.equalsIgnoreCase("PRODUCT_HSCROLL_LIST")) {
                        return Constants.A0U;
                    }
                    break;
                case 18:
                    if (str.equalsIgnoreCase("LOCAL_IMAGE")) {
                        return Constants.A0A;
                    }
                    if (str.equalsIgnoreCase("CALL_TO_ACTION_CARD")) {
                        return Constants.A0O;
                    }
                    break;
                case 19:
                    if (str.equalsIgnoreCase("TOGGLE_BUTTON")) {
                        return Constants.A02;
                    }
                    if (str.equalsIgnoreCase("TEMPLATE_VIDEO")) {
                        return Constants.A0W;
                    }
                    break;
                case 20:
                    if (str.equalsIgnoreCase("PRODUCT_CAROUSEL")) {
                        return Constants.A0V;
                    }
                    if (str.equalsIgnoreCase("BLOKS")) {
                        return Constants.A0g;
                    }
                    break;
                case 23:
                    if (str.equalsIgnoreCase("ANALYTICS")) {
                        return Constants.A0Q;
                    }
                    break;
                case 24:
                    if (str.equalsIgnoreCase("PRODUCT_GRID")) {
                        return Constants.A0T;
                    }
                    break;
                case 25:
                    if (str.equalsIgnoreCase("DIVIDER")) {
                        return Constants.A0j;
                    }
                    break;
                case OdexSchemeArtXdex.OREO_SDK_INT:
                    if (str.equalsIgnoreCase("BUTTON")) {
                        return Constants.A0N;
                    }
                    if (str.equalsIgnoreCase("FOOTER")) {
                        return Constants.A05;
                    }
                    if (str.equalsIgnoreCase("NAVIGATION_TAB")) {
                        return Constants.A0J;
                    }
                    if (str.equalsIgnoreCase("PRODUCT_CATEGORY_PIVOT_ELEMENT")) {
                        return Constants.A0a;
                    }
                    break;
                case 27:
                    if (str.equalsIgnoreCase("SCRUBBABLE_GIF")) {
                        return Constants.A09;
                    }
                    break;
                case 28:
                    if (str.equalsIgnoreCase("HEADER")) {
                        return Constants.A03;
                    }
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                    if (str.equalsIgnoreCase("TITLE_AND_DATE")) {
                        return Constants.A07;
                    }
                    if (str.equalsIgnoreCase("COLOR_PICKER")) {
                        return Constants.A0M;
                    }
                    break;
                case 30:
                    if (str.equalsIgnoreCase("BRANDING_ELEMENT")) {
                        return Constants.A0c;
                    }
                    break;
                case 31:
                    if (str.equalsIgnoreCase("COLOR_SELECTOR")) {
                        return Constants.A15;
                    }
                    if (str.equalsIgnoreCase("CULTURAL_MOMENT_POPULAR_MEDIA")) {
                        return Constants.A0K;
                    }
                    break;
            }
        }
        return Constants.ZERO;
    }
}
