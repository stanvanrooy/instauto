package p000X;

import java.util.ArrayList;

/* renamed from: X.BBM */
public final class BBM {
    public static BBP parseFromJson(C13080hr r4) {
        BBP bbp = new BBP();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("product_cross_tagging_eligibility".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        BBQ parseFromJson = BBN.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                bbp.A00 = arrayList;
            }
            r4.A0f();
        }
        return bbp;
    }
}
