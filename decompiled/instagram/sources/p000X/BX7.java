package p000X;

import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.ArrayList;

/* renamed from: X.BX7 */
public final class BX7 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static BX4 parseFromJson(C13080hr r8) {
        Trigger trigger;
        BX4 bx4 = new BX4();
        if (r8.A0g() != C13120hv.START_OBJECT) {
            r8.A0f();
            return null;
        }
        while (r8.A0p() != C13120hv.END_OBJECT) {
            String A0i = r8.A0i();
            r8.A0p();
            if ("creative".equals(A0i)) {
                bx4.A05 = C49252Bk.parseFromJson(r8);
            } else if ("template".equals(A0i)) {
                bx4.A06 = C49232Bi.parseFromJson(r8);
            } else {
                ? r7 = 0;
                if ("id".equals(A0i)) {
                    if (r8.A0g() != C13120hv.VALUE_NULL) {
                        r7 = r8.A0t();
                    }
                    bx4.A08 = r7;
                } else if (MemoryDumpUploadJob.EXTRA_USER_ID.equals(A0i)) {
                    if (r8.A0g() != C13120hv.VALUE_NULL) {
                        r7 = r8.A0t();
                    }
                    bx4.A0B = r7;
                } else if (AnonymousClass0C5.$const$string(116).equals(A0i)) {
                    if (r8.A0g() != C13120hv.VALUE_NULL) {
                        r7 = r8.A0t();
                    }
                    bx4.A0A = r7;
                } else if ("end_time".equals(A0i)) {
                    bx4.A02 = r8.A0J();
                } else if ("max_impressions".equals(A0i)) {
                    bx4.A00 = r8.A0I();
                } else if ("local_state".equals(A0i)) {
                    bx4.A07 = BXW.parseFromJson(r8);
                } else if ("priority".equals(A0i)) {
                    bx4.A01 = r8.A0I();
                } else if ("surface".equals(A0i)) {
                    bx4.A03 = (QuickPromotionSurface) QuickPromotionSurface.A02.get(Integer.valueOf(r8.A0I()));
                } else if ("triggers".equals(A0i)) {
                    if (r8.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList = new ArrayList();
                        while (r8.A0p() != C13120hv.END_ARRAY) {
                            String A0r = r8.A0r();
                            Trigger[] values = Trigger.values();
                            int length = values.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    trigger = null;
                                    break;
                                }
                                trigger = values[i];
                                if (trigger.A00.equals(A0r)) {
                                    break;
                                }
                                i++;
                            }
                            if (trigger != null) {
                                arrayList.add(trigger);
                            }
                        }
                        r7 = arrayList;
                    }
                    bx4.A0C = r7;
                } else if ("logging_data".equals(A0i)) {
                    if (r8.A0g() != C13120hv.VALUE_NULL) {
                        r7 = r8.A0t();
                    }
                    bx4.A09 = r7;
                } else if ("log_eligibility_waterfall".equals(A0i)) {
                    bx4.A0E = r8.A0O();
                } else if ("contextual_filters".equals(A0i)) {
                    bx4.A04 = C49172Bb.parseFromJson(r8);
                } else if ("is_holdout".equals(A0i)) {
                    bx4.A0D = r8.A0O();
                } else {
                    AnonymousClass1N4.A01(bx4, A0i, r8);
                }
            }
            r8.A0f();
        }
        return bx4;
    }
}
