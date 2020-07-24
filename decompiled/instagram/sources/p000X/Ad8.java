package p000X;

/* renamed from: X.Ad8 */
public final class Ad8 {
    public static Ad7 parseFromJson(C13080hr r4) {
        Ad7 ad7 = new Ad7();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("thread_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                ad7.A00 = str;
            } else if ("video_call_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                ad7.A01 = str;
            } else {
                AnonymousClass1N4.A01(ad7, A0i, r4);
            }
            r4.A0f();
        }
        return ad7;
    }
}
