package p000X;

/* renamed from: X.DZE */
public final class DZE {
    public static DZD parseFromJson(C13080hr r3) {
        DZD dzd = new DZD();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("reach_count".equals(A0i)) {
                dzd.A00 = r3.A0I();
            } else if ("attributed_follows".equals(A0i)) {
                dzd.A01 = DZF.parseFromJson(r3);
            } else if ("attributed_profile_visits".equals(A0i)) {
                dzd.A02 = DZH.parseFromJson(r3);
            } else if ("impressions".equals(A0i)) {
                dzd.A03 = DZJ.parseFromJson(r3);
            } else if ("profile_actions".equals(A0i)) {
                dzd.A04 = DZY.parseFromJson(r3);
            } else if ("share_count".equals(A0i)) {
                dzd.A05 = DZL.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dzd;
    }
}
