package p000X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.expanding.ExpandingListView;

/* renamed from: X.1tC  reason: invalid class name and case insensitive filesystem */
public final class C42761tC implements AnonymousClass1XN {
    public ExpandingListView A00;

    public final void BlL(int i) {
    }

    public final void AC3() {
        this.A00.AC3();
    }

    public final void AD3() {
        this.A00.AD3();
    }

    public final boolean AgL() {
        return this.A00.A05();
    }

    public final void setIsLoading(boolean z) {
        this.A00.setIsLoading(z);
    }

    public C42761tC(View view, C42741tA r5) {
        ViewStub viewStub = (ViewStub) view.findViewById(C0003R.C0005id.expandinglistview_stub);
        if (viewStub != null) {
            viewStub.inflate();
        }
        ExpandingListView expandingListView = (ExpandingListView) view.findViewById(16908298);
        this.A00 = expandingListView;
        AnonymousClass0a4.A07(expandingListView, AnonymousClass000.A0E("ExpandingListView not found in view: ", view.getClass().getSimpleName()));
        this.A00.setupAndEnableRefresh(new C42791tG(this, r5));
    }
}
