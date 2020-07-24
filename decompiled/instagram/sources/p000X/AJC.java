package p000X;

import android.view.animation.Animation;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;

/* renamed from: X.AJC */
public final class AJC implements Animation.AnimationListener {
    public final /* synthetic */ CircularImageView A00;
    public final /* synthetic */ AJE A01;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public AJC(AJE aje, CircularImageView circularImageView) {
        this.A01 = aje;
        this.A00 = circularImageView;
    }

    public final void onAnimationEnd(Animation animation) {
        AJ0.A04(this.A00, (C476824z) null);
    }
}
