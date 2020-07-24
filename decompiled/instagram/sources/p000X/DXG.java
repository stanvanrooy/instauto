package p000X;

/* renamed from: X.DXG */
public final class DXG {
    public static DXS parseFromJson(C13080hr r3) {
        DXS dxs = new DXS();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("total".equals(A0i)) {
                dxs.A00 = DXH.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dxs;
    }
}
