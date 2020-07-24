package p000X;

import java.util.ArrayList;

/* renamed from: X.DX3 */
public final class DX3 {
    public static DX4 parseFromJson(C13080hr r4) {
        DX4 dx4 = new DX4();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("nodes".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        DXL parseFromJson = DXA.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                dx4.A00 = arrayList;
            }
            r4.A0f();
        }
        return dx4;
    }
}
