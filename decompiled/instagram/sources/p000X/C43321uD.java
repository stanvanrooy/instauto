package p000X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.1uD  reason: invalid class name and case insensitive filesystem */
public final class C43321uD extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ C31321Xp A02;
    public final /* synthetic */ AnonymousClass1ZK A03;

    public C43321uD(C31321Xp r1, AnonymousClass1ZK r2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = viewPropertyAnimator;
        this.A00 = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A01.setListener((Animator.AnimatorListener) null);
        this.A00.setAlpha(1.0f);
        this.A02.A0S(this.A03);
        this.A02.A06.remove(this.A03);
        this.A02.A0X();
    }

    public final void onAnimationStart(Animator animator) {
        this.A02.A0O(this.A03);
    }
}
