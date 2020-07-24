package p000X;

import java.util.ArrayList;

/* renamed from: X.DWC */
public final class DWC {
    public static C30236DWw parseFromJson(C13080hr r4) {
        C30236DWw dWw = new C30236DWw();
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
                        C30220DWg parseFromJson = DWB.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                dWw.A00 = arrayList;
            }
            r4.A0f();
        }
        return dWw;
    }
}
