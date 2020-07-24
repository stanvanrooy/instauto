package p000X;

/* renamed from: X.CY5 */
public final class CY5 {
    public static CYB parseFromJson(C13080hr r4) {
        Integer num;
        CYB cyb = new CYB();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("background_color".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                cyb.A02 = str;
            } else if ("bottom_margin".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                cyb.A03 = str;
            } else if ("left_margin".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                cyb.A04 = str;
            } else if ("right_margin".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                cyb.A05 = str;
            } else if ("top_margin".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                cyb.A06 = str;
            } else if ("vertical_constraint".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r4.A0t();
                }
            } else if ("alignment".equals(A0i)) {
                String A0r = r4.A0r();
                if (A0r != null && !A0r.isEmpty()) {
                    if (A0r.equalsIgnoreCase("LEFT")) {
                        num = Constants.ONE;
                    } else if (A0r.equalsIgnoreCase("CENTER")) {
                        num = Constants.A0C;
                    } else if (A0r.equalsIgnoreCase("RIGHT")) {
                        num = Constants.A0N;
                    }
                    cyb.A01 = num;
                }
                num = Constants.ZERO;
                cyb.A01 = num;
            } else if ("text_metrics".equals(A0i)) {
                cyb.A00 = CYJ.parseFromJson(r4);
            }
            r4.A0f();
        }
        return cyb;
    }
}
