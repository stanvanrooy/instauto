package p000X;

import java.util.ArrayList;

/* renamed from: X.DGl */
public final class DGl {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C29928DHe parseFromJson(C13080hr r4) {
        C29928DHe dHe = new C29928DHe();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r2 = 0;
            if ("selected_email_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r4.A0t();
                }
                dHe.A00 = r2;
            } else if ("available_emails".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C29929DHf parseFromJson = DH8.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                    r2 = arrayList;
                }
                dHe.A01 = r2;
            }
            r4.A0f();
        }
        return dHe;
    }
}
