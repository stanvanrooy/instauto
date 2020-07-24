package p000X;

import java.util.ArrayList;

/* renamed from: X.CEM */
public final class CEM {
    public static CFZ parseFromJson(C13080hr r4) {
        CFZ cfz = new CFZ();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("available_audiences".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        CFW parseFromJson = C27436CDe.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                cfz.A01 = arrayList;
            } else if ("should_show_regulated_categories_toggle".equals(A0i)) {
                cfz.A02 = r4.A0O();
            } else if ("error".equals(A0i)) {
                cfz.A00 = C27461CEd.parseFromJson(r4);
            } else {
                AnonymousClass1N4.A01(cfz, A0i, r4);
            }
            r4.A0f();
        }
        return cfz;
    }
}
