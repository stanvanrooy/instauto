package p000X;

import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.common.util.gradient.TextModeGradientColors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0Nf  reason: invalid class name and case insensitive filesystem */
public final class C05980Nf {
    public static BackgroundGradientColors A00(TextModeGradientColors textModeGradientColors) {
        if (textModeGradientColors == null) {
            return null;
        }
        ArrayList arrayList = textModeGradientColors.A01;
        return new BackgroundGradientColors(((Integer) arrayList.get(0)).intValue(), ((Integer) arrayList.get(arrayList.size() - 1)).intValue());
    }

    public static TextModeGradientColors A01(BackgroundGradientColors backgroundGradientColors, int i) {
        if (backgroundGradientColors == null) {
            return null;
        }
        int i2 = 1;
        List asList = Arrays.asList(new Integer[]{Integer.valueOf(backgroundGradientColors.A01), Integer.valueOf(backgroundGradientColors.A00)});
        if (i % 180 == 0) {
            i2 = 0;
        }
        return new TextModeGradientColors(asList, i2);
    }
}
