package p000X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.C9V */
public final class C9V {
    public static C9W parseFromJson(C13080hr r3) {
        Integer num;
        C9W c9w = new C9W();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if (TraceFieldType.ErrorCode.equals(A0i)) {
                String A0r = r3.A0r();
                if (A0r == null || A0r.isEmpty() || !A0r.equalsIgnoreCase("OLD_POST")) {
                    num = Constants.ZERO;
                } else {
                    num = Constants.ONE;
                }
                c9w.A00 = num;
            }
            r3.A0f();
        }
        return c9w;
    }
}
