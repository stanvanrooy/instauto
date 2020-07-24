package p000X;

import java.util.ArrayList;

/* renamed from: X.BXW */
public final class BXW {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static BXX parseFromJson(C13080hr r4) {
        BXX bxx = new BXX();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r3 = 0;
            if ("userId".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                bxx.A02 = r3;
            } else if ("promotionId".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                bxx.A01 = r3;
            } else if ("primaryActionTimes".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        Long valueOf = Long.valueOf(r4.A0J());
                        if (valueOf != null) {
                            arrayList.add(valueOf);
                        }
                    }
                    r3 = arrayList;
                }
                bxx.A05 = r3;
            } else if ("secondaryActionTimes".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList2 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        Long valueOf2 = Long.valueOf(r4.A0J());
                        if (valueOf2 != null) {
                            arrayList2.add(valueOf2);
                        }
                    }
                    r3 = arrayList2;
                }
                bxx.A06 = r3;
            } else if ("dismissActionTimes".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList3 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        Long valueOf3 = Long.valueOf(r4.A0J());
                        if (valueOf3 != null) {
                            arrayList3.add(valueOf3);
                        }
                    }
                    r3 = arrayList3;
                }
                bxx.A04 = r3;
            } else if ("impressionTimes".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList4 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        Long valueOf4 = Long.valueOf(r4.A0J());
                        if (valueOf4 != null) {
                            arrayList4.add(valueOf4);
                        }
                    }
                    r3 = arrayList4;
                }
                bxx.A03 = r3;
            } else if ("totalDismissTimes".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList5 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        Long valueOf5 = Long.valueOf(r4.A0J());
                        if (valueOf5 != null) {
                            arrayList5.add(valueOf5);
                        }
                    }
                    r3 = arrayList5;
                }
                bxx.A07 = r3;
            } else if ("endTime".equals(A0i)) {
                bxx.A00 = Long.valueOf(r4.A0J());
            }
            r4.A0f();
        }
        AnonymousClass0a4.A06(bxx.A02);
        AnonymousClass0a4.A06(bxx.A01);
        AnonymousClass0a4.A06(bxx.A00);
        return bxx;
    }

    public static void A00(C13460iZ r3, BXX bxx) {
        r3.A0T();
        String str = bxx.A02;
        if (str != null) {
            r3.A0H("userId", str);
        }
        String str2 = bxx.A01;
        if (str2 != null) {
            r3.A0H("promotionId", str2);
        }
        if (bxx.A05 != null) {
            r3.A0d("primaryActionTimes");
            r3.A0S();
            for (Long l : bxx.A05) {
                if (l != null) {
                    r3.A0Y(l.longValue());
                }
            }
            r3.A0P();
        }
        if (bxx.A06 != null) {
            r3.A0d("secondaryActionTimes");
            r3.A0S();
            for (Long l2 : bxx.A06) {
                if (l2 != null) {
                    r3.A0Y(l2.longValue());
                }
            }
            r3.A0P();
        }
        if (bxx.A04 != null) {
            r3.A0d("dismissActionTimes");
            r3.A0S();
            for (Long l3 : bxx.A04) {
                if (l3 != null) {
                    r3.A0Y(l3.longValue());
                }
            }
            r3.A0P();
        }
        if (bxx.A03 != null) {
            r3.A0d("impressionTimes");
            r3.A0S();
            for (Long l4 : bxx.A03) {
                if (l4 != null) {
                    r3.A0Y(l4.longValue());
                }
            }
            r3.A0P();
        }
        if (bxx.A07 != null) {
            r3.A0d("totalDismissTimes");
            r3.A0S();
            for (Long l5 : bxx.A07) {
                if (l5 != null) {
                    r3.A0Y(l5.longValue());
                }
            }
            r3.A0P();
        }
        Long l6 = bxx.A00;
        if (l6 != null) {
            r3.A0G("endTime", l6.longValue());
        }
        r3.A0Q();
    }
}
