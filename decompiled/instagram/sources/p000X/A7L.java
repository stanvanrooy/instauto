package p000X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.A7L */
public final class A7L extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ SwipeRefreshLayout A02;

    public A7L(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.A02 = swipeRefreshLayout;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        A7B a7b = this.A02.A0G;
        int i = this.A01;
        a7b.setAlpha((int) (((float) i) + (((float) (this.A00 - i)) * f)));
    }
}
