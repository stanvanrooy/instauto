package p000X;

import android.animation.ValueAnimator;

/* renamed from: X.CIX */
public final class CIX implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CIT A01;

    public CIX(CIT cit, int i) {
        this.A01 = cit;
        this.A00 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        CIT cit = this.A01;
        cit.A01(cit.A01, this.A00, valueAnimator.getAnimatedFraction());
    }
}
