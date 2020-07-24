package p000X;

/* renamed from: X.DXF */
public final class DXF {
    public static DXR parseFromJson(C13080hr r3) {
        DXR dxr = new DXR();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("impressions".equals(A0i)) {
                dxr.A00 = DXG.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dxr;
    }
}
