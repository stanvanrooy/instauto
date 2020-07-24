package p000X;

import java.util.HashMap;

/* renamed from: X.0jH  reason: invalid class name and case insensitive filesystem */
public final class C13820jH {
    public static C13830jI parseFromJson(C13080hr r7) {
        HashMap hashMap;
        C13830jI r6 = new C13830jI();
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
            if ("params".equals(A0i)) {
                if (r7.A0g() == C13120hv.START_OBJECT) {
                    hashMap = new HashMap();
                    while (r7.A0p() != r5) {
                        String A0t = r7.A0t();
                        r7.A0p();
                        if (r7.A0g() == C13120hv.VALUE_NULL) {
                            hashMap.put(A0t, (Object) null);
                        } else {
                            C13850jK parseFromJson = C13840jJ.parseFromJson(r7);
                            if (parseFromJson != null) {
                                hashMap.put(A0t, parseFromJson);
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
