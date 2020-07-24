package p000X;

import android.animation.ValueAnimator;
import com.instagram.p009ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.1qy  reason: invalid class name and case insensitive filesystem */
public final class C41811qy implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ PulsingMultiImageView A00;

    public C41811qy(PulsingMultiImageView pulsingMultiImageView) {
        this.A00 = pulsingMultiImageView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.invalidate();
    }
}
