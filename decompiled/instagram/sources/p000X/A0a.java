package p000X;

import android.view.animation.Animation;

/* renamed from: X.A0a */
public final class A0a implements Animation.AnimationListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ A0Z A01;

    public final void onAnimationRepeat(Animation animation) {
    }

    public A0a(A0Z a0z, int i) {
        this.A01 = a0z;
        this.A00 = i;
    }

    public final void onAnimationEnd(Animation animation) {
        this.A01.A03.remove(this.A00);
    }

    public final void onAnimationStart(Animation animation) {
        this.A01.A03.put(this.A00, (A0b) animation);
    }
}
