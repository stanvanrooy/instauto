package p000X;

/* renamed from: X.CYM */
public final class CYM {
    public static CYO parseFromJson(C13080hr r4) {
        CYO cyo = new CYO();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("linkType".equals(A0i)) {
                cyo.A00 = r4.A0I();
            } else {
                String str = null;
                if ("app_package".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    cyo.A01 = str;
                } else if ("deeplinkUri".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    cyo.A02 = str;
                } else if ("webUri".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    cyo.A03 = str;
                }
            }
            r4.A0f();
        }
        return cyo;
    }
}
