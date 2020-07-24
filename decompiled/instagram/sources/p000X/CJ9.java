package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;

/* renamed from: X.CJ9 */
public final class CJ9 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C27585CJe parseFromJson(C13080hr r4) {
        C27585CJe cJe = new C27585CJe();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r3 = 0;
            if ("context".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                cJe.A04 = r3;
            } else if ("enabled".equals(A0i)) {
                cJe.A03 = Boolean.valueOf(r4.A0O());
            } else if ("report_tags".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C27586CJf parseFromJson = CJB.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                    r3 = arrayList;
                }
                cJe.A05 = r3;
            } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                cJe.A02 = C25965BdJ.parseFromJson(r4);
            } else if ("subtitle".equals(A0i)) {
                cJe.A01 = C25965BdJ.parseFromJson(r4);
            } else if ("footer".equals(A0i)) {
                cJe.A00 = C25965BdJ.parseFromJson(r4);
            }
            r4.A0f();
        }
        if (cJe.A03 == null) {
            cJe.A03 = false;
            AnonymousClass0QD.A01("StartFRXReport Response", "'enabled' flag was null");
        }
        return cJe;
    }
}
