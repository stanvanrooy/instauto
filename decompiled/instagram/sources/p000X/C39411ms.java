package p000X;

/* renamed from: X.1ms  reason: invalid class name and case insensitive filesystem */
public final class C39411ms {
    public static C39421mt parseFromJson(C13080hr r4) {
        C39421mt r3 = new C39421mt();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("num_columns".equals(A0i) || "total_num_columns".equals(A0i)) {
                r4.A0I();
            } else if ("aspect_ratio".equals(A0i)) {
                r3.A00 = (float) r4.A0H();
            } else if ("autoplay".equals(A0i)) {
                r3.A01 = r4.A0O();
            }
            r4.A0f();
        }
        return r3;
    }
}
