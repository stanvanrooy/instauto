package p000X;

import android.util.Pair;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.BV9 */
public final class BV9 {
    public static Pair A00(int i, int i2, float f, int i3, boolean z) {
        int i4;
        int round;
        int round2;
        int i5;
        int i6;
        if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            float f2 = (float) i3;
            round = Math.round(((float) i) / f2) * i3;
            round2 = Math.round(((float) i2) / f2) * i3;
        } else if (z && ((double) Math.abs(f - 1.7777778f)) < 0.001d) {
            float f3 = (float) i2;
            int i7 = 9;
            int i8 = i3;
            while (true) {
                i6 = i7;
                i7 = i8;
                if (i8 <= 0) {
                    break;
                }
                i8 = i6 % i8;
            }
            int i9 = 9 * (i3 / i6);
            round2 = Math.round(f3 / ((float) i9)) * i9;
            round = (round2 << 4) / 9;
        } else if (!z || ((double) Math.abs(f - 0.5625f)) >= 0.001d) {
            int i10 = 16;
            int i11 = i3;
            while (true) {
                i4 = i10;
                i10 = i11;
                if (i11 <= 0) {
                    break;
                }
                i11 = i4 % i11;
            }
            int i12 = 16 * (i3 / i4);
            float f4 = (float) i12;
            round = Math.round(((float) i) / f4) * i12;
            round2 = Math.round(((float) i2) / f4) * i12;
            if (f < 1.0f) {
                round2 = Math.round((((float) round) / f) / f4) * i12;
            } else {
                round = Math.round((((float) round2) * f) / f4) * i12;
            }
        } else {
            float f5 = (float) i;
            int i13 = 9;
            int i14 = i3;
            while (true) {
                i5 = i13;
                i13 = i14;
                if (i14 <= 0) {
                    break;
                }
                i14 = i5 % i14;
            }
            int i15 = 9 * (i3 / i5);
            round = Math.round(f5 / ((float) i15)) * i15;
            round2 = (round << 4) / 9;
        }
        return Pair.create(Integer.valueOf(round), Integer.valueOf(round2));
    }
}
