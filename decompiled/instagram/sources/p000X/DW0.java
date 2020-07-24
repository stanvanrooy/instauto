package p000X;

/* renamed from: X.DW0 */
public final class DW0 {
    public static C30217DWd parseFromJson(C13080hr r3) {
        String A0t;
        C30217DWd dWd = new C30217DWd();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("value".equals(A0i)) {
                dWd.A00 = r3.A0I();
            } else if ("label".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                dWd.A01 = A0t;
            }
            r3.A0f();
        }
        return dWd;
    }
}
