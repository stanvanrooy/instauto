package p000X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.A7E */
public abstract class A7E extends Drawable {
    public float A00 = 1.0f;
    public int A01 = -1;
    public int A02 = -1;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final A7S[] A08 = new A7S[3];

    public float A00(int i) {
        return ((Float) ((A7F) this).A02[i].getAnimatedValue()).floatValue();
    }

    public void A01(int i, int i2) {
        if (this instanceof A7F) {
            A7F a7f = (A7F) this;
            int min = (int) Math.min((float) a7f.A03, ((float) i2) - ((((float) a7f.A05) * a7f.A00) / 2.0f));
            float abs = Math.abs(A7M.A00);
            float abs2 = Math.abs(A7M.A01);
            float f = 1.0f;
            float f2 = abs == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 1.0f : ((float) min) / abs;
            if (abs2 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f = ((float) min) / abs2;
            }
            float min2 = Math.min(f2, f);
            float[] fArr = A7M.A02;
            int length = fArr.length;
            float[] fArr2 = new float[length];
            for (int i3 = 0; i3 < length; i3++) {
                fArr2[i3] = (fArr[i3] * min2) + BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            float[] fArr3 = A7M.A03;
            int length2 = fArr3.length;
            float[] fArr4 = new float[length2];
            for (int i4 = 0; i4 < length2; i4++) {
                fArr4[i4] = (fArr3[i4] * min2) + BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            float[] fArr5 = A7M.A04;
            int length3 = fArr5.length;
            float[] fArr6 = new float[length3];
            for (int i5 = 0; i5 < length3; i5++) {
                fArr6[i5] = (fArr5[i5] * min2) + BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setFloatValues(fArr2);
            valueAnimator.setRepeatCount(-1);
            ValueAnimator valueAnimator2 = new ValueAnimator();
            valueAnimator2.setFloatValues(fArr4);
            valueAnimator2.setRepeatCount(-1);
            ValueAnimator valueAnimator3 = new ValueAnimator();
            valueAnimator3.setFloatValues(fArr6);
            valueAnimator3.setRepeatCount(-1);
            ValueAnimator[] valueAnimatorArr = {valueAnimator, valueAnimator2, valueAnimator3};
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new AnonymousClass9GY(animatorSet));
            animatorSet.playTogether(new Animator[]{valueAnimatorArr[0], valueAnimatorArr[1], valueAnimatorArr[2]});
            animatorSet.setDuration(1633);
            A7R a7r = new A7R(animatorSet, valueAnimatorArr);
            if (a7f.A02.length == a7r.A01.length) {
                boolean isRunning = a7f.isRunning();
                if (isRunning) {
                    a7f.stop();
                }
                a7f.A00 = a7r.A00;
                ValueAnimator[] valueAnimatorArr2 = a7r.A01;
                ValueAnimator[] valueAnimatorArr3 = a7f.A02;
                System.arraycopy(valueAnimatorArr2, 0, valueAnimatorArr3, 0, valueAnimatorArr3.length);
                if (isRunning) {
                    a7f.start();
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        int i = 0;
        while (true) {
            A7S[] a7sArr = this.A08;
            if (i < a7sArr.length) {
                a7sArr[i].A00.setColorFilter(colorFilter);
                i++;
            } else {
                return;
            }
        }
    }

    public void start() {
        if (this instanceof A7F) {
            A7F a7f = (A7F) this;
            if (!a7f.A01) {
                a7f.A01 = true;
                AnimatorSet animatorSet = a7f.A00;
                if (animatorSet != null) {
                    animatorSet.start();
                }
                a7f.invalidateSelf();
            }
        }
    }

    public void stop() {
        if (this instanceof A7F) {
            A7F a7f = (A7F) this;
            if (a7f.A01) {
                a7f.A01 = false;
                AnimatorSet animatorSet = a7f.A00;
                if (animatorSet != null) {
                    boolean isStarted = animatorSet.isStarted();
                    boolean z = false;
                    if (isStarted) {
                        z = true;
                    }
                    if (z) {
                        a7f.A00.end();
                    }
                }
            }
        }
    }

    public void draw(Canvas canvas) {
        int i = this.A05;
        float f = this.A00;
        int i2 = (int) (((float) i) * f);
        int i3 = (int) (f * ((float) this.A04));
        int i4 = (this.A01 - i) >> 1;
        int i5 = 0;
        for (int i6 = 0; i6 < this.A08.length; i6++) {
            int i7 = i5 + i2;
            int round = Math.round(A00(i6)) + i4;
            Drawable drawable = this.A08[i6].A00;
            drawable.setBounds(i5, round, i7, round + i2);
            drawable.draw(canvas);
            i5 = i7 + i3;
        }
    }

    public A7E(int i, int i2, int i3) {
        this.A05 = i;
        this.A04 = i2;
        this.A03 = i3;
        int i4 = 0;
        this.A07 = (i * 3) + (Math.max(0, 2) * i2);
        this.A06 = i + (i3 << 1);
        while (true) {
            A7S[] a7sArr = this.A08;
            if (i4 < a7sArr.length) {
                int i5 = this.A05;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
                shapeDrawable.setIntrinsicHeight(i5);
                shapeDrawable.setIntrinsicWidth(i5);
                a7sArr[i4] = new A7S(shapeDrawable);
                i4++;
            } else {
                return;
            }
        }
    }

    public final int getIntrinsicHeight() {
        return this.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A07;
    }

    public final int getMinimumHeight() {
        return this.A03;
    }

    public final int getMinimumWidth() {
        return this.A07;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        float f;
        super.setBounds(i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.A02 != i5 || this.A01 != i6) {
            this.A02 = i5;
            this.A01 = i6;
            int i7 = this.A07;
            float f2 = 1.0f;
            if (i7 <= i5) {
                f = 1.0f;
            } else {
                f = ((float) i5) / ((float) i7);
            }
            int i8 = this.A05;
            if (i8 > i6) {
                f2 = ((float) i6) / ((float) i8);
            }
            this.A00 = Math.min(f, f2);
            A01(i5, i6);
        }
    }
}
