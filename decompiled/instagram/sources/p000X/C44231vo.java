package p000X;

import java.util.HashMap;

/* renamed from: X.1vo  reason: invalid class name and case insensitive filesystem */
public final class C44231vo {
    public static C44301vv parseFromJson(C13080hr r7) {
        HashMap hashMap;
        C44301vv r6 = new C44301vv();
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
            if ("configs".equals(A0i)) {
                if (r7.A0g() == C13120hv.START_OBJECT) {
                    hashMap = new HashMap();
                    while (r7.A0p() != r5) {
                        String A0t = r7.A0t();
                        r7.A0p();
                        if (r7.A0g() == C13120hv.VALUE_NULL) {
                            hashMap.put(A0t, (Object) null);
                        } else {
                            C13830jI parseFromJson = C13820jH.parseFromJson(r7);
                            if (parseFromJson != null) {
                                hashMap.put(A0t, parseFromJson);
                            }
                        }
                    }
                } else {
                    hashMap = null;
                }
                r6.A00 = hashMap;
            } else {
                AnonymousClass1N4.A01(r6, A0i, r7);
            }
            r7.A0f();
        }
    }
}
