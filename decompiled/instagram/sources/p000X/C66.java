package p000X;

import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* renamed from: X.C66 */
public final class C66 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C27265C5y A00;

    public C66(C27265C5y c5y) {
        this.A00 = c5y;
    }

    public final void onGlobalLayout() {
        ScrollView scrollView = this.A00.A0M.A02;
        scrollView.smoothScrollTo(0, scrollView.getChildAt(0).getBottom());
        this.A00.A06.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
