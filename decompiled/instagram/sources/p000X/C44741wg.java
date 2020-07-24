package p000X;

/* renamed from: X.1wg  reason: invalid class name and case insensitive filesystem */
public final class C44741wg {
    public static void A00(C13460iZ r2, C44751wh r3, boolean z) {
        if (z) {
            r2.A0T();
        }
        r2.A0I("viewer_can_interact", r3.A08);
        String str = r3.A02;
        if (str != null) {
            r2.A0H("background_color", str);
        }
        String str2 = r3.A04;
        if (str2 != null) {
            r2.A0H("question_id", str2);
        }
        String str3 = r3.A05;
        if (str3 != null) {
            r2.A0H("media_id", str3);
        }
        if (r3.A00 != null) {
            r2.A0d("profile_pic_url");
            C13270iF.A01(r2, r3.A00);
        }
        C44761wi r0 = r3.A01;
        if (r0 != null) {
            r2.A0H("question_type", r0.A00);
        }
        String str4 = r3.A06;
        if (str4 != null) {
            r2.A0H("question", str4);
        }
        String str5 = r3.A07;
        if (str5 != null) {
            r2.A0H("text_color", str5);
        }
        if (z) {
            r2.A0Q();
        }
    }

    public static C44751wh parseFromJson(C13080hr r4) {
        C44751wh r2 = new C44751wh();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("viewer_can_interact".equals(A0i)) {
                r2.A08 = r4.A0O();
            } else {
                String str = null;
                if ("background_color".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    r2.A02 = str;
                } else if ("question_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    r2.A04 = str;
                } else if ("media_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    r2.A05 = str;
                } else if ("profile_pic_url".equals(A0i)) {
                    r2.A00 = C13270iF.A00(r4);
                } else if ("question_type".equals(A0i)) {
                    r2.A01 = C44761wi.A00(r4.A0r());
                } else if ("question".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    r2.A06 = str;
                } else if ("text_color".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    r2.A07 = str;
                }
            }
            r4.A0f();
        }
        return r2;
    }
}
