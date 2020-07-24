package p000X;

/* renamed from: X.1lB  reason: invalid class name and case insensitive filesystem */
public final class C38381lB {
    public static C38391lC parseFromJson(C13080hr r3) {
        C38391lC r2 = new C38391lC();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("surface".equals(A0i)) {
                r2.A01 = Integer.valueOf(r3.A0I());
            } else if ("data".equals(A0i)) {
                r2.A00 = C38401lD.parseFromJson(r3);
            }
            r3.A0f();
        }
        return r2;
    }
}
