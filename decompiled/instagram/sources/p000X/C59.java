package p000X;

import android.animation.Animator;

/* renamed from: X.C59 */
public final class C59 implements Animator.AnimatorListener {
    public final /* synthetic */ C4n A00;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public C59(C4n c4n) {
        this.A00 = c4n;
    }

    public final void onAnimationEnd(Animator animator) {
        C27252C5e c5e = (C27252C5e) this.A00.A00.get();
        if (c5e != null) {
            c5e.A6M(false);
        }
    }
}
