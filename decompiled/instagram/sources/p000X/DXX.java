package p000X;

/* renamed from: X.DXX */
public final class DXX {
    public static C30240DXa parseFromJson(C13080hr r3) {
        C30240DXa dXa = new C30240DXa();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("top_posts_unit".equals(A0i)) {
                dXa.A00 = DXY.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dXa;
    }
}
