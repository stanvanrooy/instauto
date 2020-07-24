package p000X;

import android.animation.Animator;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.A7G */
public final class A7G implements Animator.AnimatorListener {
    public final /* synthetic */ A7C A00;
    public final /* synthetic */ A7B A01;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public A7G(A7B a7b, A7C a7c) {
        this.A01 = a7b;
        this.A00 = a7c;
    }

    public final void onAnimationRepeat(Animator animator) {
        this.A01.A02(1.0f, this.A00, true);
        A7C a7c = this.A00;
        a7c.A07 = a7c.A04;
        a7c.A05 = a7c.A01;
        a7c.A06 = a7c.A03;
        a7c.A00((a7c.A0C + 1) % a7c.A0G.length);
        A7B a7b = this.A01;
        if (a7b.A01) {
            a7b.A01 = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            A7C a7c2 = this.A00;
            if (a7c2.A0F) {
                a7c2.A0F = false;
                return;
            }
            return;
        }
        a7b.A00 += 1.0f;
    }

    public final void onAnimationStart(Animator animator) {
        this.A01.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }
}
