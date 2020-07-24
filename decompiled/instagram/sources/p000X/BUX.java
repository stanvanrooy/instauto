package p000X;

import java.util.ArrayList;

/* renamed from: X.BUX */
public final class BUX {
    public static C25672BUm parseFromJson(C13080hr r4) {
        C25672BUm bUm = new C25672BUm();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("faces".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C25671BUl parseFromJson = BUY.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                bUm.A00 = arrayList;
            }
            r4.A0f();
        }
        return bUm;
    }
}
