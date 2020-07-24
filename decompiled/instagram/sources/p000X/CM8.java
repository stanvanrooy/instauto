package p000X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.instagram.common.p004ui.text.AlternatingTextView;

/* renamed from: X.CM8 */
public final class CM8 extends AnimatorListenerAdapter {
    public final /* synthetic */ AlternatingTextView A00;

    public CM8(AlternatingTextView alternatingTextView) {
        this.A00 = alternatingTextView;
    }

    public final void onAnimationEnd(Animator animator) {
        AlternatingTextView alternatingTextView = this.A00;
        if (alternatingTextView.A03) {
            AlternatingTextView.A00(alternatingTextView);
        }
    }
}
