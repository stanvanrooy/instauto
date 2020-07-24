package p000X;

/* renamed from: X.1aK  reason: invalid class name and case insensitive filesystem */
public final class C31971aK {
    public static C31981aL parseFromJson(C13080hr r4) {
        C31981aL r3 = new C31981aL();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("audio_asset_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r3.A03 = str;
            } else if ("original_media_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r3.A05 = str;
            } else if ("ig_artist".equals(A0i)) {
                r3.A02 = C13300iJ.A00(r4);
            } else if ("progressive_download_url".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r3.A06 = str;
            } else if ("dash_manifest".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r3.A04 = str;
            } else if ("duration_in_ms".equals(A0i)) {
                r3.A00 = r4.A0I();
            } else if ("hide_remixing".equals(A0i)) {
                r3.A08 = r4.A0O();
            } else if ("should_mute_audio".equals(A0i)) {
                r3.A09 = r4.A0O();
            } else if ("should_mute_audio_reason".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                r3.A07 = str;
            }
            r4.A0f();
        }
        String str2 = r3.A06;
        if (str2 == null && r3.A04 == null) {
            AnonymousClass0QD.A02("ClipsOriginalSoundModel", String.format("Progressive Download Url and Dash Manifest cannot both be null for original audio asset id: %s", new Object[]{r3.A03}));
            return r3;
        }
        r3.A01 = new C32011aO(str2, r3.A04);
        return r3;
    }

    public static void A00(C13460iZ r2, C31981aL r3) {
        r2.A0T();
        String str = r3.A03;
        if (str != null) {
            r2.A0H("audio_asset_id", str);
        }
        String str2 = r3.A05;
        if (str2 != null) {
            r2.A0H("original_media_id", str2);
        }
        if (r3.A02 != null) {
            r2.A0d("ig_artist");
            AnonymousClass1O2.A03(r2, r3.A02);
        }
        String str3 = r3.A06;
        if (str3 != null) {
            r2.A0H("progressive_download_url", str3);
        }
        String str4 = r3.A04;
        if (str4 != null) {
            r2.A0H("dash_manifest", str4);
        }
        r2.A0F("duration_in_ms", r3.A00);
        r2.A0I("hide_remixing", r3.A08);
        r2.A0I("should_mute_audio", r3.A09);
        String str5 = r3.A07;
        if (str5 != null) {
            r2.A0H("should_mute_audio_reason", str5);
        }
        r2.A0Q();
    }
}
