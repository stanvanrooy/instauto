package p000X;

import android.opengl.Matrix;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.widget.drawing.common.Point2;

/* renamed from: X.DMF */
public final class DMF {
    public static final float[] A05 = {1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -3.0f, 2.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, -2.0f, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -1.0f, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 3.0f, -2.0f};
    public static final float[] A06 = {BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -6.0f, 6.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, -4.0f, 3.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -2.0f, 3.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 6.0f, -6.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER};
    public float A00 = -1.0f;
    public final float[] A01;
    public final float[] A02;
    public final float[] A03;
    public final float[] A04 = new float[16];

    public final void A01(float f, float[] fArr) {
        float f2 = f * f;
        float[] fArr2 = fArr;
        Matrix.multiplyMV(fArr2, 0, this.A04, 0, new float[]{1.0f, f, f2, f2 * f}, 0);
    }

    public final float A00() {
        float f = this.A00;
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (f >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return f;
        }
        float f3 = 1.0f / ((float) 10);
        int i = 0;
        Point2 point2 = new Point2(this.A02[0], this.A03[0]);
        Point2 point22 = new Point2();
        float f4 = f3;
        while (i < 10) {
            A01(f4, this.A01);
            float[] fArr = this.A01;
            point22.set(fArr[0], fArr[1]);
            f2 += point2.A00(point22);
            point2.set(point22);
            i++;
            f4 += f3;
        }
        this.A00 = f2;
        return f2;
    }

    public DMF(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[16];
        this.A01 = fArr3;
        float[] fArr4 = fArr;
        this.A02 = fArr;
        this.A03 = fArr2;
        Matrix.multiplyMV(fArr3, 0, A05, 0, fArr4, 0);
        Matrix.multiplyMV(this.A01, 4, A05, 0, fArr2, 0);
        Matrix.multiplyMV(this.A01, 8, A06, 0, fArr4, 0);
        Matrix.multiplyMV(this.A01, 12, A06, 0, fArr2, 0);
        Matrix.transposeM(this.A04, 0, this.A01, 0);
    }
}
