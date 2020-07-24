package p000X;

/* renamed from: X.DXJ */
public final class DXJ {
    public static DXP parseFromJson(C13080hr r3) {
        DXP dxp = new DXP();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("total".equals(A0i)) {
                dxp.A00 = DXK.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dxp;
    }
}
