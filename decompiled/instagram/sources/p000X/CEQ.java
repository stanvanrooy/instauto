package p000X;

import java.util.HashMap;

/* renamed from: X.CEQ */
public final class CEQ {
    public static CG6 parseFromJson(C13080hr r7) {
        HashMap hashMap;
        CG6 cg6 = new CG6();
        if (r7.A0g() != C13120hv.START_OBJECT) {
            r7.A0f();
            return null;
        }
        while (true) {
            C13120hv A0p = r7.A0p();
            C13120hv r6 = C13120hv.END_OBJECT;
            if (A0p == r6) {
                return cg6;
            }
            String A0i = r7.A0i();
            r7.A0p();
            if ("total_budget_with_offset_to_reach_estimate".equals(A0i)) {
                if (r7.A0g() == C13120hv.START_OBJECT) {
                    hashMap = new HashMap();
                    while (r7.A0p() != r6) {
                        String A0t = r7.A0t();
                        r7.A0p();
                        if (r7.A0g() == C13120hv.VALUE_NULL) {
                            hashMap.put(A0t, (Object) null);
                        } else {
                            C27408CCb parseFromJson = C27407CCa.parseFromJson(r7);
                            if (parseFromJson != null) {
                                hashMap.put(A0t, parseFromJson);
                            }
                        }
                    }
                } else {
                    hashMap = null;
                }
                cg6.A01 = hashMap;
            } else if ("error".equals(A0i)) {
                cg6.A00 = C27461CEd.parseFromJson(r7);
            } else {
                AnonymousClass1N4.A01(cg6, A0i, r7);
            }
            r7.A0f();
        }
    }
}
