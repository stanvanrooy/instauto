package p000X;

/* renamed from: X.DVI */
public final class DVI {
    public static DVU parseFromJson(C13080hr r4) {
        DVU dvu = new DVU();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("reach_count".equals(A0i)) {
                dvu.A00 = r4.A0I();
            } else {
                String str = null;
                if ("id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dvu.A04 = str;
                } else if ("instagram_media_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dvu.A05 = str;
                } else if ("instagram_media_owner_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r4.A0t();
                    }
                } else if ("instagram_media_type".equals(A0i)) {
                    dvu.A03 = C27366CAl.A00(r4.A0r());
                } else if ("image".equals(A0i)) {
                    dvu.A01 = DVJ.parseFromJson(r4);
                } else if ("instagram_media_owner_profile_image".equals(A0i)) {
                    dvu.A02 = DVK.parseFromJson(r4);
                }
            }
            r4.A0f();
        }
        return dvu;
    }
}
