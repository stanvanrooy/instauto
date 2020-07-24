package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;

/* renamed from: X.CY0 */
public final class CY0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C27963CXz parseFromJson(C13080hr r5) {
        CY1 cy1;
        ArrayList arrayList;
        String A0t;
        C27963CXz cXz = new C27963CXz();
        if (r5.A0g() != C13120hv.START_OBJECT) {
            r5.A0f();
            return null;
        }
        while (r5.A0p() != C13120hv.END_OBJECT) {
            String A0i = r5.A0i();
            r5.A0p();
            if ("show_see_more_chrome".equals(A0i)) {
                r5.A0O();
            } else {
                ? r1 = 0;
                if ("background_color".equals(A0i)) {
                    if (r5.A0g() != C13120hv.VALUE_NULL) {
                        r1 = r5.A0t();
                    }
                    cXz.A02 = r1;
                } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                    if (r5.A0g() != C13120hv.VALUE_NULL) {
                        r5.A0t();
                    }
                } else if ("analytics".equals(A0i)) {
                    cXz.A00 = CXC.parseFromJson(r5);
                } else if ("document_body_elements".equals(A0i)) {
                    cXz.A01 = C27941CXd.parseFromJson(r5);
                } else if ("third_party_logging_urls".equals(A0i)) {
                    if (r5.A0g() == C13120hv.START_ARRAY) {
                        arrayList = new ArrayList();
                        while (r5.A0p() != C13120hv.END_ARRAY) {
                            if (r5.A0g() == C13120hv.VALUE_NULL) {
                                A0t = null;
                            } else {
                                A0t = r5.A0t();
                            }
                            if (A0t != null) {
                                arrayList.add(A0t);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    cXz.A04 = arrayList;
                } else if ("style_list".equals(A0i)) {
                    if (r5.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList2 = new ArrayList();
                        while (r5.A0p() != C13120hv.END_ARRAY) {
                            String A0r = r5.A0r();
                            if (A0r != null && !A0r.isEmpty()) {
                                if (A0r.equalsIgnoreCase("AUDIO_CONTROL_FLOATING")) {
                                    cy1 = CY1.AUDIO_CONTROL_FLOATING;
                                } else if (A0r.equalsIgnoreCase("AUDIO_MUTED")) {
                                    cy1 = CY1.AUDIO_MUTED;
                                } else if (A0r.equalsIgnoreCase("ENABLE_SWIPE_TO_OPEN")) {
                                    cy1 = CY1.ENABLE_SWIPE_TO_OPEN;
                                } else if (A0r.equalsIgnoreCase("PREFETCH_SWIPE_TO_OPEN_WEBVIEW")) {
                                    cy1 = CY1.PREFETCH_SWIPE_TO_OPEN_WEBVIEW;
                                } else if (A0r.equalsIgnoreCase("NO_AUDIO_MODE")) {
                                    cy1 = CY1.NO_AUDIO_MODE;
                                } else if (A0r.equalsIgnoreCase("BACK_BUTTON_FILL_STYLE")) {
                                    cy1 = CY1.BACK_BUTTON_FILL_STYLE;
                                } else if (A0r.equalsIgnoreCase("MINISHOP_THEME")) {
                                    cy1 = CY1.MINISHOP_THEME;
                                } else if (A0r.equalsIgnoreCase("MINISHOP_YOUR_ITEMS")) {
                                    cy1 = CY1.MINISHOP_YOUR_ITEMS;
                                } else if (A0r.equalsIgnoreCase("MINISHOP_RECENTLY_VIDEWED_SEE_ALL")) {
                                    cy1 = CY1.MINISHOP_RECENTLY_VIDEWED_SEE_ALL;
                                }
                                arrayList2.add(cy1);
                            }
                            cy1 = CY1.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                            arrayList2.add(cy1);
                        }
                        r1 = arrayList2;
                    }
                    cXz.A03 = r1;
                }
            }
            r5.A0f();
        }
        return cXz;
    }
}
