package p000X;

import java.util.ArrayList;

/* renamed from: X.C45 */
public final class C45 {
    public static C47 parseFromJson(C13080hr r4) {
        C47 c47 = new C47();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("questions".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C46 parseFromJson = C44.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                c47.A00 = arrayList;
            } else {
                AnonymousClass1N4.A01(c47, A0i, r4);
            }
            r4.A0f();
        }
        return c47;
    }
}
