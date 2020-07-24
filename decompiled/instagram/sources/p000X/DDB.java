package p000X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.DDB */
public final class DDB {
    public static float A00(DDE dde, float f, float f2) {
        float[] fArr = dde.A00;
        if (fArr == null) {
            return dde.A00;
        }
        float[] fArr2 = dde.A01;
        if (fArr2 == null) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        int length = fArr.length;
        int A00 = C29824DCi.A00(fArr, length, f);
        if (A00 >= 0) {
            return fArr2[A00];
        }
        int i = -(A00 + 1);
        if (i == 0) {
            return fArr2[0];
        }
        if (i == length) {
            return fArr2[length - 1];
        }
        float f3 = fArr2[i - 1];
        return ((fArr2[i] - f3) * DDC.A00(dde, i, f, f2)) + f3;
    }
}
