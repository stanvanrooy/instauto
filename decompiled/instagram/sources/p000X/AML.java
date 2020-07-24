package p000X;

import java.util.ArrayList;

/* renamed from: X.AML */
public final class AML {
    public static C23438AMl parseFromJson(C13080hr r4) {
        C23438AMl aMl = new C23438AMl();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("fetch_ts".equals(A0i)) {
                aMl.A02 = r4.A0J();
            } else if ("num_total_requests".equals(A0i)) {
                aMl.A00 = r4.A0I();
            } else if ("num_unseen_requests".equals(A0i)) {
                aMl.A01 = r4.A0I();
            } else if ("users".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C13300iJ A00 = C13300iJ.A00(r4);
                        if (A00 != null) {
                            arrayList.add(A00);
                        }
                    }
                }
                aMl.A03 = arrayList;
            } else {
                AnonymousClass1N4.A01(aMl, A0i, r4);
            }
            r4.A0f();
        }
        return aMl;
    }
}
