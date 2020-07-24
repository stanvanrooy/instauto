package p000X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.instagram.common.p004ui.text.AlternatingTextView;

/* renamed from: X.CM5 */
public final class CM5 extends AnimatorListenerAdapter {
    public final /* synthetic */ AlternatingTextView A00;

    public CM5(AlternatingTextView alternatingTextView) {
        this.A00 = alternatingTextView;
    }

    public final void onAnimationEnd(Animator animator) {
        AlternatingTextView alternatingTextView = this.A00;
        int i = alternatingTextView.A00 + 1;
        alternatingTextView.A00 = i;
        if (i == alternatingTextView.A02.size()) {
            this.A00.A00 = 0;
        }
        AlternatingTextView.A01(this.A00);
        AlternatingTextView alternatingTextView2 = this.A00;
        if (alternatingTextView2.A04) {
            AlternatingTextView.A02(alternatingTextView2, 0, 1);
        } else {
            AlternatingTextView.A03(alternatingTextView2, 0, AlternatingTextView.getMeasuredTextWidth(alternatingTextView2));
        }
        alternatingTextView2.A01.addListener(new CM8(alternatingTextView2));
        alternatingTextView2.A01.setStartDelay(0);
        alternatingTextView2.A01.start();
    }
}
