package p000X;

/* renamed from: X.DH0 */
public final class DH0 {
    public static DHR parseFromJson(C13080hr r3) {
        String A0t;
        DHR dhr = new DHR();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("length".equals(A0i)) {
                dhr.A00 = r3.A0I();
            } else if ("offset".equals(A0i)) {
                dhr.A01 = r3.A0I();
            } else if ("override_uri".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                dhr.A02 = A0t;
            }
            r3.A0f();
        }
        return dhr;
    }
}
