package p000X;

/* renamed from: X.DWL */
public final class DWL {
    public static DWQ parseFromJson(C13080hr r3) {
        DWQ dwq = new DWQ();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("summary_promotions".equals(A0i)) {
                dwq.A00 = DWK.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dwq;
    }
}
