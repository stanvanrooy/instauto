package p000X;

import java.util.ArrayList;

/* renamed from: X.1sN  reason: invalid class name and case insensitive filesystem */
public final class C42451sN {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static C42311s9 parseFromJson(C13080hr r4) {
        C42311s9 r2 = new C42311s9();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r3 = 0;
            if ("segments".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C201718kD parseFromJson = C201728kE.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                    r3 = arrayList;
                }
                r2.A03 = r3;
            } else if ("segment_upload_jobid".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                r2.A02 = r3;
            } else if ("segment_resumable_render_error_counter".equals(A0i)) {
                r2.A00 = r4.A0I();
            } else if ("avoid_resumable_render".equals(A0i)) {
                r2.A04 = r4.A0O();
            }
            r4.A0f();
        }
        return r2;
    }

    public static void A00(C13460iZ r5, C42311s9 r6) {
        r5.A0T();
        if (r6.A03 != null) {
            r5.A0d("segments");
            r5.A0S();
            for (C201718kD r3 : r6.A03) {
                if (r3 != null) {
                    r5.A0T();
                    String str = r3.A06;
                    if (str != null) {
                        r5.A0H("filepath", str);
                    }
                    r5.A0F("type", r3.A02);
                    r5.A0I("islast", r3.A07);
                    r5.A0F("offset", r3.A00);
                    r5.A0F("index", r3.A01);
                    r5.A0G("filesize", r3.A04);
                    r5.A0G("durationMs", r3.A03);
                    String str2 = r3.A05;
                    if (str2 != null) {
                        r5.A0H("key", str2);
                    }
                    r5.A0Q();
                }
            }
            r5.A0P();
        }
        String str3 = r6.A02;
        if (str3 != null) {
            r5.A0H("segment_upload_jobid", str3);
        }
        r5.A0F("segment_resumable_render_error_counter", r6.A00);
        r5.A0I("avoid_resumable_render", r6.A04);
        r5.A0Q();
    }
}
