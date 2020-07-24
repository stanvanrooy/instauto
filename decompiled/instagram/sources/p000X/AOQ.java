package p000X;

/* renamed from: X.AOQ */
public final class AOQ {
    public static APS parseFromJson(C13080hr r4) {
        APS aps = new APS();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("sku".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                C13150hy.A02(str, "<set-?>");
                aps.A01 = str;
            } else if ("support_tier".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                C23334AIl A00 = C23334AIl.A00(str);
                C13150hy.A02(A00, "<set-?>");
                aps.A00 = A00;
            }
            r4.A0f();
        }
        return aps;
    }
}
