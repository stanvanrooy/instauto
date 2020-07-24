package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;

/* renamed from: X.CUO */
public final class CUO {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static CUR parseFromJson(C13080hr r4) {
        CUR cur = new CUR();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("catalog_source".equals(A0i)) {
                cur.A01 = CUS.A00(r4.A0r());
            } else {
                ? r3 = 0;
                if (DialogModule.KEY_TITLE.equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    cur.A03 = r3;
                } else if ("catalogs".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            C27862CUc parseFromJson = CUQ.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                        r3 = arrayList;
                    }
                    cur.A04 = r3;
                } else if ("more_available".equals(A0i)) {
                    cur.A05 = r4.A0O();
                } else if ("next_max_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    cur.A02 = r3;
                }
            }
            r4.A0f();
        }
        return cur;
    }
}
