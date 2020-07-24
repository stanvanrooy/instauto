package p000X;

/* renamed from: X.BYJ */
public final class BYJ {
    public static BYL parseFromJson(C13080hr r4) {
        BYL byl = new BYL();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("one_on_one_message_setting".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                byl.A01 = str;
            } else if ("group_message_setting".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                byl.A00 = str;
            } else {
                AnonymousClass1N4.A01(byl, A0i, r4);
            }
            r4.A0f();
        }
        return byl;
    }
}
