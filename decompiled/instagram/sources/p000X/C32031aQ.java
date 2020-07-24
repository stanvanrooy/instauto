package p000X;

import java.util.ArrayList;

/* renamed from: X.1aQ  reason: invalid class name and case insensitive filesystem */
public final class C32031aQ {
    public static C32041aR parseFromJson(C13080hr r4) {
        C32041aR r3 = new C32041aR();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("list".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        Integer valueOf = Integer.valueOf(r4.A0I());
                        if (valueOf != null) {
                            arrayList.add(valueOf);
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
