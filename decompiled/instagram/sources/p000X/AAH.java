package p000X;

import android.animation.ValueAnimator;

/* renamed from: X.AAH */
public final class AAH implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AA2 A00;

    public AAH(AA2 aa2) {
        this.A00 = aa2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.scrollTo(((Integer) valueAnimator.getAnimatedValue("scrollX")).intValue(), ((Integer) valueAnimator.getAnimatedValue("scrollY")).intValue());
    }
}
