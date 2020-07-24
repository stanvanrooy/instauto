package p000X;

import java.util.ArrayList;

/* renamed from: X.CXX */
public final class CXX {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C27954CXq parseFromJson(C13080hr r4) {
        C27954CXq cXq = new C27954CXq();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r2 = 0;
            if ("color".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                cXq.A02 = r2;
            } else if ("logging_token".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                cXq.A03 = r2;
            } else if ("document_element_type".equals(A0i)) {
                C91.A00(r4.A0r());
            } else if ("element_descriptor".equals(A0i)) {
                cXq.A00 = CY5.parseFromJson(r4);
            } else if ("element_text".equals(A0i)) {
                cXq.A01 = C25979BdY.parseFromJson(r4);
            } else if ("style_list".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        arrayList.add(CYA.A00(r4.A0r()));
                    }
                    r2 = arrayList;
                }
                cXq.A05 = r2;
            } else if ("android_links".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList2 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        CYO parseFromJson = CYM.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList2.add(parseFromJson);
                        }
                    }
                    r2 = arrayList2;
                }
                cXq.A04 = r2;
            }
            r4.A0f();
        }
        return cXq;
    }
}
