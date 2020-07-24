package p000X;

import android.graphics.Matrix;
import android.view.TextureView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1yg  reason: invalid class name and case insensitive filesystem */
public final class C45851yg {
    public static boolean A00;

    public static float A00(Matrix matrix, float f, float f2, int i, int i2) {
        if (f2 < f) {
            float f3 = f2 / f;
            matrix.setScale(1.0f, f3, ((float) i) / 2.0f, ((float) i2) / 2.0f);
            return f3;
        }
        float f4 = f / f2;
        matrix.setScale(f4, 1.0f, ((float) i) / 2.0f, ((float) i2) / 2.0f);
        return f4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        if (r18 != null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
        if (r18 != null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (r18 != null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        r1.BFO(r2);
     */
    public static void A01(TextureView textureView, C45681yK r12, int i, int i2, float f, float f2, float f3, C190868Ds r18) {
        int width;
        int height;
        if (A00) {
            width = textureView.getMeasuredWidth();
        } else {
            width = textureView.getWidth();
        }
        if (A00) {
            height = textureView.getMeasuredHeight();
        } else {
            height = textureView.getHeight();
        }
        float f4 = (float) i;
        float f5 = (float) i2;
        float f6 = f4 / f5;
        float f7 = (float) width;
        float f8 = (float) height;
        float f9 = f7 / f8;
        Matrix matrix = new Matrix();
        C190868Ds r1 = r18;
        switch (r12.ordinal()) {
            case 0:
                A00(matrix, f6, f9, width, height);
                break;
            case 1:
                float A002 = A00(matrix, f6, f9, width, height);
                f6 = 1.0f;
                float f10 = 1.0f / A002;
                matrix.postScale(f10, f10, f7 / 2.0f, f8 / 2.0f);
                break;
            case 2:
                A00(matrix, f6, f9, width, height);
                if (i >= i2 || f6 >= f) {
                    if (i > i2 && f6 > f2) {
                        float f11 = f6 / f2;
                        matrix.postScale(f11, f11, f7 / 2.0f, f8 / 2.0f);
                        f6 = f2;
                        break;
                    }
                } else {
                    float f12 = f / f6;
                    matrix.postScale(f12, f12, f7 / 2.0f, f8 / 2.0f);
                    f6 = f;
                    break;
                }
                break;
            case 3:
                float A003 = 1.0f / A00(matrix, f6, f9, width, height);
                float f13 = f8 / 2.0f;
                matrix.postScale(A003, A003, f7 / 2.0f, f13);
                matrix.postTranslate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (((f7 / f4) * f5) / 2.0f) - f13);
                break;
            case 4:
                float A004 = 1.0f / A00(matrix, f6, f9, width, height);
                float f14 = f8 / 2.0f;
                matrix.postScale(A004, A004, f7 / 2.0f, f14);
                float f15 = (f7 / f4) * f5;
                matrix.postTranslate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (f15 / 2.0f) - f14);
                matrix.postTranslate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f15 * f3 * -1.0f);
                break;
            default:
                throw new IllegalStateException("Incorrect VideoScaleType state");
        }
        textureView.setTransform(matrix);
    }
}
