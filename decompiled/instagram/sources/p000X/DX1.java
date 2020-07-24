package p000X;

/* renamed from: X.DX1 */
public final class DX1 {
    public static DX2 parseFromJson(C13080hr r3) {
        DX2 dx2 = new DX2();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("top_posts".equals(A0i)) {
                dx2.A00 = DX3.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dx2;
    }
}
