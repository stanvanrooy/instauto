package p000X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Arrays;

/* renamed from: X.1Zy  reason: invalid class name and case insensitive filesystem */
public final class C31791Zy {
    public static LinearGradient A02(Context context, int i, int i2) {
        int[] iArr = new int[5];
        A03(context, (AttributeSet) null, C0003R.style.GradientPatternStyle, iArr);
        return A01(i, i2, iArr);
    }

    public static LinearGradient A01(int i, int i2, int[] iArr) {
        int[] iArr2 = iArr;
        if (Arrays.equals(iArr, C38351l8.A01)) {
            return new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i, (float) i2, iArr2, new float[]{0.06f, 0.37f, 0.64f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i2, (float) i, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, iArr2, new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.27f, 0.51f, 0.75f, 1.0f}, Shader.TileMode.CLAMP);
    }

    public static Bitmap A00(Context context, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (Paint) null);
        Paint paint = new Paint();
        paint.setShader(A02(context, width, height));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) width, (float) height, paint);
        return createBitmap;
    }

    public static void A03(Context context, AttributeSet attributeSet, int i, int[] iArr) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A22, 0, i);
        try {
            iArr[0] = obtainStyledAttributes.getColor(0, -16777216);
            iArr[1] = obtainStyledAttributes.getColor(1, -16777216);
            iArr[2] = obtainStyledAttributes.getColor(2, -16777216);
            iArr[3] = obtainStyledAttributes.getColor(3, -16777216);
            iArr[4] = obtainStyledAttributes.getColor(4, -16777216);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
