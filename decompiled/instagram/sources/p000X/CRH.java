package p000X;

/* renamed from: X.CRH */
public final class CRH {
    public static CS2 parseFromJson(C13080hr r3) {
        String A0t;
        CS2 cs2 = new CS2();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("is_published".equals(A0i)) {
                cs2.A00 = Boolean.valueOf(r3.A0O());
            } else if ("retailer_id_search_match".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                cs2.A01 = A0t;
            }
            r3.A0f();
        }
        return cs2;
    }
}
