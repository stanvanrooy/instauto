package p000X;

/* renamed from: X.DZL */
public final class DZL {
    public static DZO parseFromJson(C13080hr r3) {
        DZO dzo = new DZO();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("tray".equals(A0i)) {
                dzo.A00 = DZM.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dzo;
    }
}
