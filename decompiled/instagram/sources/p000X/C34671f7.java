package p000X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1f7  reason: invalid class name and case insensitive filesystem */
public final class C34671f7 extends Drawable {
    public int A00;
    public int A01 = -1;
    public boolean A02 = true;
    public float A03;
    public int A04;
    public final Paint A05 = new Paint(1);
    public final Paint A06 = new Paint(1);
    public final float A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Paint A0D = new Paint(1);
    public final RectF A0E = new RectF();
    public final RectF A0F = new RectF();
    public final RectF A0G = new RectF();
    public final RectF A0H = new RectF();
    public final Interpolator A0I = new AccelerateDecelerateInterpolator();

    public static C34671f7 A00(int i, float f) {
        float f2 = ((float) i) / ((2.0f * f) + 3.0f);
        return new C34671f7((int) f2, (int) (f * f2), i, i >> 1);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void A01(int i, int i2) {
        int min = Math.min(i, (this.A08 - 1) >> 1);
        this.A04 = min;
        this.A03 = this.A07 + ((float) min);
        this.A0D.setColor(i2);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        long elapsedRealtime;
        float interpolation;
        float f;
        int i;
        float A012;
        float A013;
        float f2;
        float f3;
        RectF rectF;
        int i2 = this.A01;
        if (i2 != -1) {
            elapsedRealtime = (long) i2;
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        long j = elapsedRealtime % 1200;
        if (!this.A02) {
            A012 = (float) this.A0B;
            A013 = (float) this.A0A;
        } else {
            if (j < 600) {
                interpolation = this.A0I.getInterpolation(C06420Oz.A01((float) j, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 600.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f));
                f = (float) this.A0A;
                i = this.A0B;
            } else {
                interpolation = this.A0I.getInterpolation(C06420Oz.A01((float) j, 600.0f, 1200.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f));
                f = (float) this.A0B;
                i = this.A0A;
            }
            float f4 = (float) i;
            A012 = C06420Oz.A01(interpolation, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, f, f4);
            A013 = C06420Oz.A01(interpolation, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, f4, f);
        }
        float f5 = A012 / 2.0f;
        float f6 = A013 / 2.0f;
        RectF rectF2 = this.A0G;
        float f7 = (float) this.A09;
        rectF2.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f7 - f5, (float) this.A0C, f7 + f5);
        RectF rectF3 = this.A0F;
        float f8 = (float) this.A09;
        rectF3.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f8 - f6, (float) this.A0C, f8 + f6);
        canvas.save();
        RectF rectF4 = this.A0E;
        canvas.translate(rectF4.left, rectF4.top);
        if (this.A05.getColor() != -1) {
            RectF rectF5 = this.A0E;
            float f9 = (float) this.A00;
            canvas.drawRoundRect(rectF5, f9, f9, this.A05);
        }
        float width = this.A0E.width();
        float height = this.A0E.height();
        int intrinsicWidth = getIntrinsicWidth();
        int intrinsicHeight = getIntrinsicHeight();
        float f10 = (float) intrinsicWidth;
        if (width > f10) {
            f2 = (width / 2.0f) - (f10 / 2.0f);
        } else {
            f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        float f11 = (float) intrinsicHeight;
        if (height > f11) {
            f3 = (height / 2.0f) - (f11 / 2.0f);
        } else {
            f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        canvas.translate(f2, f3);
        boolean z = true;
        for (int i3 = 0; i3 < 3; i3++) {
            if (z) {
                rectF = this.A0G;
            } else {
                rectF = this.A0F;
            }
            int i4 = this.A04;
            if (i4 > 0) {
                RectF rectF6 = this.A0H;
                float f12 = (float) (-i4);
                rectF6.left = rectF.left + f12;
                rectF6.top = rectF.top + f12;
                rectF6.right = rectF.right - f12;
                rectF6.bottom = rectF.bottom - f12;
                float f13 = this.A03;
                canvas.drawRoundRect(rectF6, f13, f13, this.A0D);
            }
            float f14 = this.A07;
            canvas.drawRoundRect(rectF, f14, f14, this.A06);
            if (i3 < 2) {
                this.A0G.offset((float) (this.A0C + this.A08), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A0F.offset((float) (this.A0C + this.A08), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
            z = !z;
        }
        canvas.restore();
        if (this.A02) {
            invalidateSelf();
        }
    }

    public final int getIntrinsicHeight() {
        return this.A0A;
    }

    public final int getIntrinsicWidth() {
        return (this.A0C * 3) + (this.A08 << 1);
    }

    public final void onBoundsChange(Rect rect) {
        this.A0E.set(rect);
    }

    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
        this.A05.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
        this.A05.setColorFilter(colorFilter);
    }

    public C34671f7(int i, int i2, int i3, int i4) {
        this.A0C = i;
        this.A08 = i2;
        this.A0A = i3;
        this.A0B = i4;
        this.A09 = i3 - i4;
        this.A07 = ((float) i) / 2.0f;
        this.A06.setColor(-1);
        this.A05.setColor(-1);
        this.A0D.setColor(-1);
        this.A0F.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A0C, (float) this.A0B);
        this.A0G.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A0C, (float) this.A0A);
    }
}
