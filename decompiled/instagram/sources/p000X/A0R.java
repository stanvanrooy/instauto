package p000X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.A0R */
public final class A0R extends Animation {
    public final float A00;
    public final float A01;
    public final View A02;

    public final boolean willChangeBounds() {
        return false;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.A02.setAlpha(this.A01 + (this.A00 * f));
    }

    public A0R(View view, float f, float f2) {
        this.A02 = view;
        this.A01 = f;
        this.A00 = f2 - f;
        setAnimationListener(new A0S(view));
    }
}
