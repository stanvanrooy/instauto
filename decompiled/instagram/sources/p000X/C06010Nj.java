package p000X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.instagram.common.util.gradient.BackgroundGradientColors;

/* renamed from: X.0Nj  reason: invalid class name and case insensitive filesystem */
public final class C06010Nj {
    public static final Matrix A00 = new Matrix();

    public static BackgroundGradientColors A00(Bitmap bitmap) {
        Integer num;
        if (bitmap.getWidth() > bitmap.getHeight()) {
            num = Constants.ZERO;
        } else {
            num = Constants.ONE;
        }
        return A01(bitmap, num);
    }

    public static BackgroundGradientColors A01(Bitmap bitmap, Integer num) {
        int i;
        int i2;
        String str;
        int intValue = num.intValue();
        Bitmap bitmap2 = bitmap;
        switch (intValue) {
            case 0:
                i2 = bitmap.getWidth();
                i = Math.max((int) (((float) bitmap.getHeight()) * 0.05f), 1);
                break;
            case 1:
                i2 = Math.max((int) (((float) bitmap.getWidth()) * 0.05f), 1);
                i = bitmap.getHeight();
                break;
            default:
                if (1 - intValue != 0) {
                    str = "VERTICAL";
                } else {
                    str = "HORIZONTAL";
                }
                throw new IllegalArgumentException(AnonymousClass000.A0E("Unsupported extraction type ", str));
        }
        A00.setScale(1.0f / ((float) i2), 1.0f / ((float) i));
        try {
            Matrix matrix = A00;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, i2, i, matrix, true);
            int pixel = createBitmap.getPixel(0, 0);
            if (createBitmap != bitmap2) {
                createBitmap.recycle();
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(bitmap2, bitmap2.getWidth() - i2, bitmap2.getHeight() - i, i2, i, matrix, true);
            int pixel2 = createBitmap2.getPixel(0, 0);
            if (createBitmap2 != bitmap2) {
                createBitmap2.recycle();
            }
            return new BackgroundGradientColors(pixel, pixel2);
        } catch (RuntimeException e) {
            AnonymousClass0QD.A09(" BackgroundGradientUtil_error_creating_bitamp", e);
            return new BackgroundGradientColors(-1, -1);
        }
    }
}
