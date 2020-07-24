package p000X;

import java.util.HashMap;

/* renamed from: X.AM1 */
public final class AM1 {
    public static AM2 parseFromJson(C13080hr r7) {
        HashMap hashMap;
        AM2 am2 = new AM2();
        if (r7.A0g() != C13120hv.START_OBJECT) {
            r7.A0f();
            return null;
        }
        while (true) {
            C13120hv A0p = r7.A0p();
            C13120hv r6 = C13120hv.END_OBJECT;
            if (A0p == r6) {
                return am2;
            }
            String A0i = r7.A0i();
            r7.A0p();
            if ("starting_offset".equals(A0i)) {
                am2.A02 = r7.A0I();
            } else if ("ending_offset".equals(A0i)) {
                am2.A00 = r7.A0I();
            } else if ("next_fetch_offset".equals(A0i)) {
                am2.A01 = r7.A0I();
            } else if ("time_series".equals(A0i)) {
                if (r7.A0g() == C13120hv.START_OBJECT) {
                    hashMap = new HashMap();
                    while (r7.A0p() != r6) {
                        String A0t = r7.A0t();
                        r7.A0p();
                        if (r7.A0g() == C13120hv.VALUE_NULL) {
                            hashMap.put(A0t, (Object) null);
                        } else {
                            AMA parseFromJson = AM5.parseFromJson(r7);
                            if (parseFromJson != null) {
                                hashMap.put(A0t, parseFromJson);
                            }
                        }
                    }
                } else {
                    hashMap = null;
                }
                am2.A03 = hashMap;
            } else {
                AnonymousClass1N4.A01(am2, A0i, r7);
            }
            r7.A0f();
        }
    }
}
