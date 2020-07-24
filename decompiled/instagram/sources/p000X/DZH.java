package p000X;

/* renamed from: X.DZH */
public final class DZH {
    public static DZQ parseFromJson(C13080hr r3) {
        DZQ dzq = new DZQ();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("organic".equals(A0i)) {
                dzq.A00 = DZI.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dzq;
    }
}
