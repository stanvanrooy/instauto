package p000X;

import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.AXQ */
public final class AXQ {
    public static AXR parseFromJson(C13080hr r3) {
        String A0t;
        AXR axr = new AXR();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if (IgReactNavigatorModule.URL.equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                axr.A00 = A0t;
            }
            r3.A0f();
        }
        return axr;
    }
}
