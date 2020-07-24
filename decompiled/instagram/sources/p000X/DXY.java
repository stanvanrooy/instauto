package p000X;

/* renamed from: X.DXY */
public final class DXY {
    public static C30241DXb parseFromJson(C13080hr r3) {
        C30241DXb dXb = new C30241DXb();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("top_posts".equals(A0i)) {
                dXb.A00 = DZ1.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dXb;
    }
}
