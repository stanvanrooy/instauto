package p000X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.AIV */
public final class AIV extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ AnonymousClass30Z A02;
    public final /* synthetic */ AnonymousClass1HD A03;
    public final /* synthetic */ AnonymousClass1AS A04;

    public AIV(ViewGroup viewGroup, View view, AnonymousClass1HD r3, AnonymousClass1AS r4, AnonymousClass30Z r5) {
        this.A01 = viewGroup;
        this.A00 = view;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r5;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A01.endViewTransition(this.A00);
        AnonymousClass1HD r2 = this.A03;
        Animator animator2 = r2.getAnimator();
        r2.setAnimator((Animator) null);
        if (animator2 != null && this.A01.indexOfChild(this.A00) < 0) {
            this.A04.AxV(this.A03, this.A02);
        }
    }
}
