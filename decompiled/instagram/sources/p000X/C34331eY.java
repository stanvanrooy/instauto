package p000X;

/* renamed from: X.1eY  reason: invalid class name and case insensitive filesystem */
public final class C34331eY {
    public static C46311zX parseFromJson(C13080hr r4) {
        C46311zX r3 = new C46311zX();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("type".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r3.A03 = str;
            } else if ("name".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r3.A02 = str;
            } else if ("thumbnail_url".equals(A0i)) {
                r3.A00 = C13270iF.A00(r4);
            } else if ("templates_info".equals(A0i)) {
                r3.A01 = C172307Yb.parseFromJson(r4);
            }
            r4.A0f();
        }
        return r3;
    }
}
