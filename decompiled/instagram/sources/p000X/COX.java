package p000X;

/* renamed from: X.COX */
public final class COX {
    public static C27706COa parseFromJson(C13080hr r3) {
        C27706COa cOa = new C27706COa();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("user".equals(A0i)) {
                cOa.A01 = C13300iJ.A00(r3);
            } else if ("num_products".equals(A0i)) {
                cOa.A00 = r3.A0I();
            }
            r3.A0f();
        }
        return cOa;
    }
}
