package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;

/* renamed from: X.C92 */
public abstract class C92 {
    public int A00;
    public CY3 A01;
    public String A02;
    public final C93 A03;

    public C92(Integer num, String str, CY4 cy4, int i) {
        String str2;
        switch (num.intValue()) {
            case 1:
                str2 = "RICH_TEXT";
                break;
            case 2:
                str2 = "PHOTO";
                break;
            case 3:
                str2 = "BUTTON";
                break;
            case 4:
                str2 = "SLIDESHOW";
                break;
            case 5:
                str2 = "DIVIDER";
                break;
            case 6:
                str2 = "EXPANDABLE_SECTION";
                break;
            case 7:
                str2 = "STATEFUL";
                break;
            case 8:
                str2 = "VIDEO";
                break;
            case 9:
                str2 = "COLOR_SELECTOR";
                break;
            case 10:
                str2 = "TOGGLE_BUTTON";
                break;
            case C120125Dh.VIEW_TYPE_BANNER:
                str2 = "HEADER";
                break;
            case C120125Dh.VIEW_TYPE_SPINNER:
                str2 = "COMPOSITE_BLOCK";
                break;
            case C120125Dh.VIEW_TYPE_BADGE:
                str2 = "FOOTER";
                break;
            case C120125Dh.VIEW_TYPE_LINK:
                str2 = "ELEMENT_GROUP";
                break;
            case 15:
                str2 = "TITLE_AND_DATE";
                break;
            case 16:
                str2 = "STORE_LOCATOR";
                break;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                str2 = "SCRUBBABLE_GIF";
                break;
            case 18:
                str2 = "LOCAL_IMAGE";
                break;
            case 19:
                str2 = "OFFER";
                break;
            case 20:
                str2 = "WEBVIEW";
                break;
            case C120125Dh.VIEW_TYPE_BRANDING:
                str2 = "BUNDLE";
                break;
            case C120125Dh.NUM_VIEW_TYPES:
                str2 = "UFI";
                break;
            case 23:
                str2 = "FBT_BUTTON";
                break;
            case 24:
                str2 = "PRODUCT_LIST";
                break;
            case 25:
                str2 = "INSTAGRAM_PRODUCT";
                break;
            case OdexSchemeArtXdex.OREO_SDK_INT:
                str2 = "NAVIGATION_TAB";
                break;
            case 27:
                str2 = "CULTURAL_MOMENT_POPULAR_MEDIA";
                break;
            case 28:
                str2 = "DAILY_DIALOGUE_FB_TIPS";
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                str2 = "COLOR_PICKER";
                break;
            case 30:
                str2 = "CALL_TO_ACTION_CARD";
                break;
            case 31:
                str2 = "CALL_TO_ACTION_CARD_LIST";
                break;
            case 32:
                str2 = "ANALYTICS";
                break;
            case 33:
                str2 = "DESTINATION_SOCIAL_UNIT";
                break;
            case 34:
                str2 = "LEAD_GEN_FORM";
                break;
            case 35:
                str2 = "PRODUCT_GRID";
                break;
            case 36:
                str2 = "PRODUCT_HSCROLL_LIST";
                break;
            case 37:
                str2 = "PRODUCT_CAROUSEL";
                break;
            case 38:
                str2 = "TEMPLATE_VIDEO";
                break;
            case 39:
                str2 = "SHOP_BY_CATEGORY";
                break;
            case 40:
                str2 = "PROMOTIONAL_ELEMENT";
                break;
            case 41:
                str2 = "PRODUCT_CATEGORY_PIVOT_ELEMENT";
                break;
            case 42:
                str2 = "PRODUCT_GRID_CATEGORY";
                break;
            case 43:
                str2 = "BRANDING_ELEMENT";
                break;
            case 44:
                str2 = "CART_BUTTON";
                break;
            case 45:
                str2 = "ICON_ELEMENT";
                break;
            case 46:
                str2 = "SHOP_BANNER";
                break;
            case 47:
                str2 = "BLOKS";
                break;
            case 48:
                str2 = "SECTION_HEADER";
                break;
            default:
                str2 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                break;
        }
        this.A03 = (C93) C93.A03.get(str2);
        this.A02 = str;
        this.A00 = i;
        this.A01 = cy4.A00();
    }
}
