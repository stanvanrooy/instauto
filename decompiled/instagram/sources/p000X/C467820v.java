package p000X;

import android.animation.ValueAnimator;

/* renamed from: X.20v  reason: invalid class name and case insensitive filesystem */
public final class C467820v implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C467620t A00;

    public C467820v(C467620t r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.A01 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
