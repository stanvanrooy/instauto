package p000X;

/* renamed from: X.DXA */
public final class DXA {
    public static DXL parseFromJson(C13080hr r4) {
        DXL dxl = new DXL();
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
                dxl.A03 = str;
            } else if ("instagram_media_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dxl.A04 = str;
            } else if ("instagram_media_type".equals(A0i)) {
                dxl.A02 = C27366CAl.A00(r4.A0r());
            } else if ("image".equals(A0i)) {
                dxl.A00 = DXC.parseFromJson(r4);
            } else if ("inline_insights_node".equals(A0i)) {
                dxl.A01 = DXE.parseFromJson(r4);
            }
            r4.A0f();
        }
        return dxl;
    }
}
