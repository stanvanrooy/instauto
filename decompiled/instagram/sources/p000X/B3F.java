package p000X;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.B3F */
public final class B3F {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static B3G parseFromJson(C13080hr r4) {
        Integer num;
        B3G b3g = new B3G();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r3 = 0;
            if ("survey_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                b3g.A01 = r3;
            } else if (AnonymousClass0C5.$const$string(292).equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r4.A0t();
                }
            } else if ("tracking_token".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                b3g.A03 = r3;
            } else if ("primer_message".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                b3g.A02 = r3;
            } else if ("questions".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        B3I parseFromJson = B3H.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                    r3 = arrayList;
                }
                b3g.A04 = r3;
            } else if (AnonymousClass0C5.$const$string(255).equals(A0i)) {
                r4.A0O();
            } else if ("show_results".equals(A0i)) {
                b3g.A05 = r4.A0O();
            }
            r4.A0f();
        }
        if (TextUtils.isEmpty(b3g.A03)) {
            num = Constants.ZERO;
        } else {
            num = Constants.ONE;
        }
        b3g.A00 = num;
        return b3g;
    }
}
