package p000X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.22u  reason: invalid class name and case insensitive filesystem */
public final class C472422u {
    public static C472522v parseFromJson(C13080hr r4) {
        C472522v r3 = new C472522v();
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
                r3.A01 = str;
            } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r3.A02 = str;
            } else if ("cover_media".equals(A0i)) {
                r3.A00 = AnonymousClass1NJ.A00(r4);
            }
            r4.A0f();
        }
        return r3;
    }
}
