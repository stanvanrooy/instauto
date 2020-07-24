package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;

/* renamed from: X.CJB */
public final class CJB {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C27586CJf parseFromJson(C13080hr r4) {
        C27586CJf cJf = new C27586CJf();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r3 = 0;
            if ("tag_type".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                cJf.A03 = r3;
            } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                cJf.A01 = C25965BdJ.parseFromJson(r4);
            } else if ("subtitle".equals(A0i)) {
                cJf.A00 = C25965BdJ.parseFromJson(r4);
            } else if ("subtags".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C27586CJf parseFromJson = parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                    r3 = arrayList;
                }
                cJf.A04 = r3;
            } else if ("show_auto_report".equals(A0i)) {
                cJf.A02 = Boolean.valueOf(r4.A0O());
            }
            r4.A0f();
        }
        return cJf;
    }
}
