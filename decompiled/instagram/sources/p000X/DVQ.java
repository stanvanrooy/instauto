package p000X;

/* renamed from: X.DVQ */
public final class DVQ {
    public static DVV parseFromJson(C13080hr r3) {
        DVV dvv = new DVV();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("node".equals(A0i)) {
                dvv.A00 = DVM.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dvv;
    }
}
