package p000X;

/* renamed from: X.DVM */
public final class DVM {
    public static DVL parseFromJson(C13080hr r4) {
        DVL dvl = new DVL();
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
                dvl.A04 = str;
            } else if ("instagram_media_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dvl.A05 = str;
            } else if ("instagram_media_owner_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r4.A0t();
                }
            } else if ("instagram_media_type".equals(A0i)) {
                dvl.A03 = C27366CAl.A00(r4.A0r());
            } else if ("image".equals(A0i)) {
                dvl.A00 = DVO.parseFromJson(r4);
            } else if ("inline_insights_node".equals(A0i)) {
                dvl.A01 = DVN.parseFromJson(r4);
            } else if ("instagram_media_owner_profile_image".equals(A0i)) {
                dvl.A02 = DVP.parseFromJson(r4);
            }
            r4.A0f();
        }
        return dvl;
    }
}
