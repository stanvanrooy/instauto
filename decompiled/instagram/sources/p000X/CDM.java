package p000X;

import java.util.ArrayList;

/* renamed from: X.CDM */
public final class CDM {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static CES parseFromJson(C13080hr r4) {
        CES ces = new CES();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r3 = 0;
            if ("fb_user_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                ces.A09 = r3;
            } else if ("page_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                ces.A0C = r3;
            } else if ("ad_account_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                ces.A07 = r3;
            } else if ("currency".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                ces.A08 = r3;
            } else if ("currency_offset".equals(A0i)) {
                ces.A00 = r4.A0I();
            } else if ("min_daily_budget_with_offset".equals(A0i)) {
                ces.A03 = r4.A0I();
            } else if ("daily_budget_options_with_offset".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        Integer valueOf = Integer.valueOf(r4.A0I());
                        if (valueOf != null) {
                            arrayList.add(valueOf);
                        }
                    }
                    r3 = arrayList;
                }
                ces.A0F = r3;
            } else if ("default_duration_in_days".equals(A0i)) {
                ces.A02 = r4.A0I();
            } else if ("default_daily_budget_with_offset".equals(A0i)) {
                ces.A01 = r4.A0I();
            } else if ("is_political_ads_eligible".equals(A0i)) {
                ces.A0L = r4.A0O();
            } else if ("political_ads_by_line_text".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                ces.A0D = r3;
            } else if ("is_local_awareness_eligible".equals(A0i)) {
                r4.A0O();
            } else if ("linked_igtv_video_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                ces.A0B = r3;
            } else if ("last_promotion_audience_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                ces.A0A = r3;
            } else if ("is_political_ads_name_change_2019_eligible".equals(A0i)) {
                ces.A0M = r4.A0O();
            } else if ("is_story_post".equals(A0i)) {
                ces.A0N = r4.A0O();
            } else if ("is_carousel_post".equals(A0i)) {
                ces.A0G = r4.A0O();
            } else if ("is_iabp".equals(A0i)) {
                ces.A0I = r4.A0O();
            } else if ("should_show_regulated_categories_flow".equals(A0i)) {
                ces.A0H = r4.A0O();
            } else if ("destination".equals(A0i)) {
                ces.A05 = CCN.valueOf(r4.A0r());
            } else if ("call_to_action".equals(A0i)) {
                ces.A04 = CCf.valueOf(r4.A0r());
            } else if ("website_url".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                ces.A0E = r3;
            } else if ("display_url".equals(A0i)) {
                ces.A06 = C13270iF.A00(r4);
            } else if ("is_media_eligible_for_story_placement".equals(A0i)) {
                ces.A0K = r4.A0O();
            } else if ("is_media_eligible_for_explore_placement".equals(A0i)) {
                ces.A0J = r4.A0O();
            }
            r4.A0f();
        }
        return ces;
    }
}
