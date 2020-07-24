package p000X;

/* renamed from: X.CFQ */
public final class CFQ {
    public static C27519CGj parseFromJson(C13080hr r3) {
        String A0t;
        C27519CGj cGj = new C27519CGj();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if (C193418Ps.$const$string(98).equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                cGj.A00 = A0t;
            }
            r3.A0f();
        }
        return cGj;
    }
}
