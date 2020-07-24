package p000X;

/* renamed from: X.CP1 */
public final class CP1 {
    public static CP5 parseFromJson(C13080hr r3) {
        CP5 cp5 = new CP5();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("is_eligible_for_product_tagging".equals(A0i)) {
                cp5.A00 = r3.A0O();
            } else if ("is_whitelisted_for_product_tagging".equals(A0i)) {
                cp5.A01 = r3.A0O();
            }
            r3.A0f();
        }
        return cp5;
    }
}
