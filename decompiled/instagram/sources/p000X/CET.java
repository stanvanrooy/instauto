package p000X;

/* renamed from: X.CET */
public final class CET {
    public static C27496CFm parseFromJson(C13080hr r3) {
        C27496CFm cFm = new C27496CFm();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("tax".equals(A0i)) {
                cFm.A03 = CFK.parseFromJson(r3);
            } else if ("payment".equals(A0i)) {
                cFm.A02 = C27462CEe.parseFromJson(r3);
            } else if ("error".equals(A0i)) {
                cFm.A00 = C27461CEd.parseFromJson(r3);
            } else if ("non_discrimination_policy_info".equals(A0i)) {
                cFm.A01 = CFP.parseFromJson(r3);
            } else {
                AnonymousClass1N4.A01(cFm, A0i, r3);
            }
            r3.A0f();
        }
        return cFm;
    }
}
