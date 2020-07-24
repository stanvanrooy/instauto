package p000X;

import android.animation.Animator;

/* renamed from: X.AAE */
public final class AAE implements Animator.AnimatorListener {
    public final /* synthetic */ AA2 A00;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public AAE(AA2 aa2) {
        this.A00 = aa2;
    }

    public final void onAnimationEnd(Animator animator) {
        AA2 aa2 = this.A00;
        aa2.A00 = -1;
        aa2.A01 = -1;
        aa2.A03 = null;
        AA2.A05(aa2, aa2.getScrollX(), aa2.getScrollY());
    }
}
