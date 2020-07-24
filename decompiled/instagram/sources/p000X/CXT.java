package p000X;

import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.CXT */
public final class CXT {
    public static CY2 parseFromJson(C13080hr r3) {
        String A0t;
        CY2 cy2 = new CY2();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0i)) {
                cy2.A00 = r3.A0I();
            } else if ("type".equals(A0i)) {
                cy2.A01 = r3.A0I();
            } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0i)) {
                cy2.A02 = r3.A0I();
            } else if (IgReactNavigatorModule.URL.equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                cy2.A03 = A0t;
            }
            r3.A0f();
        }
        return cy2;
    }
}
