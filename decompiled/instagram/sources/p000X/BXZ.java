package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BXZ */
public final class BXZ {
    public static C25732BXc parseFromJson(C13080hr r7) {
        C25732BXc bXc = new C25732BXc();
        if (r7.A0g() != C13120hv.START_OBJECT) {
            r7.A0f();
            return null;
        }
        while (r7.A0p() != C13120hv.END_OBJECT) {
            String A0i = r7.A0i();
            r7.A0p();
            if ("states".equals(A0i)) {
                ArrayList arrayList = null;
                if (r7.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r7.A0p() != C13120hv.END_ARRAY) {
                        BXX parseFromJson = BXW.parseFromJson(r7);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                bXc.A00 = arrayList;
            }
            r7.A0f();
        }
        List list = bXc.A00;
        if (list == null) {
            bXc.A00 = new ArrayList();
            return bXc;
        }
        synchronized (list) {
            for (BXX bxx : bXc.A00) {
                bXc.A01.put(AnonymousClass000.A0E(bxx.A02, bxx.A01), bxx);
            }
        }
        return bXc;
    }
}
