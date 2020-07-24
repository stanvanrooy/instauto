package p000X;

/* renamed from: X.DZ5 */
public final class DZ5 {
    public static DZ6 parseFromJson(C13080hr r3) {
        String A0t;
        DZ6 dz6 = new DZ6();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("has_next_page".equals(A0i)) {
                dz6.A01 = r3.A0O();
            } else if ("end_cursor".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                dz6.A00 = A0t;
            }
            r3.A0f();
        }
        return dz6;
    }
}
