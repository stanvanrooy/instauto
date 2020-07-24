package p000X;

import android.animation.ValueAnimator;

/* renamed from: X.A7K */
public final class A7K implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ A7C A00;
    public final /* synthetic */ A7B A01;

    public A7K(A7B a7b, A7C a7c) {
        this.A01 = a7b;
        this.A00 = a7c;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        A7B a7b = this.A01;
        A7C a7c = this.A00;
        a7b.A01(floatValue, a7c);
        a7b.A02(floatValue, a7c, false);
        this.A01.invalidateSelf();
    }
}
