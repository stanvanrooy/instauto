package p000X;

/* renamed from: X.DHC */
public final class DHC {
    public static C29935DHl parseFromJson(C13080hr r3) {
        String A0t;
        C29935DHl dHl = new C29935DHl();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("text".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                dHl.A00 = A0t;
            }
            r3.A0f();
        }
        return dHl;
    }
}
