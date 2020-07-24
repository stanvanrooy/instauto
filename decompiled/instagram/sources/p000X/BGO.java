package p000X;

/* renamed from: X.BGO */
public final class BGO {
    public static BGP parseFromJson(C13080hr r3) {
        BGP bgp = new BGP();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("__typename".equals(A0i) || "id".equals(A0i) || "name".equals(A0i)) {
                if (r3.A0g() != C13120hv.VALUE_NULL) {
                    r3.A0t();
                }
            } else if ("survey_session".equals(A0i)) {
                bgp.A00 = C26874Bty.parseFromJson(r3);
            }
            r3.A0f();
        }
        return bgp;
    }
}
