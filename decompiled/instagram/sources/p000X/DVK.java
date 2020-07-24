package p000X;

/* renamed from: X.DVK */
public final class DVK {
    public static C30190DVc parseFromJson(C13080hr r3) {
        String A0t;
        C30190DVc dVc = new C30190DVc();
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
                dVc.A00 = A0t;
            }
            r3.A0f();
        }
        return dVc;
    }
}
