package p000X;

import android.animation.ValueAnimator;

/* renamed from: X.AAG */
public final class AAG implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AA1 A00;

    public AAG(AA1 aa1) {
        this.A00 = aa1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.scrollTo(((Integer) valueAnimator.getAnimatedValue("scrollX")).intValue(), ((Integer) valueAnimator.getAnimatedValue("scrollY")).intValue());
    }
}
