package p000X;

/* renamed from: X.DX5 */
public final class DX5 {
    public static DX6 parseFromJson(C13080hr r3) {
        DX6 dx6 = new DX6();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("stories".equals(A0i)) {
                dx6.A00 = DX7.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dx6;
    }
}
