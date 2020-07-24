package p000X;

import android.widget.AbsListView;

/* renamed from: X.1Ua  reason: invalid class name and case insensitive filesystem */
public final class C30491Ua implements AbsListView.OnScrollListener {
    public final /* synthetic */ AnonymousClass1UY A00;

    public C30491Ua(AnonymousClass1UY r1) {
        this.A00 = r1;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C476324u r1;
        int A03 = AnonymousClass0Z0.A03(-1424301326);
        AnonymousClass1UY r12 = this.A00;
        if (!r12.A0C && (r1 = r12.A06) != null) {
            r1.A0B(Constants.ZERO);
        }
        AnonymousClass0Z0.A0A(900236439, A03);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = AnonymousClass0Z0.A03(206671315);
        AnonymousClass1UY r1 = this.A00;
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        r1.A0C = z;
        AnonymousClass0Z0.A0A(-525714258, A03);
    }
}
