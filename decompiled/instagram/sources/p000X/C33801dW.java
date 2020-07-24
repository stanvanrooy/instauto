package p000X;

import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;

/* renamed from: X.1dW  reason: invalid class name and case insensitive filesystem */
public final class C33801dW {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C33811dX parseFromJson(C13080hr r4) {
        C33811dX r3 = new C33811dX();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if (TraceFieldType.StatusCode.equals(A0i)) {
                r3.A00 = r4.A0I();
            } else {
                ? r2 = 0;
                if ("reason_phrase".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r4.A0t();
                    }
                    r3.A01 = r2;
                } else if ("headers".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            C17190pp parseFromJson = C33821dY.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                        r2 = arrayList;
                    }
                    r3.A02 = r2;
                }
            }
            r4.A0f();
        }
        return r3;
    }
}
