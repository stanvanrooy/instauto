package p000X;

import java.util.ArrayList;

/* renamed from: X.AJN */
public final class AJN {
    public static AJQ parseFromJson(C13080hr r4) {
        AJQ ajq = new AJQ();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("charity_donations".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        AJL parseFromJson = AJM.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                ajq.A00 = arrayList;
            } else {
                AnonymousClass1N4.A01(ajq, A0i, r4);
            }
            r4.A0f();
        }
        return ajq;
    }
}
