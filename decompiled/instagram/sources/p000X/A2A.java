package p000X;

import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;

/* renamed from: X.A2A */
public final class A2A implements A7U {
    public final /* synthetic */ C23053A3d A00;
    public final /* synthetic */ C23085A5y A01;
    public final /* synthetic */ SwipeRefreshLayoutManager A02;

    public A2A(SwipeRefreshLayoutManager swipeRefreshLayoutManager, C23053A3d a3d, C23085A5y a5y) {
        this.A02 = swipeRefreshLayoutManager;
        this.A00 = a3d;
        this.A01 = a5y;
    }

    public final void BHw() {
        A9C A022 = A3W.A02(this.A00, this.A01.getId());
        if (A022 != null) {
            A022.ACG(new A2C(this.A01.getId()));
        }
    }
}
