package p000X;

/* renamed from: X.DS1 */
public final class DS1 {
    public static DSA parseFromJson(C13080hr r3) {
        DSA dsa = new DSA();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("offset".equals(A0i)) {
                dsa.A00 = r3.A0J();
            } else if ("duplicate".equals(A0i)) {
                dsa.A01 = r3.A0O();
            }
            r3.A0f();
        }
        return dsa;
    }
}
