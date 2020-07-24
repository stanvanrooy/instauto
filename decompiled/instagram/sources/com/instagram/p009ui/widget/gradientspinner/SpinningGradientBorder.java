package com.instagram.p009ui.widget.gradientspinner;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass7Q7;
import p000X.C019000b;
import p000X.C06220Of;

/* renamed from: com.instagram.ui.widget.gradientspinner.SpinningGradientBorder */
public class SpinningGradientBorder extends FrameLayout {
    public int A00;
    public LinearGradient A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final ValueAnimator A06;
    public final Matrix A07;
    public final Paint A08;
    public final RectF A09;

    private void A00(Canvas canvas) {
        RectF rectF = this.A09;
        float f = this.A03;
        rectF.set(f, f, ((float) getWidth()) - this.A03, ((float) getHeight()) - this.A03);
        RectF rectF2 = this.A09;
        float f2 = this.A02;
        canvas.drawRoundRect(rectF2, f2, f2, this.A08);
    }

    public void setCurrentPlayTime(long j) {
        this.A06.setCurrentPlayTime(j);
    }

    public void setSpinnerState(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            if (!(i == 0 || i == 1)) {
                if (i == 2) {
                    this.A06.start();
                    invalidate();
                } else if (i != 3) {
                    throw new IllegalStateException(AnonymousClass000.A05("Invalid SpinnerState ", i));
                }
            }
            this.A06.cancel();
            invalidate();
        }
    }

    private LinearGradient getGradient() {
        Context context = getContext();
        if (this.A01 == null) {
            this.A01 = new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) getWidth(), (float) getHeight(), C019000b.A00(context, C0003R.color.transparent), this.A04, Shader.TileMode.CLAMP);
        }
        return this.A01;
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(787297186);
        super.onDetachedFromWindow();
        this.A06.end();
        AnonymousClass0Z0.A0D(-2123829886, A062);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.A00;
        if (i == 0) {
            this.A08.setColor(this.A05);
        } else if (i == 1) {
        } else {
            if (i == 2) {
                this.A08.setShader(getGradient());
                this.A07.setRotate((((Float) this.A06.getAnimatedValue()).floatValue() * 360.0f) - 0.099609375f, (float) (getWidth() / 2), (float) (getHeight() / 2));
                getGradient().setLocalMatrix(this.A07);
                A00(canvas);
            } else if (i == 3) {
                this.A08.setShader((Shader) null);
                this.A08.setColor(this.A04);
                A00(canvas);
            } else {
                throw new IllegalStateException(AnonymousClass000.A05("Invalid SpinnerState ", i));
            }
        }
    }

    public SpinningGradientBorder(Context context) {
        this(context, (AttributeSet) null);
    }

    public SpinningGradientBorder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpinningGradientBorder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 1;
        Context context2 = getContext();
        this.A02 = C06220Of.A03(context2, 4);
        getContext();
        this.A03 = C06220Of.A00(context2, 1.5f);
        Paint paint = new Paint(1);
        this.A08 = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.A08.setStrokeWidth(this.A03);
        this.A08.setStrokeCap(Paint.Cap.ROUND);
        this.A09 = new RectF();
        this.A07 = new Matrix();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f}).setDuration(1200);
        this.A06 = duration;
        duration.setInterpolator(new LinearInterpolator());
        this.A06.setRepeatCount(-1);
        this.A06.addUpdateListener(new AnonymousClass7Q7(this));
        this.A04 = C019000b.A00(context, AnonymousClass1BA.A03(context, C0003R.attr.gradientSpinnerDoneColor));
        this.A05 = C019000b.A00(context, AnonymousClass1BA.A03(context, C0003R.attr.backgroundColorPrimary));
        setWillNotDraw(false);
    }
}
