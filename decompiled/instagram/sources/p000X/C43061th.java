package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.feed.media.EffectPreview;

/* renamed from: X.1th  reason: invalid class name and case insensitive filesystem */
public final class C43061th {
    public static EffectPreview parseFromJson(C13080hr r4) {
        EffectPreview effectPreview = new EffectPreview();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("effect_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                effectPreview.A04 = str;
            } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                effectPreview.A06 = str;
            } else if ("name".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                effectPreview.A05 = str;
            } else if ("icon_url".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                effectPreview.A07 = str;
            } else if ("video_thumbnail_url".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                effectPreview.A09 = str;
            } else if ("attribution_user".equals(A0i)) {
                effectPreview.A00 = C34311eU.parseFromJson(r4);
            } else if ("save_status".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                effectPreview.A08 = str;
            } else if ("effect_action_sheet".equals(A0i)) {
                effectPreview.A01 = C43081tl.parseFromJson(r4);
            } else if ("thumbnail_image".equals(A0i)) {
                effectPreview.A02 = C43071tj.parseFromJson(r4);
            } else if ("device_position".equals(A0i)) {
                effectPreview.A03 = C43091tn.A00(r4.A0r());
            }
            r4.A0f();
        }
        return effectPreview;
    }

    public static void A00(C13460iZ r2, EffectPreview effectPreview) {
        r2.A0T();
        String str = effectPreview.A04;
        if (str != null) {
            r2.A0H("effect_id", str);
        }
        String str2 = effectPreview.A06;
        if (str2 != null) {
            r2.A0H(DialogModule.KEY_TITLE, str2);
        }
        String str3 = effectPreview.A05;
        if (str3 != null) {
            r2.A0H("name", str3);
        }
        String str4 = effectPreview.A07;
        if (str4 != null) {
            r2.A0H("icon_url", str4);
        }
        String str5 = effectPreview.A09;
        if (str5 != null) {
            r2.A0H("video_thumbnail_url", str5);
        }
        if (effectPreview.A00 != null) {
            r2.A0d("attribution_user");
            C34311eU.A00(r2, effectPreview.A00);
        }
        String str6 = effectPreview.A08;
        if (str6 != null) {
            r2.A0H("save_status", str6);
        }
        if (effectPreview.A01 != null) {
            r2.A0d("effect_action_sheet");
            C43081tl.A00(r2, effectPreview.A01);
        }
        if (effectPreview.A02 != null) {
            r2.A0d("thumbnail_image");
            C43071tj.A00(r2, effectPreview.A02);
        }
        C43091tn r0 = effectPreview.A03;
        if (r0 != null) {
            r2.A0H("device_position", r0.toString());
        }
        r2.A0Q();
    }
}
