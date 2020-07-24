package p000X;

/* renamed from: X.1z2  reason: invalid class name and case insensitive filesystem */
public final class C46041z2 {
    public static AnonymousClass26N parseFromJson(C13080hr r3) {
        String A0t;
        AnonymousClass26N r2 = new AnonymousClass26N();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("name".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                r2.A00 = A0t;
            }
            r3.A0f();
        }
        return r2;
    }
}
