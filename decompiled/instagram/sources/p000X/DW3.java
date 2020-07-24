package p000X;

/* renamed from: X.DW3 */
public final class DW3 {
    public static C30214DWa parseFromJson(C13080hr r3) {
        String A0t;
        C30214DWa dWa = new C30214DWa();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("value".equals(A0i)) {
                dWa.A00 = r3.A0I();
            } else if ("label".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                dWa.A01 = A0t;
            }
            r3.A0f();
        }
        return dWa;
    }
}
