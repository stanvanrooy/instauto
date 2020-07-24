package p000X;

import java.util.HashMap;

/* renamed from: X.1u3  reason: invalid class name and case insensitive filesystem */
public final class C43231u3 {
    public static C470121x parseFromJson(C13080hr r7) {
        HashMap hashMap;
        C470121x r2 = new C470121x();
        if (r7.A0g() != C13120hv.START_OBJECT) {
            r7.A0f();
            return null;
        }
        while (true) {
            C13120hv A0p = r7.A0p();
            C13120hv r6 = C13120hv.END_OBJECT;
            if (A0p == r6) {
                return r2;
            }
            String A0i = r7.A0i();
            r7.A0p();
            String str = null;
            if ("reels".equals(A0i)) {
                if (r7.A0g() == C13120hv.START_OBJECT) {
                    hashMap = new HashMap();
                    while (r7.A0p() != r6) {
                        String A0t = r7.A0t();
                        r7.A0p();
                        if (r7.A0g() == C13120hv.VALUE_NULL) {
                            hashMap.put(A0t, (Object) null);
                        } else {
                            C33971dn parseFromJson = C33911dh.parseFromJson(r7);
                            if (parseFromJson != null) {
                                hashMap.put(A0t, parseFromJson);
                            }
                        }
                    }
                } else {
                    hashMap = null;
                }
                r2.A05 = hashMap;
            } else if ("next_ad_request_index".equals(A0i)) {
                r2.A03 = Integer.valueOf(r7.A0I());
            } else if ("viewer_session_id".equals(A0i)) {
                if (r7.A0g() != C13120hv.VALUE_NULL) {
                    str = r7.A0t();
                }
                r2.A04 = str;
            } else if ("ads_pool_threshold_for_next_request".equals(A0i)) {
                r2.A01 = Integer.valueOf(r7.A0I());
            } else if ("earliest_request_position".equals(A0i)) {
                r2.A02 = Integer.valueOf(r7.A0I());
            } else if ("bd".equals(A0i)) {
                r2.A00 = AX2.parseFromJson(r7);
            } else {
                AnonymousClass1N4.A01(r2, A0i, r7);
            }
            r7.A0f();
        }
    }
}
