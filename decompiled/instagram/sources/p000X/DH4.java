package p000X;

/* renamed from: X.DH4 */
public final class DH4 {
    public static DHG parseFromJson(C13080hr r3) {
        DHG dhg = new DHG();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("checkout_information".equals(A0i)) {
                dhg.A00 = DGf.parseFromJson(r3);
            } else if ("velocity_restriction_settings".equals(A0i)) {
                dhg.A01 = DH5.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dhg;
    }
}
