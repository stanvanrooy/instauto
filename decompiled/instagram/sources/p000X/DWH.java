package p000X;

/* renamed from: X.DWH */
public final class DWH {
    public static C30233DWt parseFromJson(C13080hr r3) {
        String A0t;
        C30233DWt dWt = new C30233DWt();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("id".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                dWt.A00 = A0t;
            }
            r3.A0f();
        }
        return dWt;
    }
}
