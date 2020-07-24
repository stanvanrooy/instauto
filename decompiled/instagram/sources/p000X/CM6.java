package p000X;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.instagram.common.p004ui.text.AlternatingTextView;

/* renamed from: X.CM6 */
public final class CM6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AlternatingTextView A01;

    public CM6(AlternatingTextView alternatingTextView, int i) {
        this.A01 = alternatingTextView;
        this.A00 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.setClipBounds(new Rect(0, 0, ((Integer) valueAnimator.getAnimatedValue()).intValue(), this.A00));
    }
}
