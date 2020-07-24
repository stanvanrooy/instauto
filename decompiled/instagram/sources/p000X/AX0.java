package p000X;

/* renamed from: X.AX0 */
public final class AX0 {
    public static AX1 parseFromJson(C13080hr r4) {
        AX1 ax1 = new AX1();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("matcher".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                ax1.A00 = str;
            } else if ("replacer".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                ax1.A01 = str;
            }
            r4.A0f();
        }
        return ax1;
    }
}
