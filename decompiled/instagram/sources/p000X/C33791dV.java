package p000X;

import android.view.View;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;

/* renamed from: X.1dV  reason: invalid class name and case insensitive filesystem */
public final class C33791dV extends AnonymousClass1YC {
    public final /* synthetic */ Integer A00;

    public C33791dV(Integer num) {
        this.A00 = num;
    }

    public final void A05(View view, C49532Cp r4) {
        String str;
        super.A05(view, r4);
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "android.widget.Button";
                    break;
                case 2:
                    str = "android.widget.CompoundButton";
                    break;
                case 3:
                    str = "android.widget.Spinner";
                    break;
                case 4:
                    str = "android.widget.EditText";
                    break;
                case 5:
                    str = "android.widget.GridView";
                    break;
                case 6:
                case 7:
                    str = "android.widget.ImageView";
                    break;
                case 8:
                    str = "android.widget.AbsListView";
                    break;
                case 9:
                    str = "androidx.viewpager.widget.ViewPager";
                    break;
                case 10:
                    str = "android.widget.RadioButton";
                    break;
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                    str = "android.widget.SeekBar";
                    break;
                case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                    str = "android.widget.Switch";
                    break;
                case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                    str = "android.widget.TabWidget";
                    break;
                case C120125Dh.VIEW_TYPE_LINK /*14*/:
                    str = "android.widget.ToggleButton";
                    break;
                case 15:
                    str = "android.view.ViewGroup";
                    break;
                case 16:
                    str = "android.webkit.WebView";
                    break;
                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                    str = "android.widget.CheckedTextView";
                    break;
                case 18:
                    str = "android.widget.ProgressBar";
                    break;
                case 19:
                    str = "android.app.ActionBar$Tab";
                    break;
                case 20:
                    str = "androidx.drawerlayout.widget.DrawerLayout";
                    break;
                case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                    str = "android.widget.SlidingDrawer";
                    break;
                case C120125Dh.NUM_VIEW_TYPES /*22*/:
                    str = "com.android.internal.view.menu.IconMenuView";
                    break;
                case 23:
                    str = "android.widget.Toast$TN";
                    break;
                case 24:
                    str = "android.app.DatePickerDialog";
                    break;
                case 25:
                    str = "android.app.TimePickerDialog";
                    break;
                case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                    str = "android.widget.DatePicker";
                    break;
                case 27:
                    str = "android.widget.TimePicker";
                    break;
                case 28:
                    str = "android.widget.NumberPicker";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                    str = "android.widget.ScrollView";
                    break;
                case 30:
                    str = "android.widget.HorizontalScrollView";
                    break;
                case 31:
                    str = "android.inputmethodservice.Keyboard$Key";
                    break;
                default:
                    str = null;
                    break;
            }
            r4.A0D(str);
            if (num.equals(Constants.A12)) {
                r4.A02.setClickable(true);
            }
        }
    }
}
