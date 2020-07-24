package p000X;

/* renamed from: X.21l  reason: invalid class name and case insensitive filesystem */
public final class C469021l {
    public static C469121m parseFromJson(C13080hr r3) {
        String A0t;
        C469121m r2 = new C469121m();
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
                r2.A01 = A0t;
            } else if ("image_url".equals(A0i)) {
                r2.A00 = C13270iF.A00(r3);
            }
            r3.A0f();
        }
        return r2;
    }
}
