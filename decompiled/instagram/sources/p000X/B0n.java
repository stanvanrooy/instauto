package p000X;

import java.util.ArrayList;

/* renamed from: X.B0n */
public final class B0n {
    public static B0p parseFromJson(C13080hr r5) {
        ArrayList arrayList;
        String A0t;
        B0p b0p = new B0p();
        if (r5.A0g() != C13120hv.START_OBJECT) {
            r5.A0f();
            return null;
        }
        while (r5.A0p() != C13120hv.END_OBJECT) {
            String A0i = r5.A0i();
            r5.A0p();
            String str = null;
            if ("autocomplete_tag".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    str = r5.A0t();
                }
                b0p.A00 = str;
            } else if ("field_label".equals(A0i) || "field_name".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r5.A0t();
                }
            } else if ("values".equals(A0i)) {
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
                b0p.A01 = arrayList;
            }
            r5.A0f();
        }
        return b0p;
    }
}
