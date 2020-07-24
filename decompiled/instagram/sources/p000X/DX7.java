package p000X;

import java.util.ArrayList;

/* renamed from: X.DX7 */
public final class DX7 {
    public static DX8 parseFromJson(C13080hr r4) {
        DX8 dx8 = new DX8();
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
                        DXM parseFromJson = DXB.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                dx8.A00 = arrayList;
            }
            r4.A0f();
        }
        return dx8;
    }
}
