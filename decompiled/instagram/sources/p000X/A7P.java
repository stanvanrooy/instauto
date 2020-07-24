package p000X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.A7P */
public final class A7P extends Animation {
    public final /* synthetic */ SwipeRefreshLayout A00;

    public A7P(SwipeRefreshLayout swipeRefreshLayout) {
        this.A00 = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.A00;
        int i = swipeRefreshLayout.A08;
        swipeRefreshLayout.setTargetOffsetTopAndBottom((i + ((int) (((float) (swipeRefreshLayout.A0A - i)) * f))) - swipeRefreshLayout.A0F.getTop());
    }
}
