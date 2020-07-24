package p000X;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.AKF */
public final class AKF {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static AKL parseFromJson(C13080hr r7) {
        HashMap hashMap;
        String A0t;
        AKL akl = new AKL();
        if (r7.A0g() != C13120hv.START_OBJECT) {
            r7.A0f();
            return null;
        }
        while (true) {
            C13120hv A0p = r7.A0p();
            C13120hv r6 = C13120hv.END_OBJECT;
            if (A0p == r6) {
                return akl;
            }
            String A0i = r7.A0i();
            r7.A0p();
            ? r3 = 0;
            if ("supporters_in_comments".equals(A0i)) {
                if (r7.A0g() == C13120hv.START_OBJECT) {
                    hashMap = new HashMap();
                    while (r7.A0p() != r6) {
                        String A0t2 = r7.A0t();
                        r7.A0p();
                        C13120hv A0g = r7.A0g();
                        C13120hv r0 = C13120hv.VALUE_NULL;
                        if (A0g == r0) {
                            hashMap.put(A0t2, (Object) null);
                        } else {
                            if (A0g == r0) {
                                A0t = null;
                            } else {
                                A0t = r7.A0t();
                            }
                            if (A0t != null) {
                                hashMap.put(A0t2, A0t);
                            }
                        }
                    }
                } else {
                    hashMap = null;
                }
                C13150hy.A02(hashMap, "<set-?>");
                akl.A01 = hashMap;
            } else if ("new_supporters".equals(A0i)) {
                if (r7.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r7.A0p() != C13120hv.END_ARRAY) {
                        AJX parseFromJson = AJY.parseFromJson(r7);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                    r3 = arrayList;
                }
                akl.A02 = r3;
            } else if ("new_supporters_next_min_id".equals(A0i)) {
                if (r7.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r7.A0t();
                }
                akl.A00 = r3;
            }
            r7.A0f();
        }
    }
}
