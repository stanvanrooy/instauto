package p000X;

/* renamed from: X.0hz  reason: invalid class name and case insensitive filesystem */
public final class C13160hz {
    public static C13170i0 parseFromJson(C13080hr r3) {
        C13170i0 r2 = new C13170i0();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("user_info".equals(A0i)) {
                r2.A01 = C13210i4.parseFromJson(r3);
            } else if ("time_accessed".equals(A0i)) {
                r2.A00 = r3.A0J();
            }
            r3.A0f();
        }
        return r2;
    }
}
