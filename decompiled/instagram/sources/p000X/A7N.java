package p000X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.A7N */
public final class A7N extends Animation {
    public final /* synthetic */ SwipeRefreshLayout A00;

    public A7N(SwipeRefreshLayout swipeRefreshLayout) {
        this.A00 = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.A00.setAnimationProgress(f);
    }
}
