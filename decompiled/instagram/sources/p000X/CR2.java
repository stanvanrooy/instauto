package p000X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.CR2 */
public final class CR2 {
    public static CRD parseFromJson(C13080hr r3) {
        String A0t;
        CRD crd = new CRD();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if (DialogModule.KEY_TITLE.equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                crd.A00 = A0t;
            }
            r3.A0f();
        }
        return crd;
    }
}
