package p000X;

/* renamed from: X.AKK */
public final class AKK {
    public static AKJ parseFromJson(C13080hr r3) {
        AKJ akj = new AKJ();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("user_count".equals(A0i)) {
                akj.A01 = r3.A0I();
            } else {
                C29161Ov.A01(akj, A0i, r3);
            }
            r3.A0f();
        }
        akj.A08();
        return akj;
    }
}
