package p000X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import java.util.concurrent.Callable;

/* renamed from: X.C4o */
public final class C4o implements Callable {
    public final /* synthetic */ C4m A00;

    public C4o(C4m c4m) {
        this.A00 = c4m;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C5Y c5y;
        C4m c4m = this.A00;
        c4m.A00 = BitmapFactory.decodeFile(c4m.A0H);
        C4m c4m2 = this.A00;
        Bitmap bitmap = c4m2.A00;
        if (bitmap == null) {
            C5Z c5z = (C5Z) c4m2.A00.get();
            if (c5z == null) {
                return null;
            }
            c5z.BN8();
            c5z.BK1();
            return null;
        }
        Point[] pointArr = c4m2.A0J;
        if (!(pointArr == null || (c5y = c4m2.A01) == null || !c5y.isSkewedCroppingEnabled() || pointArr == null)) {
            Point point = pointArr[0];
            Point point2 = pointArr[3];
            float A002 = C27249C4z.A00(point, point2);
            Point point3 = pointArr[1];
            float A003 = C27249C4z.A00(point, point3);
            Point point4 = pointArr[2];
            float A004 = C27249C4z.A00(point3, point4);
            int A005 = ((int) (A003 + C27249C4z.A00(point4, point2))) / 2;
            int i = ((int) (A002 + A004)) / 2;
            int length = pointArr.length;
            int i2 = length << 1;
            float[] fArr = new float[i2];
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = i3 << 1;
                Point point5 = pointArr[i3];
                fArr[i4] = (float) point5.x;
                fArr[i4 + 1] = (float) point5.y;
            }
            Matrix matrix = new Matrix();
            float f = (float) A005;
            float f2 = (float) i;
            int i5 = i2 >> 1;
            Matrix matrix2 = matrix;
            matrix2.setPolyToPoly(fArr, 0, new float[]{0.0f, 0.0f, f, 0.0f, f, f2, 0.0f, f2}, 0, i5);
            Bitmap createBitmap = Bitmap.createBitmap(A005, i, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(bitmap, matrix, (Paint) null);
            bitmap = createBitmap;
        }
        C41841r1 A006 = C87083q9.A00(c4m2.getResources(), bitmap);
        A006.A09.setAntiAlias(true);
        A006.invalidateSelf();
        A006.A02(((float) bitmap.getWidth()) * 0.03f);
        return A006;
    }
}
