package p000X;

import java.util.HashMap;

/* renamed from: X.BUW */
public final class BUW {
    public static C25676BUq parseFromJson(C13080hr r7) {
        HashMap hashMap;
        C25676BUq bUq = new C25676BUq();
        if (r7.A0g() != C13120hv.START_OBJECT) {
            r7.A0f();
            return null;
        }
        while (true) {
            C13120hv A0p = r7.A0p();
            C13120hv r5 = C13120hv.END_OBJECT;
            if (A0p == r5) {
                return bUq;
            }
            String A0i = r7.A0i();
            r7.A0p();
            if ("completed_versions".equals(A0i)) {
                if (r7.A0g() == C13120hv.START_OBJECT) {
                    hashMap = new HashMap();
                    while (r7.A0p() != r5) {
                        String A0t = r7.A0t();
                        r7.A0p();
                        if (r7.A0g() == C13120hv.VALUE_NULL) {
                            hashMap.put(A0t, (Object) null);
                        } else {
                            Integer valueOf = Integer.valueOf(r7.A0I());
                            if (valueOf != null) {
                                hashMap.put(A0t, valueOf);
                            }
                        }
                    }
                } else {
                    hashMap = null;
                }
                bUq.A00 = hashMap;
            }
            r7.A0f();
        }
    }
}
