package p000X;

/* renamed from: X.AV8 */
public final class AV8 {
    public static AV9 parseFromJson(C13080hr r3) {
        String A0t;
        AV9 av9 = new AV9();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("is_facebook_copy_ready".equals(A0i)) {
                r3.A0O();
            } else if ("ad_preview_url".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                av9.A00 = A0t;
            } else {
                AnonymousClass1N4.A01(av9, A0i, r3);
            }
            r3.A0f();
        }
        return av9;
    }
}
