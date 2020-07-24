package p000X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.1nm  reason: invalid class name and case insensitive filesystem */
public final class C39921nm {
    public static C39931nn parseFromJson(C13080hr r4) {
        C39931nn r2 = new C39931nn();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("channel_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r2.A01 = str;
            } else if ("channel_type".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r2.A03 = str;
            } else {
                if (!"header".equals(A0i)) {
                    if (DialogModule.KEY_TITLE.equals(A0i)) {
                        if (r4.A0g() != C13120hv.VALUE_NULL) {
                            str = r4.A0t();
                        }
                        r2.A02 = str;
                    } else if (!"context".equals(A0i)) {
                        if ("media_count".equals(A0i)) {
                            r4.A0I();
                        } else if ("media".equals(A0i)) {
                            r2.A00 = AnonymousClass1NJ.A00(r4);
                        }
                    }
                }
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r4.A0t();
                }
            }
            r4.A0f();
        }
        return r2;
    }
}
