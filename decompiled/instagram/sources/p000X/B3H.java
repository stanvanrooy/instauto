package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;

/* renamed from: X.B3H */
public final class B3H {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static B3I parseFromJson(C13080hr r4) {
        Integer num;
        B3I b3i = new B3I();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r3 = 0;
            if (DialogModule.KEY_TITLE.equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                b3i.A03 = r3;
            } else if ("qid".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                b3i.A02 = r3;
            } else if ("type".equals(A0i)) {
                String A0r = r4.A0r();
                if ("single".equals(A0r)) {
                    num = Constants.ZERO;
                } else if ("multiple".equals(A0r)) {
                    num = Constants.ONE;
                } else {
                    throw new UnsupportedOperationException();
                }
                b3i.A01 = num;
            } else if ("total_responders".equals(A0i)) {
                b3i.A00 = r4.A0I();
            } else if ("answers".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        B3K parseFromJson = B3J.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                    r3 = arrayList;
                }
                b3i.A04 = r3;
            }
            r4.A0f();
        }
        return b3i;
    }
}
