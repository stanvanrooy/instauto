package p000X;

import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.ArrayList;

/* renamed from: X.1ku  reason: invalid class name and case insensitive filesystem */
public final class C38211ku {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C38801ls parseFromJson(C13080hr r4) {
        C38801ls r2 = new C38801ls();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("more_available".equals(A0i)) {
                r2.A07 = r4.A0O();
            } else if ("auto_load_more_enabled".equals(A0i)) {
                r2.A06 = r4.A0O();
            } else {
                ? r3 = 0;
                if ("clusters".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            ExploreTopicCluster parseFromJson = C40171oC.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                        r3 = arrayList;
                    }
                    r2.A05 = r3;
                } else if ("sectional_items".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList2 = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            C38831lv parseFromJson2 = C38821lu.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                        r3 = arrayList2;
                    }
                    r2.A04 = r3;
                } else if ("next_max_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    r2.A03 = r3;
                } else if ("grid_pagination_token".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    r2.A02 = r3;
                } else if ("refinements".equals(A0i)) {
                    r2.A01 = C217109Xw.parseFromJson(r4);
                } else {
                    AnonymousClass1N4.A01(r2, A0i, r4);
                }
            }
            r4.A0f();
        }
        return r2;
    }
}
