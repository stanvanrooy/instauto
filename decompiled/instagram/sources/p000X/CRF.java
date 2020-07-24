package p000X;

/* renamed from: X.CRF */
public final class CRF {
    public static C27789CRh parseFromJson(C13080hr r3) {
        C27789CRh cRh = new C27789CRh();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("product_item".equals(A0i)) {
                cRh.A00 = C44861wt.parseFromJson(r3);
            } else if ("metadata".equals(A0i)) {
                cRh.A01 = CRH.parseFromJson(r3);
            }
            r3.A0f();
        }
        return cRh;
    }
}
