package p000X;

import java.util.HashMap;

/* renamed from: X.1uH  reason: invalid class name and case insensitive filesystem */
public final class C43361uH {
    public static C43371uI parseFromJson(C13080hr r7) {
        HashMap hashMap;
        C43371uI r6 = new C43371uI();
        if (r7.A0g() != C13120hv.START_OBJECT) {
            r7.A0f();
            return null;
        }
        while (true) {
            C13120hv A0p = r7.A0p();
            C13120hv r5 = C13120hv.END_OBJECT;
            if (A0p == r5) {
                return r6;
            }
            String A0i = r7.A0i();
            r7.A0p();
            if ("counters".equals(A0i)) {
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
                r6.A00 = hashMap;
            }
            r7.A0f();
        }
    }
}
