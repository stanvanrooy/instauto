package p000X;

import android.animation.Animator;

/* renamed from: X.ALI */
public final class ALI implements Animator.AnimatorListener {
    public final /* synthetic */ AL2 A00;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public ALI(AL2 al2) {
        this.A00 = al2;
    }

    public final void onAnimationEnd(Animator animator) {
        AL2 al2 = this.A00;
        al2.A01 = true;
        al2.A05.dismiss();
    }
}
