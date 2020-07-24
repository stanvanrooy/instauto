package p000X;

/* renamed from: X.1dY  reason: invalid class name and case insensitive filesystem */
public final class C33821dY {
    public static C17190pp parseFromJson(C13080hr r4) {
        C17190pp r3 = new C17190pp();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("name".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r3.A00 = str;
            } else if ("value".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r3.A01 = str;
            }
            r4.A0f();
        }
        return r3;
    }
}
