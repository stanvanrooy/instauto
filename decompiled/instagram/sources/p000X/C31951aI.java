package p000X;

/* renamed from: X.1aI  reason: invalid class name and case insensitive filesystem */
public final class C31951aI {
    public static C31961aJ parseFromJson(C13080hr r3) {
        C31961aJ r2 = new C31961aJ();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("music_asset_info".equals(A0i)) {
                r2.A00 = C44311vw.parseFromJson(r3);
            } else if ("music_consumption_info".equals(A0i)) {
                r2.A01 = C44321vy.parseFromJson(r3);
            }
            r3.A0f();
        }
        return r2;
    }

    public static void A00(C13460iZ r1, C31961aJ r2) {
        r1.A0T();
        if (r2.A00 != null) {
            r1.A0d("music_asset_info");
            C44311vw.A00(r1, r2.A00);
        }
        if (r2.A01 != null) {
            r1.A0d("music_consumption_info");
            C44321vy.A00(r1, r2.A01);
        }
        r1.A0Q();
    }
}
