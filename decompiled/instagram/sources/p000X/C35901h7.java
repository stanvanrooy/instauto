package p000X;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.1h7  reason: invalid class name and case insensitive filesystem */
public final class C35901h7 {
    public static C35911h8 parseFromJson(C13080hr r7) {
        ArrayList arrayList;
        String A0t;
        HashMap hashMap;
        C35911h8 r3 = new C35911h8();
        if (r7.A0g() != C13120hv.START_OBJECT) {
            r7.A0f();
            return null;
        }
        while (true) {
            C13120hv A0p = r7.A0p();
            C13120hv r6 = C13120hv.END_OBJECT;
            if (A0p != r6) {
                String A0i = r7.A0i();
                r7.A0p();
                if ("timestamps".equals(A0i)) {
                    if (r7.A0g() == C13120hv.START_OBJECT) {
                        hashMap = new HashMap();
                        while (r7.A0p() != r6) {
                            String A0t2 = r7.A0t();
                            r7.A0p();
                            if (r7.A0g() == C13120hv.VALUE_NULL) {
                                hashMap.put(A0t2, (Object) null);
                            } else {
                                Long valueOf = Long.valueOf(r7.A0J());
                                if (valueOf != null) {
                                    hashMap.put(A0t2, valueOf);
                                }
                            }
                        }
                    } else {
                        hashMap = null;
                    }
                    r3.A01 = hashMap;
                } else if ("keys".equals(A0i)) {
                    if (r7.A0g() == C13120hv.START_ARRAY) {
                        arrayList = new ArrayList();
                        while (r7.A0p() != C13120hv.END_ARRAY) {
                            if (r7.A0g() == C13120hv.VALUE_NULL) {
                                A0t = null;
                            } else {
                                A0t = r7.A0t();
                            }
                            if (A0t != null) {
                                arrayList.add(A0t);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    r3.A02 = arrayList;
                }
                r7.A0f();
            } else {
                r3.A03.putAll(r3.A01);
                return r3;
            }
        }
    }
}
