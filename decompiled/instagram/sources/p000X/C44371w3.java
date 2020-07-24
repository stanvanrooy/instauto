package p000X;

/* renamed from: X.1w3  reason: invalid class name and case insensitive filesystem */
public final class C44371w3 {
    public static C36001hH parseFromJson(C13080hr r4) {
        C36001hH r3 = new C36001hH();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("x".equals(A0i)) {
                r3.A00 = (float) r4.A0H();
            } else if ("y".equals(A0i)) {
                r3.A01 = (float) r4.A0H();
            }
            r4.A0f();
        }
        return r3;
    }
}
