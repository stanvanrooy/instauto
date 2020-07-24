package p000X;

/* renamed from: X.BS8 */
public final class BS8 {
    public static BS9 parseFromJson(C13080hr r3) {
        BS9 bs9 = new BS9();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("success".equals(A0i)) {
                bs9.A01 = r3.A0O();
            } else if ("state_changed".equals(A0i)) {
                bs9.A00 = r3.A0O();
            }
            r3.A0f();
        }
        return bs9;
    }
}
