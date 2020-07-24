package p000X;

/* renamed from: X.DZ8 */
public final class DZ8 {
    public static DZA parseFromJson(C13080hr r4) {
        DZA dza = new DZA();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("comment_count".equals(A0i)) {
                dza.A00 = r4.A0I();
            } else if ("engagement".equals(A0i)) {
                dza.A01 = r4.A0I();
            } else if ("like_count".equals(A0i)) {
                dza.A02 = r4.A0I();
            } else if ("save_count".equals(A0i)) {
                dza.A03 = r4.A0I();
            } else if ("shopping_outbound_click_count".equals(A0i)) {
                dza.A04 = r4.A0I();
            } else if ("shopping_product_click_count".equals(A0i)) {
                dza.A05 = r4.A0I();
            } else if ("video_view_count".equals(A0i)) {
                dza.A06 = r4.A0I();
            } else if ("creation_time".equals(A0i)) {
                r4.A0J();
            } else {
                String str = null;
                if ("id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dza.A0B = str;
                } else if ("instagram_media_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dza.A0C = str;
                } else if ("instagram_media_owner_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r4.A0t();
                    }
                } else if ("instagram_media_type".equals(A0i)) {
                    dza.A0A = C27366CAl.A00(r4.A0r());
                } else if ("image".equals(A0i)) {
                    dza.A07 = DZB.parseFromJson(r4);
                } else if ("instagram_media_owner_profile_image".equals(A0i)) {
                    dza.A08 = DZC.parseFromJson(r4);
                } else if ("inline_insights_node".equals(A0i)) {
                    dza.A09 = DZ9.parseFromJson(r4);
                }
            }
            r4.A0f();
        }
        return dza;
    }
}
