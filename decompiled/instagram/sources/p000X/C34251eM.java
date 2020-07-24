package p000X;

import java.util.ArrayList;

/* renamed from: X.1eM  reason: invalid class name and case insensitive filesystem */
public final class C34251eM {
    public static void A00(C13460iZ r2, C34261eN r3, boolean z) {
        if (z) {
            r2.A0T();
        }
        String str = r3.A01;
        if (str != null) {
            r2.A0H("poll_id", str);
        }
        String str2 = r3.A02;
        if (str2 != null) {
            r2.A0H("question", str2);
        }
        Integer num = r3.A00;
        if (num != null) {
            r2.A0F("viewer_vote", num.intValue());
        }
        r2.A0I("viewer_can_vote", r3.A07);
        if (r3.A03 != null) {
            r2.A0d("tallies");
            r2.A0S();
            for (C34281eQ r0 : r3.A03) {
                if (r0 != null) {
                    C34271eP.A00(r2, r0);
                }
            }
            r2.A0P();
        }
        if (r3.A04 != null) {
            r2.A0d("promotion_tallies");
            r2.A0S();
            for (C34281eQ r02 : r3.A04) {
                if (r02 != null) {
                    C34271eP.A00(r2, r02);
                }
            }
            r2.A0P();
        }
        r2.A0I("is_shared_result", r3.A06);
        r2.A0I("finished", r3.A05);
        if (z) {
            r2.A0Q();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C34261eN parseFromJson(C13080hr r4) {
        C34261eN r2 = new C34261eN();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r3 = 0;
            if ("poll_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r2.A01 = r3;
            } else if ("question".equals(A0i) || "text".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r2.A02 = r3;
            } else if ("viewer_vote".equals(A0i)) {
                r2.A00 = Integer.valueOf(r4.A0I());
            } else if ("viewer_can_vote".equals(A0i)) {
                r2.A07 = r4.A0O();
            } else if ("tallies".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C34281eQ parseFromJson = C34271eP.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                    r3 = arrayList;
                }
                r2.A03 = r3;
            } else if ("promotion_tallies".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList2 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C34281eQ parseFromJson2 = C34271eP.parseFromJson(r4);
                        if (parseFromJson2 != null) {
                            arrayList2.add(parseFromJson2);
                        }
                    }
                    r3 = arrayList2;
                }
                r2.A04 = r3;
            } else if ("is_shared_result".equals(A0i)) {
                r2.A06 = r4.A0O();
            } else if ("finished".equals(A0i)) {
                r2.A05 = r4.A0O();
            }
            r4.A0f();
        }
        return r2;
    }
}
