package p000X;

/* renamed from: X.DS2 */
public final class DS2 {
    public static DSD parseFromJson(C13080hr r3) {
        DSD dsd = new DSD();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("backoff".equals(A0i)) {
                dsd.A00 = r3.A0J();
            }
            r3.A0f();
        }
        return dsd;
    }
}
