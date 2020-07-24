package p000X;

/* renamed from: X.CFP */
public final class CFP {
    public static C27514CGe parseFromJson(C13080hr r3) {
        C27514CGe cGe = new C27514CGe();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("is_blocking_create".equals(A0i)) {
                cGe.A01 = r3.A0O();
            } else if ("is_accepted".equals(A0i)) {
                cGe.A00 = r3.A0O();
            }
            r3.A0f();
        }
        return cGe;
    }
}
