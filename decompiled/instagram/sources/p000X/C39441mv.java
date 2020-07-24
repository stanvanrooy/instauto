package p000X;

/* renamed from: X.1mv  reason: invalid class name and case insensitive filesystem */
public final class C39441mv {
    public static C39451mw parseFromJson(C13080hr r4) {
        C39451mw r3 = new C39451mw();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("explanation".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r3.A00 = str;
            } else if ("explore_internal_debug_log".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r3.A01 = str;
            } else if ("explore_token".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r3.A02 = str;
            }
            r4.A0f();
        }
        return r3;
    }
}
