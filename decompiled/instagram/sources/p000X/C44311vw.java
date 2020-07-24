package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1vw  reason: invalid class name and case insensitive filesystem */
public final class C44311vw {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static MusicAssetModel parseFromJson(C13080hr r4) {
        MusicAssetModel musicAssetModel = new MusicAssetModel();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r3 = 0;
            if ("audio_asset_id".equals(A0i) || "id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                musicAssetModel.A07 = r3;
            } else if ("audio_cluster_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                musicAssetModel.A04 = r3;
            } else if ("progressive_download_url".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                musicAssetModel.A09 = r3;
            } else if ("dash_manifest".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                musicAssetModel.A05 = r3;
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
                musicAssetModel.A0B = r3;
            } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                musicAssetModel.A0A = r3;
            } else if ("display_artist".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                musicAssetModel.A06 = r3;
            } else if ("cover_artwork_uri".equals(A0i)) {
                musicAssetModel.A01 = C13270iF.A00(r4);
            } else if ("cover_artwork_thumbnail_uri".equals(A0i)) {
                musicAssetModel.A02 = C13270iF.A00(r4);
            } else if ("duration_in_ms".equals(A0i)) {
                musicAssetModel.A00 = r4.A0I();
            } else if ("is_explicit".equals(A0i)) {
                musicAssetModel.A0E = r4.A0O();
            } else if ("has_lyrics".equals(A0i)) {
                musicAssetModel.A0D = r4.A0O();
            } else if ("is_original_sound".equals(A0i)) {
                musicAssetModel.A0F = r4.A0O();
            } else if ("allows_saving".equals(A0i)) {
                musicAssetModel.A0C = r4.A0O();
            } else if ("original_sound_media_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                musicAssetModel.A08 = r3;
            } else if ("alacorn_session_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                musicAssetModel.A03 = r3;
            }
            r4.A0f();
        }
        MusicAssetModel.A02(musicAssetModel);
        return musicAssetModel;
    }

    public static void A00(C13460iZ r2, MusicAssetModel musicAssetModel) {
        r2.A0T();
        String str = musicAssetModel.A07;
        if (str != null) {
            r2.A0H("audio_asset_id", str);
        }
        String str2 = musicAssetModel.A04;
        if (str2 != null) {
            r2.A0H("audio_cluster_id", str2);
        }
        String str3 = musicAssetModel.A09;
        if (str3 != null) {
            r2.A0H("progressive_download_url", str3);
        }
        String str4 = musicAssetModel.A05;
        if (str4 != null) {
            r2.A0H("dash_manifest", str4);
        }
        if (musicAssetModel.A0B != null) {
            r2.A0d("highlight_start_times_in_ms");
            r2.A0S();
            Iterator it = musicAssetModel.A0B.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (num != null) {
                    r2.A0X(num.intValue());
                }
            }
            r2.A0P();
        }
        String str5 = musicAssetModel.A0A;
        if (str5 != null) {
            r2.A0H(DialogModule.KEY_TITLE, str5);
        }
        String str6 = musicAssetModel.A06;
        if (str6 != null) {
            r2.A0H("display_artist", str6);
        }
        if (musicAssetModel.A01 != null) {
            r2.A0d("cover_artwork_uri");
            C13270iF.A01(r2, musicAssetModel.A01);
        }
        if (musicAssetModel.A02 != null) {
            r2.A0d("cover_artwork_thumbnail_uri");
            C13270iF.A01(r2, musicAssetModel.A02);
        }
        r2.A0F("duration_in_ms", musicAssetModel.A00);
        r2.A0I("is_explicit", musicAssetModel.A0E);
        r2.A0I("has_lyrics", musicAssetModel.A0D);
        r2.A0I("is_original_sound", musicAssetModel.A0F);
        r2.A0I("allows_saving", musicAssetModel.A0C);
        String str7 = musicAssetModel.A08;
        if (str7 != null) {
            r2.A0H("original_sound_media_id", str7);
        }
        String str8 = musicAssetModel.A03;
        if (str8 != null) {
            r2.A0H("alacorn_session_id", str8);
        }
        r2.A0Q();
    }
}
