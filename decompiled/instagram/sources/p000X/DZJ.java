package p000X;

/* renamed from: X.DZJ */
public final class DZJ {
    public static DZP parseFromJson(C13080hr r3) {
        DZP dzp = new DZP();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("organic".equals(A0i)) {
                dzp.A00 = DZK.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dzp;
    }
}
