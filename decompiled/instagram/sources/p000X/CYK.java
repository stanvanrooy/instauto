package p000X;

import java.util.ArrayList;

/* renamed from: X.CYK */
public final class CYK {
    public static CYT parseFromJson(C13080hr r4) {
        CYT cyt = new CYT();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if (AnonymousClass0C5.$const$string(201).equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        CYP parseFromJson = CYL.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                cyt.A00 = arrayList;
            }
            r4.A0f();
        }
        return cyt;
    }
}
