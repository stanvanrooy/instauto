package p000X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.1eK  reason: invalid class name and case insensitive filesystem */
public final class C34241eK extends Drawable {
    public Path A00;
    public final Paint A01;
    public final float A02;
    public final int A03;
    public final RectF A04 = new RectF();

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        Integer num = Constants.A0j;
        int i = this.A03;
        if (C34231eJ.A01(num, i)) {
            RectF rectF = this.A04;
            float f = this.A02;
            canvas.drawRoundRect(rectF, f, f, this.A01);
            return;
        }
        if (this.A00 == null) {
            this.A00 = AnonymousClass7M6.A00(this.A02, i, this.A04.width(), this.A04.height());
        }
        canvas.drawPath(this.A00, this.A01);
    }

    public final void setAlpha(int i) {
        if (this.A01.getAlpha() != i) {
            this.A01.setAlpha(i);
            invalidateSelf();
        }
    }

    public C34241eK(int i, int i2, float f, int i3) {
        this.A02 = f;
        this.A03 = i3;
        Paint paint = new Paint(1);
        this.A01 = paint;
        paint.setColor(i2);
        this.A01.setStyle(Paint.Style.STROKE);
        this.A01.setStrokeWidth((float) i);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A04.set(rect);
        this.A00 = null;
    }
}
