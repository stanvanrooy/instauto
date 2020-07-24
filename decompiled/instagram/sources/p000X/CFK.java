package p000X;

/* renamed from: X.CFK */
public final class CFK {
    public static CGV parseFromJson(C13080hr r4) {
        CGV cgv = new CGV();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("estimated_tax_rate".equals(A0i)) {
                cgv.A00 = (float) r4.A0H();
            }
            r4.A0f();
        }
        return cgv;
    }
}
