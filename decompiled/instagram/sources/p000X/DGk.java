package p000X;

/* renamed from: X.DGk */
public final class DGk {
    public static DHJ parseFromJson(C13080hr r4) {
        DHJ dhj = new DHJ();
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
                dhj.A02 = str;
            } else if ("label".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dhj.A03 = str;
            } else if ("price_type".equals(A0i)) {
                dhj.A01 = C25723BWt.A00(r4.A0r());
            } else if ("price".equals(A0i)) {
                dhj.A00 = DHA.parseFromJson(r4);
            }
            r4.A0f();
        }
        return dhj;
    }
}
