package p000X;

/* renamed from: X.0yn  reason: invalid class name and case insensitive filesystem */
public final class C22660yn {
    public static C22670yo parseFromJson(C13080hr r4) {
        C22670yo r3 = new C22670yo();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("n".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r3.A01 = str;
            } else if ("v".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r3.A02 = str;
            } else if ("t".equals(A0i)) {
                r3.A00 = (C22680yp) C22680yp.A03.get(r4.A0r());
            }
            r4.A0f();
        }
        return r3;
    }
}
