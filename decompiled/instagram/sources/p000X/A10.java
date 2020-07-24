package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* renamed from: X.A10 */
public enum A10 {
    NONE,
    BUTTON,
    LINK,
    SEARCH,
    IMAGE,
    IMAGEBUTTON,
    ADJUSTABLE,
    SUMMARY,
    HEADER,
    ALERT,
    COMBOBOX,
    MENU,
    MENUBAR,
    MENUITEM,
    PROGRESSBAR,
    RADIOGROUP,
    SCROLLBAR,
    SPINBUTTON,
    SWITCH,
    TAB,
    TABLIST,
    TIMER,
    TOOLBAR;

    public static String A00(A10 a10) {
        switch (a10.ordinal()) {
            case 0:
            case 2:
            case 9:
            case 10:
            case C120125Dh.VIEW_TYPE_BANNER:
            case C120125Dh.VIEW_TYPE_BADGE:
            case C120125Dh.VIEW_TYPE_LINK:
            case 15:
            case 16:
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
            case 19:
            case 20:
            case 23:
            case 24:
            case 25:
            case OdexSchemeArtXdex.OREO_SDK_INT:
                return "android.view.View";
            case 1:
                return "android.widget.Button";
            case 3:
                return "android.widget.EditText";
            case 4:
                return "android.widget.ImageView";
            case 5:
                return "android.widget.ImageButon";
            case 6:
                return "android.inputmethodservice.Keyboard$Key";
            case 7:
                return "android.widget.TextView";
            case 8:
                return "android.widget.SeekBar";
            case C120125Dh.VIEW_TYPE_SPINNER:
                return "android.widget.CheckBox";
            case 18:
                return "android.widget.RadioButton";
            case C120125Dh.VIEW_TYPE_BRANDING:
                return "android.widget.SpinButton";
            case C120125Dh.NUM_VIEW_TYPES:
                return "android.widget.Switch";
            default:
                throw new IllegalArgumentException("Invalid accessibility role value: " + a10);
        }
    }
}
