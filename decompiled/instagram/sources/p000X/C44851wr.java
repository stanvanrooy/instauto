package p000X;

import com.instagram.model.shopping.ProductTag;
import java.util.ArrayList;

/* renamed from: X.1wr  reason: invalid class name and case insensitive filesystem */
public final class C44851wr {
    public static C472822y parseFromJson(C13080hr r4) {
        C472822y r3 = new C472822y();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("in".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        ProductTag parseFromJson = C472922z.parseFromJson(r4);
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
