package p000X;

/* renamed from: X.AJM */
public final class AJM {
    public static AJL parseFromJson(C13080hr r3) {
        String A0t;
        AJL ajl = new AJL();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("user".equals(A0i)) {
                ajl.A00 = C13300iJ.A00(r3);
            } else if ("formatted_amount".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                ajl.A01 = A0t;
            }
            r3.A0f();
        }
        return ajl;
    }
}
