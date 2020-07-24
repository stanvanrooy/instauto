package p000X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;

/* renamed from: X.A7F */
public final class A7F extends A7E implements Animatable {
    public AnimatorSet A00;
    public boolean A01;
    public final ValueAnimator[] A02 = new ValueAnimator[3];
    public final A7V A03 = new A7V();

    public A7F(int i, int i2, int i3) {
        super(i, i2, i3);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.A01) {
            invalidateSelf();
        }
    }

    public final boolean isRunning() {
        return this.A01;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (visible) {
            if (z) {
                start();
            } else {
                stop();
                return visible;
            }
        }
        return visible;
    }
}
