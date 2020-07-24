package p000X;

/* renamed from: X.AX2 */
public final class AX2 {
    public static AX3 parseFromJson(C13080hr r3) {
        String A0t;
        AX3 ax3 = new AX3();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("bd".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                ax3.A00 = A0t;
            }
            r3.A0f();
        }
        return ax3;
    }
}
