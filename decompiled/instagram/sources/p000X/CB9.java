package p000X;

import java.util.ArrayList;

/* renamed from: X.CB9 */
public final class CB9 {
    public static CBA parseFromJson(C13080hr r4) {
        CBA cba = new CBA();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("places".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C28086CbA parseFromJson = CBD.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                cba.A00 = arrayList;
            }
            r4.A0f();
        }
        return cba;
    }
}
