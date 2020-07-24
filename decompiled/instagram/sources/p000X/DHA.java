package p000X;

/* renamed from: X.DHA */
public final class DHA {
    public static DHV parseFromJson(C13080hr r4) {
        DHV dhv = new DHV();
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
                dhv.A00 = str;
            } else if ("currency".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dhv.A01 = str;
            }
            r4.A0f();
        }
        return dhv;
    }
}
