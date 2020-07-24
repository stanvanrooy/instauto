package p000X;

import java.util.ArrayList;

/* renamed from: X.DVD */
public final class DVD {
    public static DVE parseFromJson(C13080hr r4) {
        DVE dve = new DVE();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("count".equals(A0i)) {
                r4.A0I();
            } else if ("edges".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        DVG parseFromJson = DVF.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                dve.A00 = arrayList;
            }
            r4.A0f();
        }
        return dve;
    }
}
