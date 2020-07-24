package p000X;

/* renamed from: X.BG5 */
public final class BG5 {
    public static BG6 parseFromJson(C13080hr r3) {
        BG6 bg6 = new BG6();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("iab_autofill_delete".equals(A0i)) {
                bg6.A00 = BG4.parseFromJson(r3);
            }
            r3.A0f();
        }
        return bg6;
    }
}
