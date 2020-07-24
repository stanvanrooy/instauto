package p000X;

/* renamed from: X.1aT  reason: invalid class name and case insensitive filesystem */
public final class C32051aT {
    public static C32061aU parseFromJson(C13080hr r3) {
        C32061aU r2 = new C32061aU();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("explore".equals(A0i)) {
                r2.A00 = C32071aV.parseFromJson(r3);
            }
            r3.A0f();
        }
        return r2;
    }
}
