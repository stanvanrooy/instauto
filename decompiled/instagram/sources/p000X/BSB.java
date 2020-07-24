package p000X;

import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.BSB */
public final class BSB {
    public static BSC parseFromJson(C13080hr r4) {
        BSC bsc = new BSC();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("key".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                bsc.A01 = str;
            } else if (IgReactNavigatorModule.URL.equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                bsc.A02 = str;
            } else if ("cooldown".equals(A0i)) {
                bsc.A00 = r4.A0I();
            }
            r4.A0f();
        }
        return bsc;
    }
}
