package p000X;

import android.animation.Animator;

/* renamed from: X.20u  reason: invalid class name and case insensitive filesystem */
public final class C467720u implements Animator.AnimatorListener {
    public final /* synthetic */ C467620t A00;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public C467720u(C467620t r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A00.A06 = Constants.A0C;
    }

    public final void onAnimationStart(Animator animator) {
        this.A00.A06 = Constants.ONE;
    }
}
