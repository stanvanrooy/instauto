package p000X;

/* renamed from: X.DVF */
public final class DVF {
    public static DVG parseFromJson(C13080hr r3) {
        DVG dvg = new DVG();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("node".equals(A0i)) {
                dvg.A00 = DVI.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dvg;
    }
}
