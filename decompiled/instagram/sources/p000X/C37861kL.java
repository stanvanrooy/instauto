package p000X;

/* renamed from: X.1kL  reason: invalid class name and case insensitive filesystem */
public final class C37861kL {
    public static C37871kM parseFromJson(C13080hr r3) {
        String A0t;
        C37871kM r2 = new C37871kM();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("slot".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                r2.A01 = A0t;
            } else if ("cooldown".equals(A0i)) {
                r2.A00 = Long.valueOf(r3.A0J());
            }
            r3.A0f();
        }
        return r2;
    }
}
