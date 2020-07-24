package p000X;

/* renamed from: X.21c  reason: invalid class name and case insensitive filesystem */
public final class C468421c {
    public static C468521d parseFromJson(C13080hr r4) {
        C468521d r2 = new C468521d();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("contact_bar".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r2.A01 = str;
            } else if ("setting_toggle".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r2.A02 = str;
            } else if ("setting_toggle_description".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r2.A03 = str;
            } else if ("stories_config_cta_title".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r2.A04 = str;
            } else if ("stories_config_cta_title_type".equals(A0i)) {
                r2.A00 = r4.A0I();
            }
            r4.A0f();
        }
        return r2;
    }

    public static void A00(C13460iZ r2, C468521d r3) {
        r2.A0T();
        String str = r3.A01;
        if (str != null) {
            r2.A0H("contact_bar", str);
        }
        String str2 = r3.A02;
        if (str2 != null) {
            r2.A0H("setting_toggle", str2);
        }
        String str3 = r3.A03;
        if (str3 != null) {
            r2.A0H("setting_toggle_description", str3);
        }
        String str4 = r3.A04;
        if (str4 != null) {
            r2.A0H("stories_config_cta_title", str4);
        }
        r2.A0F("stories_config_cta_title_type", r3.A00);
        r2.A0Q();
    }
}
