package p000X;

/* renamed from: X.CCR */
public final class CCR {
    public static CCV parseFromJson(C13080hr r4) {
        CCV ccv = new CCV();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("page_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                ccv.A02 = str;
            } else if (AnonymousClass0C5.$const$string(272).equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                ccv.A03 = str;
            } else if (AnonymousClass40t.$const$string(281).equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                ccv.A04 = str;
            } else if (AnonymousClass40t.$const$string(7).equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                ccv.A00 = str;
            } else if ("like_count".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                ccv.A01 = str;
            }
            r4.A0f();
        }
        return ccv;
    }
}
