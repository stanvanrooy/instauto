package p000X;

import java.util.ArrayList;

/* renamed from: X.1sP  reason: invalid class name and case insensitive filesystem */
public final class C42471sP {
    public static C42331sB parseFromJson(C13080hr r4) {
        C42331sB r3 = new C42331sB();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("reupload_count".equals(A0i)) {
                r3.A00 = r4.A0I();
            } else {
                ArrayList arrayList = null;
                if ("step_auto_retry_count".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            Integer valueOf = Integer.valueOf(r4.A0I());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    }
                    r3.A01 = arrayList;
                } else if ("step_auto_manual_count".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            Integer valueOf2 = Integer.valueOf(r4.A0I());
                            if (valueOf2 != null) {
                                arrayList.add(valueOf2);
                            }
                        }
                    }
                    r3.A02 = arrayList;
                }
            }
            r4.A0f();
        }
        return r3;
    }
}
