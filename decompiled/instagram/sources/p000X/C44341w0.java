package p000X;

/* renamed from: X.1w0  reason: invalid class name and case insensitive filesystem */
public final class C44341w0 {
    public static C44351w1 parseFromJson(C13080hr r4) {
        Integer num;
        C44351w1 r1 = new C44351w1();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("pk".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r1.A04 = str;
            } else if ("name".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r1.A05 = str;
            } else if ("profile_pic_url".equals(A0i)) {
                r1.A00 = C13270iF.A00(r4);
            } else if ("profile_pic_username".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r1.A03 = str;
            } else if ("type".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r1.A06 = str;
            } else if ("challenge_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r1.A02 = str;
            }
            r4.A0f();
        }
        String str2 = r1.A06;
        if (str2 != null) {
            if (str2.equalsIgnoreCase("location")) {
                num = Constants.A0C;
            } else if (str2.equalsIgnoreCase(B5B.INTENT_PARAM_TAG)) {
                num = Constants.A0N;
            } else if (str2.equalsIgnoreCase("sticker")) {
                num = Constants.A0Y;
            } else if (str2.equalsIgnoreCase("election")) {
                num = Constants.A0u;
            } else if (str2.equalsIgnoreCase("product")) {
                num = Constants.A12;
            } else if (str2.equalsIgnoreCase("mentions")) {
                num = Constants.A14;
            } else if (str2.equalsIgnoreCase("mentionsv2")) {
                num = Constants.A15;
            } else if (str2.equalsIgnoreCase("top_clips")) {
                num = Constants.A03;
            } else if (str2.equalsIgnoreCase("effects")) {
                num = Constants.A04;
            }
            r1.A01 = num;
            return r1;
        }
        num = Constants.ZERO;
        r1.A01 = num;
        return r1;
    }

    public static void A00(C13460iZ r2, C44351w1 r3) {
        r2.A0T();
        String str = r3.A04;
        if (str != null) {
            r2.A0H("pk", str);
        }
        String str2 = r3.A05;
        if (str2 != null) {
            r2.A0H("name", str2);
        }
        if (r3.A00 != null) {
            r2.A0d("profile_pic_url");
            C13270iF.A01(r2, r3.A00);
        }
        String str3 = r3.A03;
        if (str3 != null) {
            r2.A0H("profile_pic_username", str3);
        }
        String str4 = r3.A06;
        if (str4 != null) {
            r2.A0H("type", str4);
        }
        String str5 = r3.A02;
        if (str5 != null) {
            r2.A0H("challenge_id", str5);
        }
        r2.A0Q();
    }
}
