package p000X;

/* renamed from: X.DGZ */
public final class DGZ {
    public static DGY parseFromJson(C13080hr r3) {
        DGY dgy = new DGY();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("is_disabled".equals(A0i)) {
                dgy.A01 = r3.A0O();
            } else if ("is_selected".equals(A0i)) {
                dgy.A02 = r3.A0O();
            } else if ("payment_credential_option".equals(A0i)) {
                dgy.A00 = CHE.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dgy;
    }
}
