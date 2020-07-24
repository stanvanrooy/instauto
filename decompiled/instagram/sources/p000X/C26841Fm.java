package p000X;

import java.util.ArrayList;

/* renamed from: X.1Fm  reason: invalid class name and case insensitive filesystem */
public final class C26841Fm {
    public static C26851Fn parseFromJson(C13080hr r4) {
        C26851Fn r3 = new C26851Fn();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("pending_follows".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C43651uq parseFromJson = C99354Ri.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                r3.A00 = arrayList;
            }
            r4.A0f();
        }
        return r3;
    }
}
