package p000X;

import java.util.ArrayList;

/* renamed from: X.CBG */
public final class CBG {
    public static CBM parseFromJson(C13080hr r4) {
        CBM cbm = new CBM();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("top_items".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        AnonymousClass1NJ A00 = AnonymousClass1NJ.A00(r4);
                        if (A00 != null) {
                            arrayList.add(A00);
                        }
                    }
                }
                cbm.A00 = arrayList;
            }
            r4.A0f();
        }
        return cbm;
    }
}
