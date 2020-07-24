package p000X;

/* renamed from: X.BBN */
public final class BBN {
    public static BBQ parseFromJson(C13080hr r3) {
        BBQ bbq = new BBQ();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("eligible_for_cross_tagging".equals(A0i)) {
                bbq.A00 = r3.A0O();
            } else if ("product_id".equals(A0i) && r3.A0g() != C13120hv.VALUE_NULL) {
                r3.A0t();
            }
            r3.A0f();
        }
        return bbq;
    }
}
