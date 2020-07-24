package p000X;

import android.animation.ValueAnimator;
import com.instagram.p009ui.widget.segmentedprogressbar.SegmentedProgressBar;

/* renamed from: X.1eR  reason: invalid class name and case insensitive filesystem */
public final class C34291eR implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ SegmentedProgressBar A00;

    public C34291eR(SegmentedProgressBar segmentedProgressBar) {
        this.A00 = segmentedProgressBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.invalidate();
    }
}
