package p000X;

/* renamed from: X.CXC */
public final class CXC {
    public static CYF parseFromJson(C13080hr r4) {
        CYF cyf = new CYF();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("base_url".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                cyf.A00 = str;
            } else if ("logging_token".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                cyf.A01 = str;
            } else if ("sources".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                cyf.A02 = str;
            }
            r4.A0f();
        }
        return cyf;
    }
}
