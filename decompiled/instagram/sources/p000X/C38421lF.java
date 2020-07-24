package p000X;

/* renamed from: X.1lF  reason: invalid class name and case insensitive filesystem */
public final class C38421lF {
    public static C38431lG parseFromJson(C13080hr r3) {
        C38431lG r2 = new C38431lG();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("eligible_promotions".equals(A0i)) {
                r2.A00 = C38441lH.parseFromJson(r3);
            }
            r3.A0f();
        }
        return r2;
    }
}
