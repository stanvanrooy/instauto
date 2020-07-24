package p000X;

/* renamed from: X.1lD  reason: invalid class name and case insensitive filesystem */
public final class C38401lD {
    public static C38411lE parseFromJson(C13080hr r3) {
        C38411lE r2 = new C38411lE();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("viewer".equals(A0i)) {
                r2.A00 = C38421lF.parseFromJson(r3);
            }
            r3.A0f();
        }
        return r2;
    }
}
