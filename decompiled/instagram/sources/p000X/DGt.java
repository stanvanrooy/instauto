package p000X;

/* renamed from: X.DGt */
public final class DGt {
    public static DHK parseFromJson(C13080hr r4) {
        DHK dhk = new DHK();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("display_price".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dhk.A02 = str;
            } else if ("label".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dhk.A03 = str;
            } else if ("price_type".equals(A0i)) {
                dhk.A01 = C25723BWt.A00(r4.A0r());
            } else if ("price".equals(A0i)) {
                dhk.A00 = DH9.parseFromJson(r4);
            }
            r4.A0f();
        }
        return dhk;
    }
}
