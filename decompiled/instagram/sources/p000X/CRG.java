package p000X;

/* renamed from: X.CRG */
public final class CRG {
    public static C27788CRg parseFromJson(C13080hr r3) {
        String A0t;
        C27788CRg cRg = new C27788CRg();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if (AnonymousClass0C5.$const$string(112).equals(A0i)) {
                cRg.A00 = C213699Jj.parseFromJson(r3);
            } else if ("metadata".equals(A0i)) {
                cRg.A01 = CRH.parseFromJson(r3);
            } else if ("variant_description".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                cRg.A02 = A0t;
            }
            r3.A0f();
        }
        return cRg;
    }
}
