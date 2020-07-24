package p000X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.1r1  reason: invalid class name and case insensitive filesystem */
public abstract class C41841r1 extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public int A03 = 160;
    public int A04 = 119;
    public boolean A05 = true;
    public boolean A06;
    public final Rect A07 = new Rect();
    public final Bitmap A08;
    public final Paint A09 = new Paint(3);
    public final BitmapShader A0A;
    public final Matrix A0B = new Matrix();
    public final RectF A0C = new RectF();

    public final void A01() {
        this.A06 = true;
        this.A05 = true;
        this.A00 = (float) (Math.min(this.A01, this.A02) >> 1);
        this.A09.setShader(this.A0A);
        invalidateSelf();
    }

    public final void A00() {
        if (this.A05) {
            if (this.A06) {
                int min = Math.min(this.A02, this.A01);
                A03(this.A04, min, min, getBounds(), this.A07);
                int min2 = Math.min(this.A07.width(), this.A07.height());
                this.A07.inset(Math.max(0, (this.A07.width() - min2) >> 1), Math.max(0, (this.A07.height() - min2) >> 1));
                this.A00 = ((float) min2) * 0.5f;
            } else {
                A03(this.A04, this.A02, this.A01, getBounds(), this.A07);
            }
            this.A0C.set(this.A07);
            if (this.A0A != null) {
                Matrix matrix = this.A0B;
                RectF rectF = this.A0C;
                matrix.setTranslate(rectF.left, rectF.top);
                this.A0B.preScale(this.A0C.width() / ((float) this.A08.getWidth()), this.A0C.height() / ((float) this.A08.getHeight()));
                this.A0A.setLocalMatrix(this.A0B);
                this.A09.setShader(this.A0A);
            }
            this.A05 = false;
        }
    }

    public final void A02(float f) {
        if (this.A00 != f) {
            this.A06 = false;
            boolean z = false;
            if (f > 0.05f) {
                z = true;
            }
            if (z) {
                this.A09.setShader(this.A0A);
            } else {
                this.A09.setShader((Shader) null);
            }
            this.A00 = f;
            invalidateSelf();
        }
    }

    public void A03(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.A08;
        if (bitmap != null) {
            A00();
            if (this.A09.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.A07, this.A09);
                return;
            }
            RectF rectF = this.A0C;
            float f = this.A00;
            canvas.drawRoundRect(rectF, f, f, this.A09);
        }
    }

    public final int getAlpha() {
        return this.A09.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.A09.getColorFilter();
    }

    public final int getIntrinsicHeight() {
        return this.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A02;
    }

    public final int getOpacity() {
        Bitmap bitmap;
        if (this.A04 != 119 || this.A06 || (bitmap = this.A08) == null || bitmap.hasAlpha() || this.A09.getAlpha() < 255) {
            return -3;
        }
        boolean z = false;
        if (this.A00 > 0.05f) {
            z = true;
        }
        if (!z) {
            return -1;
        }
        return -3;
    }

    public final void setAlpha(int i) {
        if (i != this.A09.getAlpha()) {
            this.A09.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setDither(boolean z) {
        this.A09.setDither(z);
        invalidateSelf();
    }

    public final void setFilterBitmap(boolean z) {
        this.A09.setFilterBitmap(z);
        invalidateSelf();
    }

    public C41841r1(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.A03 = resources.getDisplayMetrics().densityDpi;
        }
        this.A08 = bitmap;
        if (bitmap != null) {
            this.A02 = bitmap.getScaledWidth(this.A03);
            this.A01 = this.A08.getScaledHeight(this.A03);
            Bitmap bitmap2 = this.A08;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.A0A = new BitmapShader(bitmap2, tileMode, tileMode);
            return;
        }
        this.A01 = -1;
        this.A02 = -1;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.A06) {
            this.A00 = (float) (Math.min(this.A01, this.A02) >> 1);
        }
        this.A05 = true;
    }
}
