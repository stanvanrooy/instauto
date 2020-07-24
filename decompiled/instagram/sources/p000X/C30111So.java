package p000X;

import java.util.ArrayList;

/* renamed from: X.1So  reason: invalid class name and case insensitive filesystem */
public final class C30111So {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C30141Sr parseFromJson(C13080hr r5) {
        ArrayList arrayList;
        String A0t;
        C30141Sr r2 = new C30141Sr();
        if (r5.A0g() != C13120hv.START_OBJECT) {
            r5.A0f();
            return null;
        }
        while (r5.A0p() != C13120hv.END_OBJECT) {
            String A0i = r5.A0i();
            r5.A0p();
            ? r4 = 0;
            if ("label".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r4 = r5.A0t();
                }
                r2.A07 = r4;
            } else if ("contextual_label_info".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r4 = r5.A0t();
                }
                r2.A06 = r4;
            } else if ("show_page_name_in_headline".equals(A0i)) {
                r2.A0H = r5.A0O();
            } else if ("display_fb_page_name".equals(A0i)) {
                r2.A0C = r5.A0O();
            } else if ("hide_reasons_v2".equals(A0i)) {
                if (r5.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList2 = new ArrayList();
                    while (r5.A0p() != C13120hv.END_ARRAY) {
                        AnonymousClass1TC parseFromJson = AnonymousClass1TA.parseFromJson(r5);
                        if (parseFromJson != null) {
                            arrayList2.add(parseFromJson);
                        }
                    }
                    r4 = arrayList2;
                }
                r2.A0A = r4;
            } else if ("is_demo".equals(A0i)) {
                r2.A0I = r5.A0O();
            } else if ("is_holdout".equals(A0i)) {
                r2.A0J = r5.A0O();
            } else if ("display_viewability_eligible".equals(A0i)) {
                r2.A0E = r5.A0O();
            } else if ("tracking_token".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r4 = r5.A0t();
                }
                r2.A08 = r4;
            } else if ("show_ad_choices".equals(A0i)) {
                r2.A0G = r5.A0O();
            } else if ("ad_title".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r4 = r5.A0t();
                }
                r2.A05 = r4;
            } else if ("cookies".equals(A0i)) {
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
                r2.A09 = arrayList;
            } else if ("direct_share".equals(A0i)) {
                r2.A0B = r5.A0O();
            } else if ("ad_id".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r4 = r5.A0t();
                }
                r2.A04 = r4;
            } else if ("political_context".equals(A0i)) {
                r2.A01 = AnonymousClass2L1.parseFromJson(r5);
            } else if ("ad_disclaimer_info".equals(A0i)) {
                r2.A03 = C488629u.parseFromJson(r5);
            } else if ("is_autotranslated".equals(A0i)) {
                r2.A0D = r5.A0O();
            } else if ("cta_style".equals(A0i)) {
                C30161St r0 = (C30161St) C30161St.A01.get(r5.A0I());
                if (r0 == null) {
                    r0 = C30161St.UNKNOWN;
                }
                r2.A02 = r0;
            } else if ("ctmessaging_ads_info".equals(A0i)) {
                r2.A00 = C468721f.parseFromJson(r5);
            } else if ("should_show_secondary_cta_on_profile".equals(A0i)) {
                r2.A0F = r5.A0O();
            }
            r5.A0f();
        }
        return r2;
    }
}
