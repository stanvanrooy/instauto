package p000X;

import android.content.res.Resources;
import com.facebook.C0003R;

/* renamed from: X.20g  reason: invalid class name and case insensitive filesystem */
public final class C466320g {
    public static boolean A00;

    public static String A02(String str) {
        String str2 = str.split("_")[0];
        if (str2.contains(".")) {
            return str2.split("\\.")[1];
        }
        return str2;
    }

    public static int A00(Resources resources, int i) {
        int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.carousel_horizontal_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0003R.dimen.card_spacing);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(C0003R.dimen.card_width);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(C0003R.dimen.min_card_width);
        int i2 = i - dimensionPixelSize;
        int i3 = (int) (((double) (i - (((i2 / dimensionPixelSize3) * dimensionPixelSize2) + dimensionPixelSize))) / 2.5d);
        int i4 = (int) (((double) (i - (dimensionPixelSize + ((i2 / dimensionPixelSize4) * dimensionPixelSize2)))) / 2.25d);
        if (dimensionPixelSize4 <= i3 && i3 <= dimensionPixelSize3) {
            return i3;
        }
        if (dimensionPixelSize4 <= i4 && i4 <= dimensionPixelSize3) {
            return i4;
        }
        if (i3 > dimensionPixelSize3) {
            return dimensionPixelSize3;
        }
        if (i4 < dimensionPixelSize4) {
            return dimensionPixelSize4;
        }
        return Math.max(i3, dimensionPixelSize3);
    }

    public static Integer A01(C13390iS r0) {
        switch (r0.ordinal()) {
            case 2:
                return Constants.ONE;
            case 3:
                return Constants.ZERO;
            default:
                return null;
        }
    }
}
