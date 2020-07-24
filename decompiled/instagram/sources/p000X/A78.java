package p000X;

import android.view.View;
import android.view.ViewStub;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.C0003R;

/* renamed from: X.A78 */
public final class A78 implements AnonymousClass1XN {
    public SwipeRefreshLayout A00;

    public final void AC3() {
        AnonymousClass0a4.A07(this.A00, "SwipeRefreshLayout not found when disabling refresh.");
        this.A00.setEnabled(false);
    }

    public final void AD3() {
        AnonymousClass0a4.A07(this.A00, "SwipeRefreshLayout not found when enabling refresh.");
        this.A00.setEnabled(true);
    }

    public final boolean AgL() {
        AnonymousClass0a4.A07(this.A00, "SwipeRefreshLayout not found when checking is loading.");
        return this.A00.A0H;
    }

    public final void BlL(int i) {
        AnonymousClass0a4.A07(this.A00, "SwipeRefreshLayout not found when setting top offset.");
        if (i != 0) {
            this.A00.A07(0, (i / 3) + i);
            this.A00.setSlingshotDistance(i);
        }
    }

    public final void setIsLoading(boolean z) {
        this.A00.setRefreshing(z);
    }

    public A78(View view, C42741tA r5) {
        ViewStub viewStub = (ViewStub) view.findViewById(C0003R.C0005id.swiperefreshlayout_stub);
        if (viewStub != null) {
            viewStub.inflate();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(C0003R.C0005id.swipe_refresh);
        this.A00 = swipeRefreshLayout;
        AnonymousClass0a4.A07(swipeRefreshLayout, AnonymousClass000.A0E("SwipeRefreshLayout not found in view: ", view.getClass().getSimpleName()));
        this.A00.setVisibility(0);
        this.A00.setOnRefreshListener(new A79(this, r5));
    }
}
