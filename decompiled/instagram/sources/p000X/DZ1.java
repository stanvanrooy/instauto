package p000X;

import java.util.ArrayList;

/* renamed from: X.DZ1 */
public final class DZ1 {
    public static DZ2 parseFromJson(C13080hr r4) {
        DZ2 dz2 = new DZ2();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("page_info".equals(A0i)) {
                dz2.A00 = DZ5.parseFromJson(r4);
            } else if ("edges".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        DZ4 parseFromJson = DZ3.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                dz2.A01 = arrayList;
            }
            r4.A0f();
        }
        return dz2;
    }
}
