package p000X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.AXM */
public final class AXM {
    public static AXN parseFromJson(C13080hr r3) {
        AXN axn = new AXN();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0i) || IgReactMediaPickerNativeModule.WIDTH.equals(A0i)) {
                r3.A0I();
            }
            r3.A0f();
        }
        return axn;
    }
}
