package p000X;

/* renamed from: X.BG9 */
public final class BG9 {
    public static BGA parseFromJson(C13080hr r3) {
        BGA bga = new BGA();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("iab_autofill_save".equals(A0i)) {
                bga.A00 = BG8.parseFromJson(r3);
            }
            r3.A0f();
        }
        return bga;
    }
}
