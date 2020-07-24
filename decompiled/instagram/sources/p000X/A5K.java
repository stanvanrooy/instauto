package p000X;

import android.animation.ValueAnimator;

/* renamed from: X.A5K */
public final class A5K implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ A5J A00;

    public A5K(A5J a5j) {
        this.A00 = a5j;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.A01.getWindow().setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
