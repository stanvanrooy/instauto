package p000X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.1Zs  reason: invalid class name and case insensitive filesystem */
public final class C31731Zs implements C31741Zt {
    public final void ACi(Canvas canvas, Paint paint, Paint paint2, float f, float f2, float f3, float f4, int i, int i2, boolean z, RectF rectF) {
        float f5 = 360.0f / ((float) i2);
        float f6 = (1.0f - f4) * f5;
        if (!z) {
            f6 = Math.max(f6, 0.1f);
        }
        float f7 = f3 + (((f2 + (((float) i) * f5)) - (f5 / 2.0f)) - (f6 / 2.0f));
        RectF rectF2 = rectF;
        Paint paint3 = paint;
        if (z) {
            float width = ((float) (((double) (rectF2.width() / 2.0f)) * 6.283185307179586d)) * (f6 / 360.0f);
            float f8 = f;
            if (width < f) {
                paint.setStrokeWidth(width);
            } else {
                paint.setStrokeWidth(f8);
            }
        }
        canvas.drawArc(rectF2, f7, f6, false, paint3);
        Paint paint4 = paint2;
        if (paint2.getAlpha() > 0) {
            canvas.drawArc(rectF2, f7, f6, false, paint4);
        }
    }
}
