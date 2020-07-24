package p000X;

/* renamed from: X.CO3 */
public final class CO3 {
    public static CO9 parseFromJson(C13080hr r4) {
        CO9 co9 = new CO9();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("username".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                co9.A03 = str;
            } else if ("pk".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                co9.A02 = str;
            } else if ("full_name".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                co9.A00 = str;
            } else if ("profile_pic_url".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                co9.A01 = str;
            } else if (AnonymousClass0C5.$const$string(115).equals(A0i) && r4.A0g() != C13120hv.VALUE_NULL) {
                r4.A0t();
            }
            r4.A0f();
        }
        return co9;
    }
}
