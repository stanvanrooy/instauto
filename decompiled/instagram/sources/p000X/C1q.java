package p000X;

/* renamed from: X.C1q */
public final class C1q {
    public static C3T parseFromJson(C13080hr r4) {
        C3T c3t = new C3T();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("content".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                c3t.A00 = str;
            } else if ("text_key".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                c3t.A01 = str;
            }
            r4.A0f();
        }
        return c3t;
    }
}
