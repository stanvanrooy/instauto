package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.CJA */
public final class CJA {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static CJC parseFromJson(C13080hr r8) {
        C27581CJa cJa;
        CJC cjc = new CJC();
        if (r8.A0g() != C13120hv.START_OBJECT) {
            r8.A0f();
            return null;
        }
        while (r8.A0p() != C13120hv.END_OBJECT) {
            String A0i = r8.A0i();
            r8.A0p();
            ? r3 = 0;
            if ("context".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                cjc.A0B = r3;
            } else if ("done_button_label".equals(A0i)) {
                cjc.A04 = C25965BdJ.parseFromJson(r8);
            } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                cjc.A07 = C25965BdJ.parseFromJson(r8);
            } else if ("subtitle".equals(A0i)) {
                cjc.A06 = C25965BdJ.parseFromJson(r8);
            } else if ("follow_up_actions".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        AnonymousClass6NM parseFromJson = AnonymousClass6NP.parseFromJson(r8);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                    r3 = arrayList;
                }
                cjc.A0E = r3;
            } else if ("follow_up_actions_title".equals(A0i)) {
                cjc.A05 = C25965BdJ.parseFromJson(r8);
            } else if ("show_confirmation_screen".equals(A0i)) {
                cjc.A0A = Boolean.valueOf(r8.A0O());
            } else if ("policy_education".equals(A0i)) {
                cjc.A08 = C26007Be1.parseFromJson(r8);
            } else if ("report_tags".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList2 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C27586CJf parseFromJson2 = CJB.parseFromJson(r8);
                        if (parseFromJson2 != null) {
                            arrayList2.add(parseFromJson2);
                        }
                    }
                    r3 = arrayList2;
                }
                cjc.A0G = r3;
            } else if ("style".equals(A0i)) {
                int A0I = r8.A0I();
                C27581CJa[] values = C27581CJa.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        cJa = null;
                        break;
                    }
                    cJa = values[i];
                    if (cJa.A00 == A0I) {
                        break;
                    }
                    i++;
                }
                cjc.A09 = cJa;
            } else if ("prompt_button".equals(A0i)) {
                cjc.A00 = C27576CIv.parseFromJson(r8);
            } else if ("tip_number".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                cjc.A0D = r3;
            } else if ("paragraphs".equals(A0i)) {
                if (r8.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList3 = new ArrayList();
                    while (r8.A0p() != C13120hv.END_ARRAY) {
                        C25963BdH parseFromJson3 = C25965BdJ.parseFromJson(r8);
                        if (parseFromJson3 != null) {
                            arrayList3.add(parseFromJson3);
                        }
                    }
                    r3 = arrayList3;
                }
                cjc.A0F = r3;
            } else if ("image_url".equals(A0i)) {
                if (r8.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r8.A0t();
                }
                cjc.A0C = r3;
            } else if ("body".equals(A0i)) {
                cjc.A03 = C25965BdJ.parseFromJson(r8);
            } else if ("primary_button".equals(A0i)) {
                cjc.A01 = C27576CIv.parseFromJson(r8);
            } else if (C193418Ps.$const$string(145).equals(A0i)) {
                cjc.A02 = C27576CIv.parseFromJson(r8);
            }
            r8.A0f();
        }
        if (cjc.A0A == null) {
            AnonymousClass0QD.A01("SubmitFRXReport Response", "'show_confirmation_screen' flag was null");
        }
        if (cjc.A0G == null) {
            cjc.A0G = Collections.emptyList();
        }
        return cjc;
    }
}
