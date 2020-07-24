package p000X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.A7O */
public final class A7O extends Animation {
    public final /* synthetic */ SwipeRefreshLayout A00;

    public A7O(SwipeRefreshLayout swipeRefreshLayout) {
        this.A00 = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.A00.setAnimationProgress(1.0f - f);
    }
}
