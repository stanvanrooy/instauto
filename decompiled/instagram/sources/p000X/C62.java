package p000X;

/* renamed from: X.C62 */
public final class C62 {
    public static C67 parseFromJson(C13080hr r4) {
        C67 c67 = new C67();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("can_viewer_donate".equals(A0i)) {
                c67.A06 = r4.A0O();
            } else if ("has_viewer_donated".equals(A0i)) {
                c67.A07 = r4.A0O();
            } else {
                String str = null;
                if ("you_donated_message".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    c67.A01 = str;
                } else if ("currency".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    c67.A04 = str;
                } else if ("donation_url".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    c67.A03 = str;
                } else if (AnonymousClass0C5.$const$string(276).equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    c67.A05 = str;
                } else if ("donation_disabled_message".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    c67.A02 = str;
                } else if ("donation_amount_config".equals(A0i)) {
                    c67.A00 = C57952f4.parseFromJson(r4);
                }
            }
            r4.A0f();
        }
        return c67;
    }
}
