package p000X;

/* renamed from: X.DHB */
public final class DHB {
    public static C29936DHm parseFromJson(C13080hr r3) {
        String A0t;
        C29936DHm dHm = new C29936DHm();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("text".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                dHm.A00 = A0t;
            }
            r3.A0f();
        }
        return dHm;
    }
}
