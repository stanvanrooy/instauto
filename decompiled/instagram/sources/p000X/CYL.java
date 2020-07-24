package p000X;

import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.CYL */
public final class CYL {
    public static CYP parseFromJson(C13080hr r3) {
        String A0t;
        CYP cyp = new CYP();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0i)) {
                cyp.A00 = r3.A0I();
            } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0i)) {
                cyp.A01 = r3.A0I();
            } else if (IgReactNavigatorModule.URL.equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                cyp.A02 = A0t;
            }
            r3.A0f();
        }
        return cyp;
    }
}
