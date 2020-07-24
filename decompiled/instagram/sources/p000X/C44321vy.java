package p000X;

/* renamed from: X.1vy  reason: invalid class name and case insensitive filesystem */
public final class C44321vy {
    public static C44331vz parseFromJson(C13080hr r3) {
        String A0t;
        C44331vz r2 = new C44331vz();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("ig_artist".equals(A0i)) {
                r2.A01 = C13300iJ.A00(r3);
            } else if ("placeholder_profile_pic_url".equals(A0i)) {
                r2.A00 = C13270iF.A00(r3);
            } else if ("should_mute_audio".equals(A0i)) {
                r2.A04 = r3.A0O();
            } else if ("should_mute_audio_reason".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                r2.A03 = A0t;
            } else if ("audio_asset_start_time_in_ms".equals(A0i)) {
                r2.A02 = Integer.valueOf(r3.A0I());
            }
            r3.A0f();
        }
        return r2;
    }

    public static void A00(C13460iZ r2, C44331vz r3) {
        r2.A0T();
        if (r3.A01 != null) {
            r2.A0d("ig_artist");
            AnonymousClass1O2.A03(r2, r3.A01);
        }
        if (r3.A00 != null) {
            r2.A0d("placeholder_profile_pic_url");
            C13270iF.A01(r2, r3.A00);
        }
        r2.A0I("should_mute_audio", r3.A04);
        String str = r3.A03;
        if (str != null) {
            r2.A0H("should_mute_audio_reason", str);
        }
        Integer num = r3.A02;
        if (num != null) {
            r2.A0F("audio_asset_start_time_in_ms", num.intValue());
        }
        r2.A0Q();
    }
}
