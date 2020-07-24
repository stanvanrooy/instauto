package p000X;

import android.view.animation.Animation;

/* renamed from: X.A97 */
public final class A97 implements Animation.AnimationListener {
    public final /* synthetic */ A8j A00;
    public final /* synthetic */ A0Z A01;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public A97(A0Z a0z, A8j a8j) {
        this.A01 = a0z;
        this.A00 = a8j;
    }

    public final void onAnimationEnd(Animation animation) {
        this.A00.A00();
    }
}
