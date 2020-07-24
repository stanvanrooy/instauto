package p000X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.CIY */
public final class CIY extends AnimatorListenerAdapter {
    public final /* synthetic */ CIT A00;

    public CIY(CIT cit) {
        this.A00 = cit;
    }

    public final void onAnimationEnd(Animator animator) {
        CIT cit = this.A00;
        cit.A01 = cit.A02;
    }
}
