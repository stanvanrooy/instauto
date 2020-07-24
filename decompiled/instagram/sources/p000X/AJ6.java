package p000X;

import android.view.animation.Animation;

/* renamed from: X.AJ6 */
public final class AJ6 implements Animation.AnimationListener {
    public final /* synthetic */ AJ5 A00;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public AJ6(AJ5 aj5) {
        this.A00 = aj5;
    }

    public final void onAnimationEnd(Animation animation) {
        AJ0.A04(this.A00.A00.A02.A01(), new AJ4(this));
    }
}
