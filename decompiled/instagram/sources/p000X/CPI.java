package p000X;

/* renamed from: X.CPI */
public final class CPI {
    public static CPL parseFromJson(C13080hr r3) {
        CPL cpl = new CPL();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("item".equals(A0i)) {
                cpl.A00 = AnonymousClass1NG.A00(r3);
            } else if ("target_item_id".equals(A0i)) {
                if (r3.A0g() != C13120hv.VALUE_NULL) {
                    r3.A0t();
                }
            } else if ("max_push_down".equals(A0i) || "action_type".equals(A0i)) {
                r3.A0I();
            }
            r3.A0f();
        }
        return cpl;
    }
}
