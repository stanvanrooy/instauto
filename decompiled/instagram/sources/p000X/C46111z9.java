package p000X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.1z9  reason: invalid class name and case insensitive filesystem */
public final class C46111z9 {
    public static C46121zA parseFromJson(C13080hr r4) {
        C46121zA r3 = new C46121zA();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r3.A01 = str;
            } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r3.A02 = str;
            } else if ("num_episodes".equals(A0i)) {
                r3.A00 = r4.A0I();
            }
            r4.A0f();
        }
        return r3;
    }
}
