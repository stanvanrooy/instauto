package p000X;

/* renamed from: X.CMK */
public final class CMK {
    public static CMR parseFromJson(C13080hr r3) {
        CMR cmr = new CMR();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("category".equals(A0i)) {
                cmr.A00 = CMJ.parseFromJson(r3);
            } else {
                AnonymousClass1N4.A01(cmr, A0i, r3);
            }
            r3.A0f();
        }
        return cmr;
    }
}
