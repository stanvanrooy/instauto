package p000X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.instagram.p009ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.1qz  reason: invalid class name and case insensitive filesystem */
public final class C41821qz extends AnimatorListenerAdapter {
    public final /* synthetic */ PulsingMultiImageView A00;

    public C41821qz(PulsingMultiImageView pulsingMultiImageView) {
        this.A00 = pulsingMultiImageView;
    }

    public final void onAnimationEnd(Animator animator) {
        PulsingMultiImageView pulsingMultiImageView = this.A00;
        if (!pulsingMultiImageView.A05) {
            return;
        }
        if (((Float) pulsingMultiImageView.A07.getAnimatedValue()).floatValue() == 1.0f) {
            PulsingMultiImageView.A02(this.A00);
            this.A00.A06.start();
            return;
        }
        PulsingMultiImageView pulsingMultiImageView2 = this.A00;
        pulsingMultiImageView2.A03 = null;
        pulsingMultiImageView2.A02 = null;
        AnonymousClass0ZA.A0B(pulsingMultiImageView2.A08, 1);
    }
}
