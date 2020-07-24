package p000X;

/* renamed from: X.DZ3 */
public final class DZ3 {
    public static DZ4 parseFromJson(C13080hr r3) {
        DZ4 dz4 = new DZ4();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("__typename".equals(A0i) || "cursor".equals(A0i)) {
                if (r3.A0g() != C13120hv.VALUE_NULL) {
                    r3.A0t();
                }
            } else if ("node".equals(A0i)) {
                dz4.A00 = DZ8.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dz4;
    }
}
