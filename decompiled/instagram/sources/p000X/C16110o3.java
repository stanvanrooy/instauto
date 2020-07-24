package p000X;

import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;

/* renamed from: X.0o3  reason: invalid class name and case insensitive filesystem */
public final class C16110o3 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C28661Mp parseFromJson(C13080hr r4) {
        C28661Mp r2 = new C28661Mp();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("multiple_question_survey".equals(A0i)) {
                r2.A01 = B3F.parseFromJson(r4);
            } else if ("megaphone".equals(A0i)) {
                r2.A05 = C27977CYn.parseFromJson(r4);
            } else if ("preload_distance".equals(A0i)) {
                r2.A06 = Integer.valueOf(r4.A0I());
            } else {
                ? r3 = 0;
                if ("feed_items".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            AnonymousClass1NG A00 = AnonymousClass1NG.A00(r4);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                        r3 = arrayList;
                    }
                    r2.A0A = r3;
                } else if ("client_gap_enforcer_matrix".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList2 = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            C32041aR parseFromJson = C32031aQ.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                        r3 = arrayList2;
                    }
                    r2.A0B = r3;
                } else if ("pagination_source".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    r2.A07 = r3;
                } else if ("session_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    r2.A09 = r3;
                } else if (TraceFieldType.RequestID.equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    r2.A08 = r3;
                } else if ("suggested_users".equals(A0i)) {
                    r2.A02 = C43401uM.parseFromJson(r4);
                } else if ("startup_prefetch_configs".equals(A0i)) {
                    r2.A04 = C32051aT.parseFromJson(r4);
                } else if ("pull_to_refresh_window_ms".equals(A0i)) {
                    r2.A00 = r4.A0J();
                } else {
                    AnonymousClass1N2.A00(r2, A0i, r4);
                }
            }
            r4.A0f();
        }
        r2.A02();
        return r2;
    }
}
