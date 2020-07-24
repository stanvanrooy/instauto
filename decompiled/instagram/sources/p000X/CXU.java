package p000X;

import java.util.ArrayList;

/* renamed from: X.CXU */
public final class CXU {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C27962CXy parseFromJson(C13080hr r4) {
        C27962CXy cXy = new C27962CXy();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("has_audio".equals(A0i)) {
                cXy.A03 = r4.A0O();
            } else if (AnonymousClass0C5.$const$string(389).equals(A0i)) {
                r4.A0I();
            } else {
                ? r2 = 0;
                if ("id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r4.A0t();
                    }
                    cXy.A01 = r2;
                } else if ("image_versions2".equals(A0i)) {
                    cXy.A00 = CYK.parseFromJson(r4);
                } else if ("video_versions".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            CY2 parseFromJson = CXT.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                        r2 = arrayList;
                    }
                    cXy.A02 = r2;
                }
            }
            r4.A0f();
        }
        return cXy;
    }
}
