package p000X;

/* renamed from: X.B3J */
public final class B3J {
    public static B3K parseFromJson(C13080hr r4) {
        B3K b3k = new B3K();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("value".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                b3k.A02 = str;
            } else if ("text".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                b3k.A01 = str;
            } else if ("num_responders".equals(A0i)) {
                b3k.A00 = r4.A0I();
            }
            r4.A0f();
        }
        return b3k;
    }
}
