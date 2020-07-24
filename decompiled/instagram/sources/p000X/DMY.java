package p000X;

import java.util.ArrayList;

/* renamed from: X.DMY */
public final class DMY {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C30015DMr parseFromJson(C13080hr r4) {
        C30015DMr dMr = new C30015DMr();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("do_base_hashes_match".equals(A0i)) {
                dMr.A03 = r4.A0O();
            } else {
                ? r2 = 0;
                if ("server_contact_hashes".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            DN8 parseFromJson = DMg.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                        r2 = arrayList;
                    }
                    dMr.A02 = r2;
                } else if ("session_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r4.A0t();
                    }
                    dMr.A01 = r2;
                } else if ("setting".equals(A0i)) {
                    dMr.A00 = C30002DMd.parseFromJson(r4);
                } else {
                    AnonymousClass1N4.A01(dMr, A0i, r4);
                }
            }
            r4.A0f();
        }
        return dMr;
    }
}
