package p000X;

/* renamed from: X.DWB */
public final class DWB {
    public static C30220DWg parseFromJson(C13080hr r3) {
        String A0t;
        C30220DWg dWg = new C30220DWg();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("value".equals(A0i)) {
                dWg.A00 = r3.A0I();
            } else if ("label".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                dWg.A01 = A0t;
            }
            r3.A0f();
        }
        return dWg;
    }
}
