package p000X;

import java.util.ArrayList;

/* renamed from: X.CXV */
public final class CXV {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static CXZ parseFromJson(C13080hr r4) {
        Integer num;
        Integer num2;
        CXZ cxz = new CXZ();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r2 = 0;
            if ("__typename".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r4.A0t();
                }
            } else if ("grid_width_percent".equals(A0i)) {
                cxz.A00 = r4.A0I();
            } else if ("color".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                cxz.A08 = r2;
            } else if ("logging_token".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                cxz.A09 = r2;
            } else if ("autoplay_style".equals(A0i)) {
                String A0r = r4.A0r();
                if (A0r != null && !A0r.isEmpty()) {
                    if (A0r.equalsIgnoreCase("AUTOPLAY")) {
                        num2 = Constants.ONE;
                    } else if (A0r.equalsIgnoreCase("NO_AUTOPLAY")) {
                        num2 = Constants.A0C;
                    }
                    cxz.A05 = num2;
                }
                num2 = Constants.ZERO;
                cxz.A05 = num2;
            } else if ("document_element_type".equals(A0i)) {
                cxz.A06 = C91.A00(r4.A0r());
            } else if ("looping_style".equals(A0i)) {
                String A0r2 = r4.A0r();
                if (A0r2 != null && !A0r2.isEmpty()) {
                    if (A0r2.equalsIgnoreCase("NO_LOOPING")) {
                        num = Constants.ONE;
                    } else if (A0r2.equalsIgnoreCase("LOOPING")) {
                        num = Constants.A0C;
                    } else if (A0r2.equalsIgnoreCase("LOOPING_WITH_CROSS_FADE")) {
                        num = Constants.A0N;
                    }
                    cxz.A07 = num;
                }
                num = Constants.ZERO;
                cxz.A07 = num;
            } else if ("image_versions2".equals(A0i)) {
                cxz.A01 = CYK.parseFromJson(r4);
            } else if ("element_video".equals(A0i)) {
                cxz.A02 = CXU.parseFromJson(r4);
            } else if ("element_descriptor".equals(A0i)) {
                cxz.A03 = CY5.parseFromJson(r4);
            } else if ("element_text".equals(A0i)) {
                cxz.A04 = C25979BdY.parseFromJson(r4);
            } else if ("style_list".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        arrayList.add(CYA.A00(r4.A0r()));
                    }
                    r2 = arrayList;
                }
                cxz.A0F = r2;
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
                cxz.A0A = r2;
            } else if ("footer_elements".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList3 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C27954CXq parseFromJson2 = CXX.parseFromJson(r4);
                        if (parseFromJson2 != null) {
                            arrayList3.add(parseFromJson2);
                        }
                    }
                    r2 = arrayList3;
                }
                cxz.A0C = r2;
            } else if ("child_elements".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList4 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C27953CXp parseFromJson3 = CXY.parseFromJson(r4);
                        if (parseFromJson3 != null) {
                            arrayList4.add(parseFromJson3);
                        }
                    }
                    r2 = arrayList4;
                }
                cxz.A0B = r2;
            } else if ("header_elements".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList5 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C27953CXp parseFromJson4 = CXY.parseFromJson(r4);
                        if (parseFromJson4 != null) {
                            arrayList5.add(parseFromJson4);
                        }
                    }
                    r2 = arrayList5;
                }
                cxz.A0D = r2;
            } else if ("product_child_elements".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList6 = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C27946CXi parseFromJson5 = CXW.parseFromJson(r4);
                        if (parseFromJson5 != null) {
                            arrayList6.add(parseFromJson5);
                        }
                    }
                    r2 = arrayList6;
                }
                cxz.A0E = r2;
            }
            r4.A0f();
        }
        return cxz;
    }
}
