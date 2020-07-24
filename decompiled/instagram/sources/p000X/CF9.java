package p000X;

/* renamed from: X.CF9 */
public final class CF9 {
    public static CG9 parseFromJson(C13080hr r4) {
        CG9 cg9 = new CG9();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                cg9.A00 = str;
            } else if ("name".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                cg9.A01 = str;
            }
            r4.A0f();
        }
        return cg9;
    }
}
