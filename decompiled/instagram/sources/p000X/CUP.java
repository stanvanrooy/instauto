package p000X;

import java.util.ArrayList;

/* renamed from: X.CUP */
public final class CUP {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static CUU parseFromJson(C13080hr r4) {
        CUU cuu = new CUU();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("catalog_source".equals(A0i)) {
                CUS.A00(r4.A0r());
            } else {
                ? r2 = 0;
                if ("catalogs".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            C27862CUc parseFromJson = CUQ.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                        r2 = arrayList;
                    }
                    cuu.A01 = r2;
                } else if ("more_available".equals(A0i)) {
                    cuu.A02 = r4.A0O();
                } else if ("next_max_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r4.A0t();
                    }
                    cuu.A00 = r2;
                } else {
                    AnonymousClass1N4.A01(cuu, A0i, r4);
                }
            }
            r4.A0f();
        }
        return cuu;
    }
}
