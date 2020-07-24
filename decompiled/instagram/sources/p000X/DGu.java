package p000X;

/* renamed from: X.DGu */
public final class DGu {
    public static DHL parseFromJson(C13080hr r4) {
        DHL dhl = new DHL();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("delivery_estimate".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dhl.A01 = str;
            } else if ("id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dhl.A02 = str;
            } else if ("name".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dhl.A03 = str;
            } else if ("price".equals(A0i)) {
                dhl.A00 = DH6.parseFromJson(r4);
            }
            r4.A0f();
        }
        return dhl;
    }
}
