package p000X;

/* renamed from: X.CFN */
public final class CFN {
    public static C27515CGf parseFromJson(C13080hr r3) {
        C27515CGf cGf = new C27515CGf();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("daily_budget".equals(A0i)) {
                cGf.A00 = r3.A0I();
            } else if ("duration".equals(A0i)) {
                cGf.A01 = r3.A0I();
            }
            r3.A0f();
        }
        return cGf;
    }
}
