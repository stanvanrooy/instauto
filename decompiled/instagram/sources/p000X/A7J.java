package p000X;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.A7J */
public final class A7J implements Animation.AnimationListener {
    public final /* synthetic */ SwipeRefreshLayout A00;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public A7J(SwipeRefreshLayout swipeRefreshLayout) {
        this.A00 = swipeRefreshLayout;
    }

    public final void onAnimationEnd(Animation animation) {
        A7U a7u;
        SwipeRefreshLayout swipeRefreshLayout = this.A00;
        if (swipeRefreshLayout.A0H) {
            swipeRefreshLayout.A0G.setAlpha(255);
            this.A00.A0G.start();
            SwipeRefreshLayout swipeRefreshLayout2 = this.A00;
            if (swipeRefreshLayout2.A04 && (a7u = swipeRefreshLayout2.A03) != null) {
                a7u.BHw();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = this.A00;
            swipeRefreshLayout3.A00 = swipeRefreshLayout3.A0F.getTop();
            return;
        }
        swipeRefreshLayout.A06();
    }
}
