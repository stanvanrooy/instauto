package p000X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.1Zu  reason: invalid class name and case insensitive filesystem */
public final class C31751Zu implements C31741Zt {
    public final void ACi(Canvas canvas, Paint paint, Paint paint2, float f, float f2, float f3, float f4, int i, int i2, boolean z, RectF rectF) {
        float A01 = (float) C27181Gu.A01((double) (1.0f - f4), 0.0d, 1.0d, 60.0d, 180.0d);
        float f5 = f3 + (((f2 + (((float) i) * 180.0f)) - 90.0f) - A01);
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        canvas2.drawArc(rectF2, f5, A01, false, paint);
        Paint paint3 = paint2;
        if (paint3.getAlpha() > 0) {
            canvas2.drawArc(rectF2, f5, A01, false, paint3);
        }
    }
}
