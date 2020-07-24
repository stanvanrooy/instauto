package p000X;

/* renamed from: X.CYJ */
public final class CYJ {
    public static CYN parseFromJson(C13080hr r4) {
        CYN cyn = new CYN();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("max_lines".equals(A0i)) {
                cyn.A00 = r4.A0I();
            } else {
                String str = null;
                if ("capitalization_style".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    cyn.A01 = str;
                } else if ("font_family".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    cyn.A02 = str;
                } else if ("font_size".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    cyn.A03 = str;
                } else if ("line_height".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    cyn.A04 = str;
                } else if ("text_color".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    cyn.A05 = str;
                } else if ("word_kerning".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    cyn.A06 = str;
                }
            }
            r4.A0f();
        }
        return cyn;
    }
}
