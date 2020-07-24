package p000X;

/* renamed from: X.1sM  reason: invalid class name and case insensitive filesystem */
public final class C42441sM {
    public static C42301s8 parseFromJson(C13080hr r3) {
        C42301s8 r2 = new C42301s8();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("strength".equals(A0i)) {
                r2.A00 = r3.A0I();
            } else if ("type".equals(A0i)) {
                r2.A01 = r3.A0I();
            }
            r3.A0f();
        }
        return r2;
    }

    public static void A00(C13460iZ r2, C42301s8 r3) {
        r2.A0T();
        r2.A0F("strength", r3.A00);
        r2.A0F("type", r3.A01);
        r2.A0Q();
    }
}
