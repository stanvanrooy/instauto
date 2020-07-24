package p000X;

/* renamed from: X.CUQ */
public final class CUQ {
    public static C27862CUc parseFromJson(C13080hr r4) {
        C27862CUc cUc = new C27862CUc();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("catalog_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                cUc.A01 = str;
            } else if ("catalog_name".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                cUc.A02 = str;
            } else if ("products_count".equals(A0i)) {
                cUc.A00 = Integer.valueOf(r4.A0I());
            }
            r4.A0f();
        }
        return cUc;
    }
}
