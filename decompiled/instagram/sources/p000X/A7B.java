package p000X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.A7B */
public final class A7B extends Drawable implements Animatable {
    public static final Interpolator A06 = new LinearInterpolator();
    public static final Interpolator A07 = new AnonymousClass991();
    public static final int[] A08 = {-16777216};
    public float A00;
    public boolean A01;
    public float A02;
    public Animator A03;
    public Resources A04;
    public final A7C A05;

    public final int getOpacity() {
        return -3;
    }

    private void A00(float f, float f2, float f3, float f4) {
        A7C a7c = this.A05;
        float f5 = this.A04.getDisplayMetrics().density;
        float f6 = f2 * f5;
        a7c.A08 = f6;
        a7c.A0J.setStrokeWidth(f6);
        a7c.A02 = f * f5;
        a7c.A00(0);
        a7c.A0B = (int) (f3 * f5);
        a7c.A0A = (int) (f4 * f5);
    }

    public final void A01(float f, A7C a7c) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = a7c.A0G;
            int i = a7c.A0C;
            int i2 = iArr[i];
            int i3 = iArr[(i + 1) % iArr.length];
            int i4 = (i2 >> 24) & 255;
            int i5 = (i2 >> 16) & 255;
            int i6 = (i2 >> 8) & 255;
            int i7 = i2 & 255;
            a7c.A0D = ((i4 + ((int) (((float) (((i3 >> 24) & 255) - i4)) * f2))) << 24) | ((i5 + ((int) (((float) (((i3 >> 16) & 255) - i5)) * f2))) << 16) | ((i6 + ((int) (((float) (((i3 >> 8) & 255) - i6)) * f2))) << 8) | (i7 + ((int) (f2 * ((float) ((i3 & 255) - i7)))));
            return;
        }
        a7c.A0D = a7c.A0G[a7c.A0C];
    }

    public final void A02(float f, A7C a7c, boolean z) {
        float f2;
        float interpolation;
        if (this.A01) {
            A01(f, a7c);
            float f3 = a7c.A06;
            float floor = (float) (Math.floor((double) (f3 / 0.8f)) + 1.0d);
            float f4 = a7c.A07;
            float f5 = a7c.A05;
            a7c.A04 = f4 + (((f5 - 0.01f) - f4) * f);
            a7c.A01 = f5;
            a7c.A03 = f3 + ((floor - f3) * f);
        } else if (f != 1.0f || z) {
            float f6 = a7c.A06;
            if (f < 0.5f) {
                interpolation = a7c.A07;
                f2 = (A07.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                f2 = a7c.A07 + 0.79f;
                interpolation = f2 - (((1.0f - A07.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            a7c.A04 = interpolation;
            a7c.A01 = f2;
            a7c.A03 = f6 + (0.20999998f * f);
            this.A02 = (f + this.A00) * 216.0f;
        }
    }

    public final void A03(int i) {
        if (i == 0) {
            A00(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            A00(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.A05.A09;
    }

    public final boolean isRunning() {
        return this.A03.isRunning();
    }

    public final void setAlpha(int i) {
        this.A05.A09 = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.A0J.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void start() {
        Animator animator;
        long j;
        this.A03.cancel();
        A7C a7c = this.A05;
        float f = a7c.A04;
        a7c.A07 = f;
        float f2 = a7c.A01;
        a7c.A05 = f2;
        a7c.A06 = a7c.A03;
        if (f2 != f) {
            this.A01 = true;
            animator = this.A03;
            j = 666;
        } else {
            a7c.A00(0);
            a7c.A07 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            a7c.A05 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            a7c.A06 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            a7c.A04 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            a7c.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            a7c.A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            animator = this.A03;
            j = 1332;
        }
        animator.setDuration(j);
        this.A03.start();
    }

    public final void stop() {
        this.A03.cancel();
        this.A02 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        A7C a7c = this.A05;
        if (a7c.A0F) {
            a7c.A0F = false;
        }
        a7c.A00(0);
        a7c.A07 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        a7c.A05 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        a7c.A06 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        a7c.A04 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        a7c.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        a7c.A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        invalidateSelf();
    }

    public A7B(Context context) {
        AnonymousClass11J.A00(context);
        this.A04 = context.getResources();
        A7C a7c = new A7C();
        this.A05 = a7c;
        a7c.A0G = A08;
        a7c.A00(0);
        a7c.A08 = 2.5f;
        a7c.A0J.setStrokeWidth(2.5f);
        invalidateSelf();
        A7C a7c2 = this.A05;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
        ofFloat.addUpdateListener(new A7K(this, a7c2));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(A06);
        ofFloat.addListener(new A7G(this, a7c2));
        this.A03 = ofFloat;
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Canvas canvas2 = canvas;
        canvas.save();
        canvas.rotate(this.A02, bounds.exactCenterX(), bounds.exactCenterY());
        A7C a7c = this.A05;
        RectF rectF = a7c.A0K;
        float f = a7c.A02;
        float f2 = (a7c.A08 / 2.0f) + f;
        if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            f2 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) a7c.A0B) * a7c.A00) / 2.0f, a7c.A08 / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f2, ((float) bounds.centerY()) - f2, ((float) bounds.centerX()) + f2, ((float) bounds.centerY()) + f2);
        float f3 = a7c.A04;
        float f4 = a7c.A03;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((a7c.A01 + f4) * 360.0f) - f5;
        a7c.A0J.setColor(a7c.A0D);
        a7c.A0J.setAlpha(a7c.A09);
        float f7 = a7c.A08 / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, a7c.A0I);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas2.drawArc(rectF, f5, f6, false, a7c.A0J);
        if (a7c.A0F) {
            Path path = a7c.A0E;
            if (path == null) {
                Path path2 = new Path();
                a7c.A0E = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            a7c.A0E.moveTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            a7c.A0E.lineTo(((float) a7c.A0B) * a7c.A00, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            Path path3 = a7c.A0E;
            float f9 = a7c.A00;
            path3.lineTo((((float) a7c.A0B) * f9) / 2.0f, ((float) a7c.A0A) * f9);
            a7c.A0E.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) a7c.A0B) * a7c.A00) / 2.0f), rectF.centerY() + (a7c.A08 / 2.0f));
            a7c.A0E.close();
            a7c.A0H.setColor(a7c.A0D);
            a7c.A0H.setAlpha(a7c.A09);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(a7c.A0E, a7c.A0H);
            canvas.restore();
        }
        canvas.restore();
    }
}
