package p000X;

/* renamed from: X.DXB */
public final class DXB {
    public static DXM parseFromJson(C13080hr r4) {
        DXM dxm = new DXM();
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
                dxm.A03 = str;
            } else if ("instagram_media_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dxm.A04 = str;
            } else if ("display_url".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dxm.A02 = str;
            } else if ("instagram_media_type".equals(A0i)) {
                dxm.A01 = C27366CAl.A00(r4.A0r());
            } else if ("inline_insights_node".equals(A0i)) {
                dxm.A00 = DXD.parseFromJson(r4);
            }
            r4.A0f();
        }
        return dxm;
    }
}
