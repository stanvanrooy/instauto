package p000X;

/* renamed from: X.DGg */
public final class DGg {
    public static DHF parseFromJson(C13080hr r4) {
        DHF dhf = new DHF();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("is_default".equals(A0i)) {
                dhf.A09 = r4.A0O();
            } else if ("verified".equals(A0i)) {
                dhf.A0A = r4.A0O();
            } else {
                String str = null;
                if ("care_of".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dhf.A00 = str;
                } else if ("city".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dhf.A01 = str;
                } else if ("country".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dhf.A02 = str;
                } else if ("id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dhf.A03 = str;
                } else if ("label".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dhf.A04 = str;
                } else if ("postal_code".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dhf.A05 = str;
                } else if ("state".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dhf.A06 = str;
                } else if ("street1".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dhf.A07 = str;
                } else if ("street2".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dhf.A08 = str;
                }
            }
            r4.A0f();
        }
        return dhf;
    }
}
