package p000X;

import com.instagram.pendingmedia.model.ClipInfo;
import java.util.ArrayList;

/* renamed from: X.1zx  reason: invalid class name and case insensitive filesystem */
public final class C46561zx {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static ClipInfo parseFromJson(C13080hr r5) {
        ClipInfo clipInfo = new ClipInfo();
        if (r5.A0g() != C13120hv.START_OBJECT) {
            r5.A0f();
            return null;
        }
        while (r5.A0p() != C13120hv.END_OBJECT) {
            String A0i = r5.A0i();
            r5.A0p();
            ? r3 = 0;
            if ("clipFilePath".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r5.A0t();
                }
                clipInfo.A0F = r3;
            } else if ("clipFileSize".equals(A0i)) {
                clipInfo.A0C = r5.A0J();
            } else if ("camera_id".equals(A0i)) {
                clipInfo.A05 = r5.A0I();
            } else if ("pan".equals(A0i)) {
                clipInfo.A04 = (float) r5.A0H();
            } else if ("rotation".equals(A0i)) {
                clipInfo.A0D = Integer.valueOf(r5.A0I());
            } else if ("aspectPostCrop".equals(A0i)) {
                clipInfo.A02 = (float) r5.A0H();
            } else if ("startMS".equals(A0i)) {
                clipInfo.A08 = r5.A0I();
            } else if ("endMS".equals(A0i)) {
                clipInfo.A06 = r5.A0I();
            } else if ("isTrimmed".equals(A0i)) {
                clipInfo.A0I = r5.A0O();
            } else if ("trimScroll".equals(A0i)) {
                clipInfo.A09 = r5.A0I();
            } else if ("videoWidth".equals(A0i)) {
                clipInfo.A0A = r5.A0I();
            } else if ("videoHeight".equals(A0i)) {
                clipInfo.A07 = r5.A0I();
            } else if ("software".equals(A0i)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r5.A0t();
                }
                clipInfo.A0E = r3;
            } else if ("crop_rect".equals(A0i)) {
                if (r5.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r5.A0p() != C13120hv.END_ARRAY) {
                        Integer valueOf = Integer.valueOf(r5.A0I());
                        if (valueOf != null) {
                            arrayList.add(valueOf);
                        }
                    }
                    r3 = arrayList;
                }
                clipInfo.A0G = r3;
            } else if ("h_flip".equals(A0i)) {
                clipInfo.A0H = r5.A0O();
            } else if ("exif_latitude".equals(A0i)) {
                clipInfo.A00 = r5.A0H();
            } else if ("exif_longitude".equals(A0i)) {
                clipInfo.A01 = r5.A0H();
            } else if ("is_boomerang".equals(A0i)) {
                clipInfo.A0J = r5.A0O();
            } else if ("original_duration_ms".equals(A0i)) {
                clipInfo.A0B = r5.A0J();
            }
            r5.A0f();
        }
        clipInfo.A02(clipInfo.A0A, clipInfo.A07);
        return clipInfo;
    }

    public static void A00(C13460iZ r3, ClipInfo clipInfo) {
        r3.A0T();
        String str = clipInfo.A0F;
        if (str != null) {
            r3.A0H("clipFilePath", str);
        }
        r3.A0G("clipFileSize", clipInfo.A0C);
        r3.A0F("camera_id", clipInfo.A05);
        r3.A0E("pan", clipInfo.A04);
        Integer num = clipInfo.A0D;
        if (num != null) {
            r3.A0F("rotation", num.intValue());
        }
        r3.A0E("aspectPostCrop", clipInfo.A02);
        r3.A0F("startMS", clipInfo.A08);
        r3.A0F("endMS", clipInfo.A06);
        r3.A0I("isTrimmed", clipInfo.A0I);
        r3.A0F("trimScroll", clipInfo.A09);
        r3.A0F("videoWidth", clipInfo.A0A);
        r3.A0F("videoHeight", clipInfo.A07);
        String str2 = clipInfo.A0E;
        if (str2 != null) {
            r3.A0H("software", str2);
        }
        if (clipInfo.A0G != null) {
            r3.A0d("crop_rect");
            r3.A0S();
            for (Integer num2 : clipInfo.A0G) {
                if (num2 != null) {
                    r3.A0X(num2.intValue());
                }
            }
            r3.A0P();
        }
        r3.A0I("h_flip", clipInfo.A0H);
        r3.A0D("exif_latitude", clipInfo.A00);
        r3.A0D("exif_longitude", clipInfo.A01);
        r3.A0I("is_boomerang", clipInfo.A0J);
        r3.A0G("original_duration_ms", clipInfo.A0B);
        r3.A0Q();
    }
}
