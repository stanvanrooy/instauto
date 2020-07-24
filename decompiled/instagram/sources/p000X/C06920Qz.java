package p000X;

import java.util.ArrayList;

/* renamed from: X.0Qz  reason: invalid class name and case insensitive filesystem */
public final class C06920Qz {
    public static AnonymousClass0R0 parseFromJson(C13080hr r5) {
        ArrayList arrayList;
        String A0t;
        AnonymousClass0R0 r4 = new AnonymousClass0R0();
        if (r5.A0g() != C13120hv.START_OBJECT) {
            r5.A0f();
            return null;
        }
        while (r5.A0p() != C13120hv.END_OBJECT) {
            String A0i = r5.A0i();
            r5.A0p();
            if ("errors".equals(A0i)) {
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
                r4.A00 = arrayList;
            }
            r5.A0f();
        }
        return r4;
    }
}
