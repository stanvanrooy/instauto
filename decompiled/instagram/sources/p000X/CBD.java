package p000X;

/* renamed from: X.CBD */
public final class CBD {
    public static C28086CbA parseFromJson(C13080hr r3) {
        C28086CbA cbA = new C28086CbA();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("place".equals(A0i)) {
                cbA.A00 = CBC.parseFromJson(r3);
            } else {
                C110154op.A01(cbA, A0i, r3);
            }
            r3.A0f();
        }
        return cbA;
    }
}
