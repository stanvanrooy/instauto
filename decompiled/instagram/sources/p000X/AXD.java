package p000X;

/* renamed from: X.AXD */
public final class AXD {
    public static AXE parseFromJson(C13080hr r3) {
        AXE axe = new AXE();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("batch_size".equals(A0i)) {
                r3.A0I();
            } else {
                AnonymousClass1N4.A01(axe, A0i, r3);
            }
            r3.A0f();
        }
        return axe;
    }
}
