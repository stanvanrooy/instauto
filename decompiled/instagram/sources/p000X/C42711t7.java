package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;

/* renamed from: X.1t7  reason: invalid class name and case insensitive filesystem */
public final class C42711t7 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C42721t8 parseFromJson(C13080hr r5) {
        ArrayList arrayList;
        String A0t;
        C42721t8 r2 = new C42721t8();
        if (r5.A0g() != C13120hv.START_OBJECT) {
            r5.A0f();
            return null;
        }
        while (r5.A0p() != C13120hv.END_OBJECT) {
            String A0i = r5.A0i();
            r5.A0p();
            ? r3 = 0;
            if ("id".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r5.A0t();
                }
                r2.A03 = r3;
            } else if ("tracking_token".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r5.A0t();
                }
                r2.A04 = r3;
            } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r5.A0t();
                }
                r2.A01 = r3;
            } else if ("reel_ids".equals(A0i)) {
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
                r2.A05 = arrayList;
            } else if ("filtering_tag".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r5.A0t();
                }
                r2.A02 = r3;
            } else if ("hide_unit_if_seen".equals(A0i)) {
                r2.A07 = r5.A0O();
            } else if ("netego_unit".equals(A0i)) {
                r2.A08 = r5.A0O();
            } else if ("type".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r5.A0t();
                }
            } else if ("reels".equals(A0i)) {
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
                r2.A06 = r3;
            } else if ("client_position".equals(A0i)) {
                r2.A00 = Integer.valueOf(r5.A0I());
            }
            r5.A0f();
        }
        return r2;
    }
}
