package p000X;

import android.animation.Animator;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: X.AMM */
public final class AMM implements View.OnFocusChangeListener {
    public final /* synthetic */ AMG A00;

    public AMM(AMG amg) {
        this.A00 = amg;
    }

    public final void onFocusChange(View view, boolean z) {
        int i;
        Animator A002;
        int paddingRight;
        AMD amd = this.A00.A02;
        if (amd != null) {
            AMG amg = amd.A0K;
            if (z) {
                AMN amn = amg.A06;
                C23428AMb aMb = new C23428AMb(amg);
                int width = amn.A01.getWidth();
                int width2 = (amn.A02.getWidth() - amn.A02.getPaddingLeft()) - amn.A02.getPaddingRight();
                if (amn.A03) {
                    paddingRight = amn.A02.getPaddingLeft();
                } else {
                    paddingRight = amn.A02.getPaddingRight();
                }
                A002 = AMN.A00(amn, width, width2, 0, paddingRight, aMb);
            } else {
                AMN amn2 = amg.A06;
                C23429AMc aMc = new C23429AMc(amg);
                int width3 = amn2.A01.getWidth();
                int width4 = (amn2.A02.getWidth() - amn2.A02.getPaddingLeft()) - amn2.A02.getPaddingRight();
                amn2.A00.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredWidth = width4 - amn2.A00.getMeasuredWidth();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) amn2.A01.getLayoutParams();
                if (amn2.A03) {
                    i = layoutParams.leftMargin;
                } else {
                    i = layoutParams.rightMargin;
                }
                A002 = AMN.A00(amn2, width3, measuredWidth, i, 0, aMc);
            }
            Animator animator = amg.A00;
            if (animator != null) {
                animator.cancel();
            }
            amg.A00 = A002;
            A002.start();
        }
    }
}
