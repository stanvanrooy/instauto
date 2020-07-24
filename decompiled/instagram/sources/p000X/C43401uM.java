package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1uM  reason: invalid class name and case insensitive filesystem */
public final class C43401uM {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v20, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v22, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v24, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v30 */
    /* JADX WARNING: type inference failed for: r2v31 */
    /* JADX WARNING: type inference failed for: r2v32 */
    /* JADX WARNING: type inference failed for: r2v33 */
    /* JADX WARNING: type inference failed for: r2v34 */
    /* JADX WARNING: type inference failed for: r2v35 */
    /* JADX WARNING: type inference failed for: r2v36 */
    /* JADX WARNING: type inference failed for: r2v37 */
    /* JADX WARNING: type inference failed for: r2v38 */
    /* JADX WARNING: type inference failed for: r2v39 */
    /* JADX WARNING: type inference failed for: r2v40 */
    /* JADX WARNING: type inference failed for: r2v41 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x031e A[LOOP:8: B:182:0x031e->B:184:0x0326, LOOP_START, PHI: r5 
      PHI: (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:181:0x031c, B:184:0x0326] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x033c  */
    public static C43411uN parseFromJson(C13080hr r5) {
        int i;
        C49592Cv r3;
        C43411uN r4 = new C43411uN();
        if (r5.A0g() != C13120hv.START_OBJECT) {
            r5.A0f();
            return null;
        }
        while (r5.A0p() != C13120hv.END_OBJECT) {
            String A0i = r5.A0i();
            r5.A0p();
            ? r2 = 0;
            if ("id".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r5.A0t();
                }
                r4.A07 = r2;
            } else if ("type".equals(A0i)) {
                r4.A00 = r5.A0I();
            } else if ("tracking_token".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r5.A0t();
                }
                r4.A0E = r2;
            } else if ("suggestions".equals(A0i)) {
                if (r5.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r5.A0p() != C13120hv.END_ARRAY) {
                        C43451uR parseFromJson = C43441uQ.parseFromJson(r5);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                    r2 = arrayList;
                }
                r4.A0G = r2;
            } else if ("suggestion_cards".equals(A0i)) {
                if (r5.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList2 = new ArrayList();
                    while (r5.A0p() != C13120hv.END_ARRAY) {
                        C43431uP parseFromJson2 = C43421uO.parseFromJson(r5);
                        if (parseFromJson2 != null) {
                            arrayList2.add(parseFromJson2);
                        }
                    }
                    r2 = arrayList2;
                }
                r4.A0H = r2;
            } else if ("suggestions_with_media".equals(A0i)) {
                if (r5.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList3 = new ArrayList();
                    while (r5.A0p() != C13120hv.END_ARRAY) {
                        C28487Chi parseFromJson3 = C51882Mm.parseFromJson(r5);
                        if (parseFromJson3 != null) {
                            arrayList3.add(parseFromJson3);
                        }
                    }
                    r2 = arrayList3;
                }
                r4.A0F = r2;
            } else if ("is_dismissable".equals(A0i)) {
                r4.A0K = r5.A0O();
            } else if ("is_unit_dismissable".equals(A0i)) {
                r4.A0L = r5.A0O();
            } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r5.A0t();
                }
                r4.A0D = r2;
            } else if ("subtitle".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r5.A0t();
                }
                r4.A0C = r2;
            } else if ("view_all_text".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r5.A0t();
                }
                r4.A06 = r2;
            } else if ("show_bottom_cta".equals(A0i)) {
                r4.A0M = r5.A0O();
            } else if ("show_disco_sp_card".equals(A0i)) {
                r4.A0N = r5.A0O();
            } else if ("landing_site_type".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r5.A0t();
                }
                r4.A0A = r2;
            } else if ("landing_site_title".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r5.A0t();
                }
                r4.A09 = r2;
            } else if ("upsell_fb_pos".equals(A0i)) {
                r4.A05 = Integer.valueOf(r5.A0I());
            } else if ("insertion_context".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r5.A0t();
                }
                r4.A08 = r2;
            } else if ("ranking_algorithm".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r5.A0t();
                }
                r4.A0B = r2;
            } else if ("layout".equals(A0i)) {
                r4.A01 = C49592Cv.A00(r5);
            } else if ("style".equals(A0i)) {
                String A0r = r5.A0r();
                C43481uU r1 = C43481uU.NO_CONTENT_THUMBNAIL;
                if (!r1.A00.equals(A0r)) {
                    r1 = C43481uU.WITH_CONTENT_THUMBNAIL;
                    if (!r1.A00.equals(A0r)) {
                        r1 = C43481uU.EMBEDDED_WITH_CONTENT_THUMBNAIL;
                        if (!r1.A00.equals(A0r)) {
                            r1 = null;
                        }
                    }
                }
                r4.A04 = r1;
            } else if ("netego_type".equals(A0i)) {
                r4.A02 = (C29261Pf) C29261Pf.A01.get(r5.A0r());
            }
            r5.A0f();
        }
        List list = r4.A0G;
        if (list != null && !list.isEmpty()) {
            Iterator it = r4.A0G.iterator();
            while (it.hasNext()) {
                if (((C43451uR) it.next()).A02 == null) {
                    it.remove();
                }
            }
        }
        List list2 = r4.A0H;
        if (list2 != null && !list2.isEmpty()) {
            Iterator it2 = r4.A0H.iterator();
            while (it2.hasNext()) {
                C43451uR r0 = ((C43431uP) it2.next()).A06;
                if (r0 != null && r0.A02 == null) {
                    it2.remove();
                }
            }
        }
        Integer num = r4.A05;
        if (num == null || r4.A0H != null) {
            i = -1;
        } else {
            if (num.intValue() > r4.A0G.size()) {
                i = r4.A0G.size();
            }
            if (r4.A02 == null) {
                AnonymousClass0QD.A01("Parsing SuggestedUsers", "Invalid/missing netego_type string");
                r4.A02 = C29261Pf.SUGGESTED_USERS;
            }
            if (r4.A04 == null) {
                r4.A04 = C43481uU.NO_CONTENT_THUMBNAIL;
            }
            if (r4.A0H == null) {
                for (int i2 = 0; i2 < r4.A0H.size(); i2++) {
                    if (((C43431uP) r4.A0H.get(i2)).A05 == C43471uT.SUGGESTED_USER) {
                        r4.A0J.put((C43451uR) ((C43431uP) r4.A0H.get(i2)).A04, Integer.valueOf(i2));
                    }
                }
            } else if (r4.A0G != null) {
                for (int i3 = 0; i3 < r4.A0G.size(); i3++) {
                    r4.A0J.put(r4.A0G.get(i3), Integer.valueOf(i3));
                }
            }
            if (r4.A0F != null) {
                for (int i4 = 0; i4 < r4.A0F.size(); i4++) {
                    r4.A0I.put(r4.A0F.get(i4), Integer.valueOf(i4));
                }
            }
            r3 = r4.A01;
            if (r3 != null) {
                r4.A03 = new C49752Dl(r4.A07, r4.A0E, r3);
            }
            return r4;
        }
        r4.A05 = Integer.valueOf(i);
        if (r4.A02 == null) {
        }
        if (r4.A04 == null) {
        }
        if (r4.A0H == null) {
        }
        if (r4.A0F != null) {
        }
        r3 = r4.A01;
        if (r3 != null) {
        }
        return r4;
    }
}
