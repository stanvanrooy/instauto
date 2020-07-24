package p000X;

import java.util.ArrayList;

/* renamed from: X.1m0  reason: invalid class name and case insensitive filesystem */
public final class C38881m0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C38891m1 parseFromJson(C13080hr r4) {
        C38891m1 r3 = new C38891m1();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r2 = 0;
            if ("id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                r3.A04 = r2;
            } else {
                if (!"design".equals(A0i)) {
                    if ("type".equals(A0i)) {
                        if (r4.A0g() != C13120hv.VALUE_NULL) {
                            r2 = r4.A0t();
                        }
                        r3.A06 = r2;
                    } else if ("items".equals(A0i)) {
                        if (r4.A0g() == C13120hv.START_ARRAY) {
                            ArrayList arrayList = new ArrayList();
                            while (r4.A0p() != C13120hv.END_ARRAY) {
                                C38911m3 parseFromJson = C38901m2.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                            r2 = arrayList;
                        }
                        r3.A07 = r2;
                    } else if (!B5B.INTENT_PARAM_TAG.equals(A0i)) {
                        if ("max_id".equals(A0i)) {
                            if (r4.A0g() != C13120hv.VALUE_NULL) {
                                r2 = r4.A0t();
                            }
                            r3.A05 = r2;
                        } else if ("more_available".equals(A0i)) {
                            r3.A08 = r4.A0O();
                        }
                    }
                }
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r4.A0t();
                }
            }
            r4.A0f();
        }
        C39361mn r0 = (C39361mn) C39361mn.A01.get(r3.A06);
        if (r0 == null) {
            r0 = C39361mn.MINOR;
        }
        r3.A03 = r0;
        r3.A01 = new C39381mp(r3.A05, r3.A08);
        return r3;
    }
}
