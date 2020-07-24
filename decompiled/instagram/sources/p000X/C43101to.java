package p000X;

import com.instagram.feed.media.EffectConfig;

/* renamed from: X.1to  reason: invalid class name and case insensitive filesystem */
public final class C43101to {
    public static EffectConfig parseFromJson(C13080hr r4) {
        EffectConfig effectConfig = new EffectConfig();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                effectConfig.A03 = str;
            } else if ("name".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                effectConfig.A04 = str;
            } else if ("attribution_user".equals(A0i)) {
                effectConfig.A00 = C34311eU.parseFromJson(r4);
            } else if ("save_status".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                effectConfig.A05 = str;
            } else if ("thumbnail_image".equals(A0i)) {
                effectConfig.A02 = C43071tj.parseFromJson(r4);
            } else if ("effect_action_sheet".equals(A0i)) {
                effectConfig.A01 = C43081tl.parseFromJson(r4);
            }
            r4.A0f();
        }
        return effectConfig;
    }
}
