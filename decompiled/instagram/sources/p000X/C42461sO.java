package p000X;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.1sO  reason: invalid class name and case insensitive filesystem */
public final class C42461sO {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C42321sA parseFromJson(C13080hr r4) {
        C42321sA r2 = new C42321sA();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r3 = 0;
            if ("video_frame_List".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        AnonymousClass20L parseFromJson = AnonymousClass20K.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                    r3 = arrayList;
                }
                r2.A04 = r3;
            } else if ("compare_video_path".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r2.A03 = r3;
            } else if ("frame_width".equals(A0i)) {
                r2.A01 = r4.A0I();
            } else if ("frame_height".equals(A0i)) {
                r2.A00 = r4.A0I();
            } else if ("render_block_time_ms".equals(A0i)) {
                r2.A02 = r4.A0J();
            }
            r4.A0f();
        }
        r2.A04 = Collections.unmodifiableList(r2.A04);
        return r2;
    }

    public static void A00(C13460iZ r5, C42321sA r6) {
        r5.A0T();
        if (r6.A04 != null) {
            r5.A0d("video_frame_List");
            r5.A0S();
            for (AnonymousClass20L r3 : r6.A04) {
                if (r3 != null) {
                    r5.A0T();
                    r5.A0G("pts_us", r3.A02);
                    r5.A0F("frame_index", r3.A01);
                    String str = r3.A04;
                    if (str != null) {
                        r5.A0H("image_path", str);
                    }
                    String str2 = r3.A03;
                    if (str2 != null) {
                        r5.A0H("compare_image_path", str2);
                    }
                    r5.A0E("ssim_score", r3.A00);
                    r5.A0Q();
                }
            }
            r5.A0P();
        }
        String str3 = r6.A03;
        if (str3 != null) {
            r5.A0H("compare_video_path", str3);
        }
        r5.A0F("frame_width", r6.A01);
        r5.A0F("frame_height", r6.A00);
        r5.A0G("render_block_time_ms", r6.A02);
        r5.A0Q();
    }
}
