package p000X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.1r4  reason: invalid class name and case insensitive filesystem */
public final class C41871r4 extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ C31321Xp A02;
    public final /* synthetic */ AnonymousClass1ZK A03;

    public C41871r4(C31321Xp r1, AnonymousClass1ZK r2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = view;
        this.A01 = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.A00.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.A01.setListener((Animator.AnimatorListener) null);
        this.A02.A0P(this.A03);
        this.A02.A03.remove(this.A03);
        this.A02.A0X();
    }

    public final void onAnimationStart(Animator animator) {
        this.A02.A0L(this.A03);
    }
}
