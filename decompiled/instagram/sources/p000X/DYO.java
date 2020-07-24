package p000X;

/* renamed from: X.DYO */
public final class DYO {
    public static DYQ parseFromJson(C13080hr r3) {
        DYQ dyq = new DYQ();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("async_ads_event".equals(A0i)) {
                dyq.A00 = DYP.parseFromJson(r3);
            } else {
                AnonymousClass1N4.A01(dyq, A0i, r3);
            }
            r3.A0f();
        }
        return dyq;
    }
}
