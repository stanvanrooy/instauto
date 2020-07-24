package p000X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.B01 */
public final class B01 {
    public static B00 parseFromJson(C13080hr r4) {
        B00 b00 = new B00();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("address_level1".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                b00.A00 = str;
            } else if ("address_level2".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                b00.A01 = str;
            } else if ("address_line1".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                b00.A02 = str;
            } else if ("address_line2".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                b00.A03 = str;
            } else if ("country".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                b00.A04 = str;
            } else if (IgReactPurchaseExperienceBridgeModule.EMAIL.equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                b00.A05 = str;
            } else if ("family_name".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                b00.A06 = str;
            } else if ("given_name".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                b00.A07 = str;
            } else if ("postal_code".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                b00.A08 = str;
            } else if ("tel".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                b00.A09 = str;
            }
            r4.A0f();
        }
        return b00;
    }
}
