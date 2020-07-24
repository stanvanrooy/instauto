package p000X;

/* renamed from: X.DZF */
public final class DZF {
    public static DZR parseFromJson(C13080hr r3) {
        DZR dzr = new DZR();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("organic".equals(A0i)) {
                dzr.A00 = DZG.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dzr;
    }
}
