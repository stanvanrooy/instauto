package p000X;

/* renamed from: X.C44 */
public final class C44 {
    public static C46 parseFromJson(C13080hr r4) {
        C46 c46 = new C46();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("user".equals(A0i)) {
                c46.A01 = C13300iJ.A00(r4);
            } else {
                String str = null;
                if ("text".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    c46.A04 = str;
                } else if ("qid".equals(A0i)) {
                    c46.A00 = r4.A0J();
                } else if ("source".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    c46.A03 = str;
                } else if ("timestamp".equals(A0i)) {
                    c46.A02 = Long.valueOf(r4.A0J());
                }
            }
            r4.A0f();
        }
        return c46;
    }
}
