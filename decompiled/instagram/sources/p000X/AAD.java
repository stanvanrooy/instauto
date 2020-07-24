package p000X;

import android.animation.Animator;

/* renamed from: X.AAD */
public final class AAD implements Animator.AnimatorListener {
    public final /* synthetic */ AA1 A00;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public AAD(AA1 aa1) {
        this.A00 = aa1;
    }

    public final void onAnimationEnd(Animator animator) {
        AA1 aa1 = this.A00;
        aa1.A00 = -1;
        aa1.A01 = -1;
        aa1.A03 = null;
        AA1.A06(aa1, aa1.getScrollX(), aa1.getScrollY());
    }
}
