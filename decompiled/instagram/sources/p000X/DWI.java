package p000X;

/* renamed from: X.DWI */
public final class DWI {
    public static C30224DWk parseFromJson(C13080hr r3) {
        String A0t;
        C30224DWk dWk = new C30224DWk();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("uri".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                dWk.A00 = A0t;
            }
            r3.A0f();
        }
        return dWk;
    }
}
