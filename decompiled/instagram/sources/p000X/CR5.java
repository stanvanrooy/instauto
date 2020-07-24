package p000X;

/* renamed from: X.CR5 */
public final class CR5 {
    public static CRA parseFromJson(C13080hr r4) {
        CRA cra = new CRA();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("products_description".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                cra.A02 = str;
            } else if ("is_published".equals(A0i)) {
                cra.A03 = r4.A0O();
            } else if ("disabled_reason".equals(A0i)) {
                cra.A00 = CR6.parseFromJson(r4);
            } else if ("merchant_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                cra.A01 = str;
            }
            r4.A0f();
        }
        return cra;
    }
}
