package p000X;

/* renamed from: X.1kJ  reason: invalid class name and case insensitive filesystem */
public final class C37841kJ {
    public static C37851kK parseFromJson(C13080hr r3) {
        C37851kK r2 = new C37851kK();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("surface_id".equals(A0i)) {
                r2.A00 = Integer.valueOf(r3.A0I());
            } else if ("cooldown".equals(A0i)) {
                r2.A01 = Long.valueOf(r3.A0J());
            }
            r3.A0f();
        }
        return r2;
    }
}
