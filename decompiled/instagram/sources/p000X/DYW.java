package p000X;

/* renamed from: X.DYW */
public final class DYW {
    public static DYX parseFromJson(C13080hr r3) {
        DYX dyx = new DYX();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("zero_product_provisioning_event".equals(A0i)) {
                dyx.A00 = DYV.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dyx;
    }
}
