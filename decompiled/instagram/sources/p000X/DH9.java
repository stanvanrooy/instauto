package p000X;

/* renamed from: X.DH9 */
public final class DH9 {
    public static DHX parseFromJson(C13080hr r4) {
        DHX dhx = new DHX();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("amount".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dhx.A00 = str;
            } else if ("currency".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dhx.A01 = str;
            }
            r4.A0f();
        }
        return dhx;
    }
}
