package p000X;

/* renamed from: X.BUY */
public final class BUY {
    public static C25671BUl parseFromJson(C13080hr r4) {
        C25671BUl bUl = new C25671BUl();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("x".equals(A0i)) {
                bUl.A01 = (float) r4.A0H();
            } else if ("y".equals(A0i)) {
                bUl.A02 = (float) r4.A0H();
            } else if ("confidence".equals(A0i)) {
                bUl.A00 = (float) r4.A0H();
            }
            r4.A0f();
        }
        return bUl;
    }
}
