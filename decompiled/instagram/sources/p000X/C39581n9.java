package p000X;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;

/* renamed from: X.1n9  reason: invalid class name and case insensitive filesystem */
public final class C39581n9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C39571n8 A00;

    public C39581n9(C39571n8 r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (WeakReference weakReference : this.A00.A04) {
            if (!(this.A00.A03 == Constants.ZERO || weakReference == null || weakReference.get() == null)) {
                ((C32571bU) weakReference.get()).B3g(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }
    }
}
