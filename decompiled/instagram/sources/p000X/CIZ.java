package p000X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.CIZ */
public final class CIZ extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public final long A04;
    public final ValueAnimator A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final int A09;
    public final int A0A;
    public final ValueAnimator.AnimatorUpdateListener A0B = new C27558CIa(this);
    public final Paint A0C;
    public final C27559CIb[] A0D;

    public final int getOpacity() {
        return -3;
    }

    public CIZ(float f, long j, long j2, int[] iArr) {
        this.A07 = f;
        this.A09 = 36;
        this.A06 = 0.65f;
        this.A08 = 0.5f;
        this.A04 = j2;
        this.A0A = 45;
        C27560CIc cIc = new C27560CIc(iArr);
        C27559CIb[] cIbArr = new C27559CIb[3];
        this.A0D = cIbArr;
        for (int i = 0; i < 3; i++) {
            int i2 = cIc.A00;
            int[] iArr2 = cIc.A02;
            int length = iArr2.length;
            cIc.A00 = (i2 + 1) % length;
            cIbArr[i] = new C27559CIb(i, iArr2[i2 % length], cIc);
        }
        Paint paint = new Paint(1);
        this.A0C = paint;
        paint.setStyle(Paint.Style.FILL);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
        this.A05 = ofFloat;
        ofFloat.setDuration(j);
        this.A05.setInterpolator(new LinearInterpolator());
        this.A05.setRepeatCount(-1);
        this.A05.setRepeatMode(1);
        this.A05.addUpdateListener(this.A0B);
    }

    public final void draw(Canvas canvas) {
        float min;
        if (this.A03 != 0) {
            Canvas canvas2 = canvas;
            canvas2.translate((float) this.A01, (float) this.A02);
            float f = ((float) this.A03) / 2.0f;
            float f2 = this.A06 * f;
            float f3 = (f - this.A07) - f2;
            for (C27559CIb cIb : this.A0D) {
                float f4 = this.A00 + (((float) cIb.A03) / ((float) cIb.A02));
                if (f4 > 1.0f) {
                    f4 -= 1.0f;
                }
                if (this.A04 == 0) {
                    min = 1.0f;
                } else {
                    min = Math.min(1.0f, (f4 * ((float) this.A05.getDuration())) / ((float) this.A04));
                }
                float f5 = f2 + (f3 * f4);
                float f6 = (1.0f - ((f5 - f2) / f3)) * this.A07;
                float f7 = (float) (6.283185307179586d / ((double) this.A09));
                double d = (double) f4;
                float radians = (float) ((6.283185307179586d * d * ((double) this.A08)) + (Math.toRadians((double) this.A0A) * Math.pow(d, 1.5d)));
                float f8 = this.A00 + (((float) cIb.A03) / ((float) cIb.A02));
                if (f8 > 1.0f) {
                    f8 -= 1.0f;
                }
                if (cIb.A00 > f8) {
                    C27560CIc cIc = cIb.A04;
                    int i = cIc.A00;
                    int[] iArr = cIc.A02;
                    int length = iArr.length;
                    cIc.A00 = (i + 1) % length;
                    cIb.A01 = iArr[i % length];
                }
                cIb.A00 = f8;
                this.A0C.setColor(cIb.A01);
                this.A0C.setAlpha((int) (min * 255.0f));
                Paint paint = this.A0C;
                int i2 = this.A09;
                int alpha = paint.getAlpha();
                for (int i3 = 0; i3 < i2; i3++) {
                    double d2 = (double) f5;
                    double d3 = (double) ((((float) i3) * f7) + radians);
                    float cos = (float) (Math.cos(d3) * d2);
                    float sin = (float) (d2 * Math.sin(d3));
                    C27560CIc cIc2 = cIb.A04;
                    if (cIc2.A01) {
                        int[] iArr2 = cIc2.A02;
                        int i4 = iArr2[i3 % iArr2.length];
                        Paint paint2 = paint;
                        paint2.setColor(i4);
                        paint2.setAlpha(alpha);
                    }
                    canvas2.drawCircle(cos, sin, f6, paint);
                }
            }
        }
    }

    public final void setAlpha(int i) {
        this.A0C.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0C.setColorFilter(colorFilter);
    }

    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    public final void onBoundsChange(Rect rect) {
        this.A01 = rect.centerX();
        this.A02 = rect.centerY();
        this.A03 = Math.min(rect.width(), rect.height());
        invalidateSelf();
    }
}
