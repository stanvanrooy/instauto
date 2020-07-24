package p000X;

/* renamed from: X.DH7 */
public final class DH7 {
    public static C29930DHg parseFromJson(C13080hr r4) {
        C29930DHg dHg = new C29930DHg();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("key".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dHg.A00 = str;
            } else if ("value".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dHg.A01 = str;
            }
            r4.A0f();
        }
        return dHg;
    }
}
