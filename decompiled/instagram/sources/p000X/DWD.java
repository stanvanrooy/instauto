package p000X;

import java.util.ArrayList;

/* renamed from: X.DWD */
public final class DWD {
    public static C30232DWs parseFromJson(C13080hr r4) {
        C30232DWs dWs = new C30232DWs();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ArrayList arrayList = null;
            if ("graph_name".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r4.A0t();
                }
            } else if ("data_points".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C30218DWe parseFromJson = DWE.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                dWs.A00 = arrayList;
            }
            r4.A0f();
        }
        return dWs;
    }
}
