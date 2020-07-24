package p000X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.B7G */
public final class B7G extends AnimatorListenerAdapter {
    public final /* synthetic */ B7F A00;

    public B7G(B7F b7f) {
        this.A00 = b7f;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A00.removeAllViews();
        ViewParent parent = this.A00.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.A00);
        }
    }
}
