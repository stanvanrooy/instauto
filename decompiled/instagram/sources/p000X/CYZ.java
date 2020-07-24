package p000X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.CYZ */
public final class CYZ extends AnimatorListenerAdapter {
    public final /* synthetic */ CYX A00;

    public CYZ(CYX cyx) {
        this.A00 = cyx;
    }

    public final void onAnimationEnd(Animator animator) {
        CYX cyx = this.A00;
        if (cyx.A02.equals(Constants.ONE)) {
            cyx.A01.setVisibility(8);
            this.A00.A03 = true;
        }
    }

    public final void onAnimationStart(Animator animator) {
        CYX cyx = this.A00;
        if (cyx.A02.equals(Constants.ZERO)) {
            cyx.A01.setVisibility(0);
            this.A00.A03 = false;
        }
    }
}
