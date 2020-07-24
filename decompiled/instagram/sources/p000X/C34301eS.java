package p000X;

import com.instagram.feed.media.CreativeConfig;
import com.instagram.feed.media.EffectConfig;
import java.util.ArrayList;

/* renamed from: X.1eS  reason: invalid class name and case insensitive filesystem */
public final class C34301eS {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static CreativeConfig parseFromJson(C13080hr r4) {
        CreativeConfig creativeConfig = new CreativeConfig();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ? r3 = 0;
            if ("capture_type".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                creativeConfig.A03 = r3;
            } else if ("effect_product".equals(A0i)) {
                creativeConfig.A02 = AnonymousClass2O8.parseFromJson(r4);
            } else if ("face_effect_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                creativeConfig.A04 = r3;
            } else if ("persisted_effect_metadata_json".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                creativeConfig.A05 = r3;
            } else if ("failure_reason".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r3 = r4.A0t();
                }
                creativeConfig.A06 = r3;
            } else if ("effect_preview".equals(A0i)) {
                creativeConfig.A01 = C43061th.parseFromJson(r4);
            } else if ("attribution_user".equals(A0i)) {
                creativeConfig.A00 = C34311eU.parseFromJson(r4);
            } else if ("effect_configs".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        EffectConfig parseFromJson = C43101to.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                    r3 = arrayList;
                }
                creativeConfig.A07 = r3;
            }
            r4.A0f();
        }
        return creativeConfig;
    }
}
