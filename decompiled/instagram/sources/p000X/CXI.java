package p000X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.CXI */
public final class CXI extends AnimatorListenerAdapter {
    public final /* synthetic */ C27933CWv A00;

    public CXI(C27933CWv cWv) {
        this.A00 = cWv;
    }

    public final void onAnimationEnd(Animator animator) {
        C27933CWv cWv = this.A00;
        if (cWv.A06.equals(Constants.ONE)) {
            cWv.A03.setVisibility(4);
        }
    }

    public final void onAnimationStart(Animator animator) {
        C27933CWv cWv = this.A00;
        if (cWv.A06.equals(Constants.ZERO)) {
            cWv.A03.setVisibility(0);
        }
    }
}
