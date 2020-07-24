package p000X;

/* renamed from: X.DMg */
public final class DMg {
    public static DN8 parseFromJson(C13080hr r4) {
        DN8 dn8 = new DN8();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("hash".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dn8.A00 = str;
            } else if ("record_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dn8.A01 = str;
            }
            r4.A0f();
        }
        return dn8;
    }
}
