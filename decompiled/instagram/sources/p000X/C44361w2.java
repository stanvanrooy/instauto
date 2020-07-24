package p000X;

import java.util.ArrayList;

/* renamed from: X.1w2  reason: invalid class name and case insensitive filesystem */
public final class C44361w2 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C35981hF parseFromJson(C13080hr r5) {
        ArrayList arrayList;
        String A0t;
        C35981hF r3 = new C35981hF();
        if (r5.A0g() != C13120hv.START_OBJECT) {
            r5.A0f();
            return null;
        }
        while (r5.A0p() != C13120hv.END_OBJECT) {
            String A0i = r5.A0i();
            r5.A0p();
            ? r4 = 0;
            if ("name".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r4 = r5.A0t();
                }
                r3.A02 = r4;
            } else if ("colors".equals(A0i)) {
                if (r5.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r5.A0p() != C13120hv.END_ARRAY) {
                        if (r5.A0g() == C13120hv.VALUE_NULL) {
                            A0t = null;
                        } else {
                            A0t = r5.A0t();
                        }
                        if (A0t != null) {
                            arrayList.add(A0t);
                        }
                    }
                } else {
                    arrayList = null;
                }
                r3.A03 = arrayList;
            } else if ("locations".equals(A0i)) {
                if (r5.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList2 = new ArrayList();
                    while (r5.A0p() != C13120hv.END_ARRAY) {
                        arrayList2.add(new Float(r5.A0H()));
                    }
                    r4 = arrayList2;
                }
                r3.A04 = r4;
            } else if ("start_point".equals(A0i)) {
                r3.A01 = C44371w3.parseFromJson(r5);
            } else if ("end_point".equals(A0i)) {
                r3.A00 = C44371w3.parseFromJson(r5);
            }
            r5.A0f();
        }
        return r3;
    }

    public static void A00(C13460iZ r3, C35981hF r4) {
        r3.A0T();
        String str = r4.A02;
        if (str != null) {
            r3.A0H("name", str);
        }
        if (r4.A03 != null) {
            r3.A0d("colors");
            r3.A0S();
            for (String str2 : r4.A03) {
                if (str2 != null) {
                    r3.A0g(str2);
                }
            }
            r3.A0P();
        }
        if (r4.A04 != null) {
            r3.A0d("locations");
            r3.A0S();
            for (Float f : r4.A04) {
                if (f != null) {
                    r3.A0W(f.floatValue());
                }
            }
            r3.A0P();
        }
        if (r4.A01 != null) {
            r3.A0d("start_point");
            C36001hH r2 = r4.A01;
            r3.A0T();
            r3.A0E("x", r2.A00);
            r3.A0E("y", r2.A01);
            r3.A0Q();
        }
        if (r4.A00 != null) {
            r3.A0d("end_point");
            C36001hH r22 = r4.A00;
            r3.A0T();
            r3.A0E("x", r22.A00);
            r3.A0E("y", r22.A01);
            r3.A0Q();
        }
        r3.A0Q();
    }
}
