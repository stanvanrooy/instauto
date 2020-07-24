package p000X;

import com.instagram.common.util.gradient.BackgroundGradientColors;

/* renamed from: X.0Nk  reason: invalid class name and case insensitive filesystem */
public final class C06020Nk {
    public static BackgroundGradientColors parseFromJson(C13080hr r3) {
        BackgroundGradientColors backgroundGradientColors = new BackgroundGradientColors();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("top_color".equals(A0i)) {
                backgroundGradientColors.A01 = r3.A0I();
            } else if ("bottom_color".equals(A0i)) {
                backgroundGradientColors.A00 = r3.A0I();
            }
            r3.A0f();
        }
        return backgroundGradientColors;
    }

    public static void A00(C13460iZ r2, BackgroundGradientColors backgroundGradientColors) {
        r2.A0T();
        r2.A0F("top_color", backgroundGradientColors.A01);
        r2.A0F("bottom_color", backgroundGradientColors.A00);
        r2.A0Q();
    }
}
