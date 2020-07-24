package p000X;

import java.util.ArrayList;

/* renamed from: X.0zJ  reason: invalid class name and case insensitive filesystem */
public final class C22960zJ {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C33901dg parseFromJson(C13080hr r5) {
        ArrayList arrayList;
        String A0t;
        C33901dg r2 = new C33901dg();
        if (r5.A0g() != C13120hv.START_OBJECT) {
            r5.A0f();
            return null;
        }
        while (r5.A0p() != C13120hv.END_OBJECT) {
            String A0i = r5.A0i();
            r5.A0p();
            ? r3 = 0;
            if ("tray".equals(A0i)) {
                if (r5.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList2 = new ArrayList();
                    while (r5.A0p() != C13120hv.END_ARRAY) {
                        C33971dn parseFromJson = C33911dh.parseFromJson(r5);
                        if (parseFromJson != null) {
                            arrayList2.add(parseFromJson);
                        }
                    }
                    r3 = arrayList2;
                }
                r2.A08 = r3;
            } else if ("remaining_reel_ids_to_fetch".equals(A0i)) {
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
                r2.A07 = arrayList;
            } else if ("suggested_highlights".equals(A0i)) {
                r2.A04 = C52942Qv.parseFromJson(r5);
            } else if ("broadcasts".equals(A0i)) {
                if (r5.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList3 = new ArrayList();
                    while (r5.A0p() != C13120hv.END_ARRAY) {
                        C38031kc parseFromJson2 = C38021kb.parseFromJson(r5);
                        if (parseFromJson2 != null) {
                            arrayList3.add(parseFromJson2);
                        }
                    }
                    r3 = arrayList3;
                }
                r2.A06 = r3;
            } else if ("story_ranking_token".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r5.A0t();
                }
                r2.A05 = r3;
            } else if ("post_live".equals(A0i)) {
                r2.A03 = AnonymousClass26E.parseFromJson(r5);
            } else if ("has_new_nux_story".equals(A0i)) {
                r5.A0O();
            } else if ("show_empty_state".equals(A0i)) {
                r2.A09 = r5.A0O();
            } else if ("stories_viewer_gestures_nux_eligible".equals(A0i)) {
                r2.A0A = r5.A0O();
            } else if ("tv_channel".equals(A0i)) {
                r2.A02 = C50302Ft.parseFromJson(r5);
            } else if ("refresh_window_ms".equals(A0i)) {
                r2.A01 = r5.A0J();
            } else {
                AnonymousClass1N4.A01(r2, A0i, r5);
            }
            r5.A0f();
        }
        return r2;
    }
}
