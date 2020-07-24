package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1eu  reason: invalid class name and case insensitive filesystem */
public final class C34541eu {
    public static void A00(C13460iZ r2, C34561ew r3, boolean z) {
        if (z) {
            r2.A0T();
        }
        Integer num = r3.A07;
        if (num != null) {
            r2.A0F("audio_asset_start_time_in_ms", num.intValue());
        }
        Integer num2 = r3.A08;
        if (num2 != null) {
            r2.A0F("audio_asset_suggested_start_time_in_ms", num2.intValue());
        }
        Integer num3 = r3.A09;
        if (num3 != null) {
            r2.A0F("derived_content_start_time_in_ms", num3.intValue());
        }
        Integer num4 = r3.A0A;
        if (num4 != null) {
            r2.A0F("overlap_duration_in_ms", num4.intValue());
        }
        String str = r3.A0D;
        if (str != null) {
            r2.A0H("browse_session_id", str);
        }
        String str2 = r3.A0B;
        if (str2 != null) {
            r2.A0H("alacorn_session_id", str2);
        }
        C34571ex r0 = r3.A04;
        if (r0 != null) {
            r2.A0H("music_product", r0.A00);
        }
        String str3 = r3.A0J;
        if (str3 != null) {
            r2.A0H("audio_asset_id", str3);
        }
        String str4 = r3.A0C;
        if (str4 != null) {
            r2.A0H("audio_cluster_id", str4);
        }
        String str5 = r3.A0K;
        if (str5 != null) {
            r2.A0H("progressive_download_url", str5);
        }
        r2.A0F("duration_in_ms", r3.A00);
        String str6 = r3.A0E;
        if (str6 != null) {
            r2.A0H("dash_manifest", str6);
        }
        if (r3.A0L != null) {
            r2.A0d("highlight_start_times_in_ms");
            r2.A0S();
            Iterator it = r3.A0L.iterator();
            while (it.hasNext()) {
                Integer num5 = (Integer) it.next();
                if (num5 != null) {
                    r2.A0X(num5.intValue());
                }
            }
            r2.A0P();
        }
        String str7 = r3.A0I;
        if (str7 != null) {
            r2.A0H(DialogModule.KEY_TITLE, str7);
        }
        String str8 = r3.A0F;
        if (str8 != null) {
            r2.A0H("display_artist", str8);
        }
        if (r3.A01 != null) {
            r2.A0d("cover_artwork_uri");
            C13270iF.A01(r2, r3.A01);
        }
        if (r3.A02 != null) {
            r2.A0d("cover_artwork_thumbnail_uri");
            C13270iF.A01(r2, r3.A02);
        }
        r2.A0I("is_explicit", r3.A0O);
        r2.A0I("has_lyrics", r3.A0N);
        r2.A0I("is_original_sound", r3.A0P);
        r2.A0I("allows_saving", r3.A0M);
        String str9 = r3.A0G;
        if (str9 != null) {
            r2.A0H("original_media_id", str9);
        }
        r2.A0I("hide_remixing", r3.A0Q);
        if (r3.A06 != null) {
            r2.A0d("ig_artist");
            AnonymousClass1O2.A03(r2, r3.A06);
        }
        if (r3.A03 != null) {
            r2.A0d("placeholder_profile_pic_url");
            C13270iF.A01(r2, r3.A03);
        }
        r2.A0I("should_mute_audio", r3.A0R);
        String str10 = r3.A0H;
        if (str10 != null) {
            r2.A0H("should_mute_audio_reason", str10);
        }
        if (z) {
            r2.A0Q();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: type inference failed for: r3v31 */
    /* JADX WARNING: type inference failed for: r3v32 */
    /* JADX WARNING: type inference failed for: r3v33 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C34561ew parseFromJson(C13080hr r4) {
        C34571ex r0;
        C34561ew r2 = new C34561ew();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("audio_asset_start_time_in_ms".equals(A0i)) {
                r2.A07 = Integer.valueOf(r4.A0I());
            } else if ("audio_asset_suggested_start_time_in_ms".equals(A0i)) {
                r2.A08 = Integer.valueOf(r4.A0I());
            } else if ("derived_content_start_time_in_ms".equals(A0i)) {
                r2.A09 = Integer.valueOf(r4.A0I());
            } else if ("overlap_duration_in_ms".equals(A0i)) {
                r2.A0A = Integer.valueOf(r4.A0I());
            } else {
                ? r3 = 0;
                if ("browse_session_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    r2.A0D = r3;
                } else if ("alacorn_session_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    r2.A0B = r3;
                } else if ("music_product".equals(A0i)) {
                    String A0r = r4.A0r();
                    if (C34571ex.A01.containsKey(A0r)) {
                        r0 = (C34571ex) C34571ex.A01.get(A0r);
                    } else {
                        r0 = C34571ex.UNSET;
                    }
                    r2.A04 = r0;
                } else if ("audio_asset_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    r2.A0J = r3;
                } else if ("audio_cluster_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    r2.A0C = r3;
                } else if ("progressive_download_url".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    r2.A0K = r3;
                } else if ("duration_in_ms".equals(A0i)) {
                    r2.A00 = r4.A0I();
                } else if ("dash_manifest".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    r2.A0E = r3;
                } else if ("highlight_start_times_in_ms".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            Integer valueOf = Integer.valueOf(r4.A0I());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                        r3 = arrayList;
                    }
                    r2.A0L = r3;
                } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    r2.A0I = r3;
                } else if ("display_artist".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    r2.A0F = r3;
                } else if ("cover_artwork_uri".equals(A0i)) {
                    r2.A01 = C13270iF.A00(r4);
                } else if ("cover_artwork_thumbnail_uri".equals(A0i)) {
                    r2.A02 = C13270iF.A00(r4);
                } else if ("is_explicit".equals(A0i)) {
                    r2.A0O = r4.A0O();
                } else if ("has_lyrics".equals(A0i)) {
                    r2.A0N = r4.A0O();
                } else if ("is_original_sound".equals(A0i)) {
                    r2.A0P = r4.A0O();
                } else if ("allows_saving".equals(A0i)) {
                    r2.A0M = r4.A0O();
                } else if ("original_media_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    r2.A0G = r3;
                } else if ("hide_remixing".equals(A0i)) {
                    r2.A0Q = r4.A0O();
                } else if ("ig_artist".equals(A0i)) {
                    r2.A06 = C13300iJ.A00(r4);
                } else if ("placeholder_profile_pic_url".equals(A0i)) {
                    r2.A03 = C13270iF.A00(r4);
                } else if ("should_mute_audio".equals(A0i)) {
                    r2.A0R = r4.A0O();
                } else if ("should_mute_audio_reason".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r3 = r4.A0t();
                    }
                    r2.A0H = r3;
                }
            }
            r4.A0f();
        }
        C34561ew.A01(r2);
        return r2;
    }
}
