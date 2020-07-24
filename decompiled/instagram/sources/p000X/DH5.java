package p000X;

/* renamed from: X.DH5 */
public final class DH5 {
    public static DHM parseFromJson(C13080hr r3) {
        DHM dhm = new DHM();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("incremental_delay_secs".equals(A0i)) {
                dhm.A00 = r3.A0H();
            } else if ("maximum_retry_secs".equals(A0i)) {
                dhm.A01 = r3.A0H();
            }
            r3.A0f();
        }
        return dhm;
    }
}
