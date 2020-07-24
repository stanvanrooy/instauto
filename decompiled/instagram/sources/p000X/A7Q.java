package p000X;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.A7Q */
public final class A7Q implements Animation.AnimationListener {
    public final /* synthetic */ SwipeRefreshLayout A00;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public A7Q(SwipeRefreshLayout swipeRefreshLayout) {
        this.A00 = swipeRefreshLayout;
    }

    public final void onAnimationEnd(Animation animation) {
        SwipeRefreshLayout swipeRefreshLayout = this.A00;
        A7O a7o = new A7O(swipeRefreshLayout);
        swipeRefreshLayout.A0E = a7o;
        a7o.setDuration(150);
        A7D a7d = swipeRefreshLayout.A0F;
        a7d.A00 = null;
        a7d.clearAnimation();
        swipeRefreshLayout.A0F.startAnimation(swipeRefreshLayout.A0E);
    }
}
