package p000X;

import android.animation.ValueAnimator;

/* renamed from: X.C53 */
public final class C53 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C27247C4x A00;

    public C53(C27247C4x c4x) {
        this.A00 = c4x;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.A00.A09.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
