package p000X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.B44 */
public final class B44 {
    public static B45 parseFromJson(C13080hr r4) {
        B45 b45 = new B45();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                b45.A02 = str;
            } else if ("tracking_token".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                b45.A04 = str;
            } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                b45.A03 = str;
            } else if ("about_prompt_text".equals(A0i) || "about_page_url".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r4.A0t();
                }
            } else if ("parameter_picker".equals(A0i)) {
                b45.A00 = B43.parseFromJson(r4);
            }
            r4.A0f();
        }
        return b45;
    }
}
