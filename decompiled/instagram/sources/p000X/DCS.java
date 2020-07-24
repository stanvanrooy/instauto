package p000X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.Choreographer;

/* renamed from: X.DCS */
public final class DCS extends DCT implements Choreographer.FrameCallback {
    public static Choreographer A00;

    public final void doFrame(long j) {
        float f;
        long j2 = this.A07;
        if (j2 > 0) {
            f = (float) (j - j2);
        } else {
            f = 1.667E7f;
        }
        if (this.A09) {
            float f2 = (f + (this.A02 * 24.0f)) / 25.0f;
            this.A02 = f2;
            float f3 = this.A04;
            float f4 = f3 + ((f2 - f3) * 0.1f);
            this.A04 = f4;
            f = f4;
        }
        double d = (double) this.A03;
        double d2 = (((double) f) / 1.0E9d) / ((double) this.A0B);
        boolean z = false;
        if (this.A00 < this.A05) {
            z = true;
        }
        int i = 1;
        if (z) {
            i = -1;
        }
        float f5 = (float) (d + (d2 * ((double) i)));
        this.A03 = f5;
        float interpolation = this.A08.getInterpolation(f5);
        this.A01 = interpolation;
        this.A07 = j;
        float f6 = this.A00;
        float f7 = this.A05;
        boolean z2 = false;
        if (f6 < f7) {
            z2 = true;
        }
        boolean z3 = false;
        if (!z2 ? interpolation > f6 || this.A03 > f6 : interpolation < f6 || this.A03 < f6) {
            z3 = true;
        }
        if (z3) {
            float f8 = interpolation - (f6 - f7);
            this.A01 = f8;
            this.A03 = f8;
            int i2 = this.A06 - 1;
            this.A06 = i2;
            if (i2 == 0) {
                pause();
                return;
            }
            for (Animator.AnimatorListener onAnimationRepeat : this.A0C) {
                onAnimationRepeat.onAnimationRepeat(this);
            }
        }
        A01();
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.A0D) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public DCS(float f) {
        super(f);
    }
}
