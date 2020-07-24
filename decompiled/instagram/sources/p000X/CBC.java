package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.venue.Venue;

/* renamed from: X.CBC */
public final class CBC {
    public static CBE parseFromJson(C13080hr r5) {
        CBE cbe = new CBE();
        if (r5.A0g() != C13120hv.START_OBJECT) {
            r5.A0f();
            return null;
        }
        while (r5.A0p() != C13120hv.END_OBJECT) {
            String A0i = r5.A0i();
            r5.A0p();
            if ("location".equals(A0i)) {
                cbe.A01 = Venue.A00(r5, true);
            } else {
                String str = null;
                if (DialogModule.KEY_TITLE.equals(A0i)) {
                    if (r5.A0g() != C13120hv.VALUE_NULL) {
                        str = r5.A0t();
                    }
                    cbe.A04 = str;
                } else if ("subtitle".equals(A0i)) {
                    if (r5.A0g() != C13120hv.VALUE_NULL) {
                        str = r5.A0t();
                    }
                    cbe.A03 = str;
                } else if ("search_subtitle".equals(A0i)) {
                    if (r5.A0g() != C13120hv.VALUE_NULL) {
                        str = r5.A0t();
                    }
                    cbe.A02 = str;
                } else if ("header_media".equals(A0i)) {
                    cbe.A00 = BVG.parseFromJson(r5);
                }
            }
            r5.A0f();
        }
        return cbe;
    }
}
