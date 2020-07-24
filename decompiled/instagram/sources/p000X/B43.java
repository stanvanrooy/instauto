package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;

/* renamed from: X.B43 */
public final class B43 {
    public static B46 parseFromJson(C13080hr r5) {
        ArrayList arrayList;
        String A0t;
        B46 b46 = new B46();
        if (r5.A0g() != C13120hv.START_OBJECT) {
            r5.A0f();
            return null;
        }
        while (r5.A0p() != C13120hv.END_OBJECT) {
            String A0i = r5.A0i();
            r5.A0p();
            if (!"parameter_name".equals(A0i) && !DialogModule.KEY_TITLE.equals(A0i)) {
                if ("values".equals(A0i)) {
                    if (r5.A0g() == C13120hv.START_ARRAY) {
                        arrayList = new ArrayList();
                        while (r5.A0p() != C13120hv.END_ARRAY) {
                            if (r5.A0g() == C13120hv.VALUE_NULL) {
                                A0t = null;
                            } else {
                                A0t = r5.A0t();
                            }
                            if (A0t != null) {
                                arrayList.add(A0t);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    b46.A00 = arrayList;
                } else if (!"current_value".equals(A0i)) {
                }
                r5.A0f();
            }
            if (r5.A0g() != C13120hv.VALUE_NULL) {
                r5.A0t();
            }
            r5.A0f();
        }
        return b46;
    }
}
