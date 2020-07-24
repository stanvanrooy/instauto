package p000X;

/* renamed from: X.CJ8 */
public final class CJ8 {
    public static C27587CJg parseFromJson(C13080hr r3) {
        C27587CJg cJg = new C27587CJg();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("type".equals(A0i)) {
                cJg.A01 = C27580CIz.A00(r3.A0I());
            } else if ("response".equals(A0i)) {
                cJg.A00 = CJ9.parseFromJson(r3);
            } else {
                AnonymousClass1N4.A01(cJg, A0i, r3);
            }
            r3.A0f();
        }
        return cJg;
    }
}
