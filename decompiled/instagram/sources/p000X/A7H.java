package p000X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.A7H */
public final class A7H extends Animation {
    public final /* synthetic */ SwipeRefreshLayout A00;

    public A7H(SwipeRefreshLayout swipeRefreshLayout) {
        this.A00 = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        int i;
        SwipeRefreshLayout swipeRefreshLayout = this.A00;
        if (!swipeRefreshLayout.A05) {
            i = swipeRefreshLayout.A02 - Math.abs(swipeRefreshLayout.A0A);
        } else {
            i = swipeRefreshLayout.A02;
        }
        int i2 = swipeRefreshLayout.A08;
        this.A00.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (i - i2)) * f))) - swipeRefreshLayout.A0F.getTop());
        A7B a7b = this.A00.A0G;
        float f2 = 1.0f - f;
        A7C a7c = a7b.A05;
        if (f2 != a7c.A00) {
            a7c.A00 = f2;
        }
        a7b.invalidateSelf();
    }
}
