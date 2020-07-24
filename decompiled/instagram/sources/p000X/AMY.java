package p000X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.LinearLayout;

/* renamed from: X.AMY */
public final class AMY extends AnimatorListenerAdapter {
    public final /* synthetic */ ANH A00;
    public final /* synthetic */ AMN A01;

    public AMY(AMN amn, ANH anh) {
        this.A01 = amn;
        this.A00 = anh;
    }

    public final void onAnimationEnd(Animator animator) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A01.A01.getLayoutParams();
        layoutParams.weight = 1.0f;
        layoutParams.width = 0;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        this.A01.A01.setLayoutParams(layoutParams);
        this.A00.B2L();
    }

    public final void onAnimationStart(Animator animator) {
        this.A00.onStart();
    }
}
