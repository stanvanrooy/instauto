package p000X;

import java.util.ArrayList;

/* renamed from: X.BVG */
public final class BVG {
    public static BVH parseFromJson(C13080hr r4) {
        BVH bvh = new BVH();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("media".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        AnonymousClass1NJ A00 = AnonymousClass1NJ.A00(r4);
                        if (A00 != null) {
                            arrayList.add(A00);
                        }
                    }
                }
                bvh.A00 = arrayList;
            } else {
                AnonymousClass1N4.A01(bvh, A0i, r4);
            }
            r4.A0f();
        }
        return bvh;
    }
}
