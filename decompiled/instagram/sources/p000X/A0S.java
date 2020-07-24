package p000X;

import android.graphics.Paint;
import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.A0S */
public final class A0S implements Animation.AnimationListener {
    public boolean A00 = false;
    public final View A01;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        if (this.A00) {
            this.A01.setLayerType(0, (Paint) null);
        }
    }

    public final void onAnimationStart(Animation animation) {
        if (this.A01.hasOverlappingRendering() && this.A01.getLayerType() == 0) {
            this.A00 = true;
            this.A01.setLayerType(2, (Paint) null);
        }
    }

    public A0S(View view) {
        this.A01 = view;
    }
}
