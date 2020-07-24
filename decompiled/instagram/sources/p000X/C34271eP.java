package p000X;

/* renamed from: X.1eP  reason: invalid class name and case insensitive filesystem */
public final class C34271eP {
    public static C34281eQ parseFromJson(C13080hr r4) {
        String A0t;
        C34281eQ r3 = new C34281eQ();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("text".equals(A0i)) {
                if (r4.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r4.A0t();
                }
                r3.A02 = A0t;
            } else if ("count".equals(A0i)) {
                r3.A01 = r4.A0I();
            } else if ("font_size".equals(A0i)) {
                r3.A00 = (float) r4.A0H();
            }
            r4.A0f();
        }
        return r3;
    }

    public static void A00(C13460iZ r2, C34281eQ r3) {
        r2.A0T();
        String str = r3.A02;
        if (str != null) {
            r2.A0H("text", str);
        }
        r2.A0F("count", r3.A01);
        r2.A0E("font_size", r3.A00);
        r2.A0Q();
    }
}
