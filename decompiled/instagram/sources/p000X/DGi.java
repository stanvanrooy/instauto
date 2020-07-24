package p000X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.DGi */
public final class DGi {
    public static DHH parseFromJson(C13080hr r4) {
        DHH dhh = new DHH();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("quantity".equals(A0i)) {
                dhh.A00 = r4.A0I();
            } else {
                String str = null;
                if ("strikethrough_subtitle".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dhh.A02 = str;
                } else if ("subsubtitle".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dhh.A03 = str;
                } else if ("subtitle".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dhh.A04 = str;
                } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dhh.A05 = str;
                } else if ("item_image_url".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dhh.A01 = str;
                }
            }
            r4.A0f();
        }
        return dhh;
    }
}
