package p000X;

/* renamed from: X.DVJ */
public final class DVJ {
    public static C30191DVd parseFromJson(C13080hr r3) {
        String A0t;
        C30191DVd dVd = new C30191DVd();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("uri".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                dVd.A00 = A0t;
            }
            r3.A0f();
        }
        return dVd;
    }
}
