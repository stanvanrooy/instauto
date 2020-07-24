package p000X;

/* renamed from: X.CHH */
public final class CHH {
    public static CHI parseFromJson(C13080hr r3) {
        CHI chi = new CHI();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("attempts".equals(A0i)) {
                chi.A00 = r3.A0I();
            } else if ("max_tries".equals(A0i)) {
                chi.A01 = r3.A0I();
            } else if ("verify_field".equals(A0i)) {
                chi.A02 = C228819vo.A00(r3.A0r());
            }
            r3.A0f();
        }
        return chi;
    }
}
