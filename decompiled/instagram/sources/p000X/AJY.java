package p000X;

/* renamed from: X.AJY */
public final class AJY {
    public static AJX parseFromJson(C13080hr r4) {
        AJX ajx = new AJX();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("user".equals(A0i)) {
                C13300iJ A00 = C13300iJ.A00(r4);
                C13150hy.A02(A00, "<set-?>");
                ajx.A00 = A00;
            } else {
                String str = null;
                if ("support_tier".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    C23334AIl A002 = C23334AIl.A00(str);
                    C13150hy.A02(A002, "<set-?>");
                    ajx.A01 = A002;
                } else if ("ts_secs".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    C13150hy.A02(str, "<set-?>");
                    ajx.A02 = str;
                }
            }
            r4.A0f();
        }
        return ajx;
    }
}
