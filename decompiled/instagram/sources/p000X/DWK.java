package p000X;

import java.util.ArrayList;

/* renamed from: X.DWK */
public final class DWK {
    public static C30223DWj parseFromJson(C13080hr r4) {
        C30223DWj dWj = new C30223DWj();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("edges".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        DWR parseFromJson = DWJ.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                dWj.A00 = arrayList;
            }
            r4.A0f();
        }
        return dWj;
    }
}
