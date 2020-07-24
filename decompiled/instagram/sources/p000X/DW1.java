package p000X;

/* renamed from: X.DW1 */
public final class DW1 {
    public static C30216DWc parseFromJson(C13080hr r3) {
        String A0t;
        C30216DWc dWc = new C30216DWc();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("value".equals(A0i)) {
                dWc.A00 = r3.A0I();
            } else if ("label".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                dWc.A01 = A0t;
            }
            r3.A0f();
        }
        return dWc;
    }
}
