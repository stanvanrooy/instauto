package p000X;

import android.widget.AbsListView;

/* renamed from: X.1tJ  reason: invalid class name and case insensitive filesystem */
public final class C42821tJ implements AbsListView.OnScrollListener {
    public final /* synthetic */ C42811tI A00;

    public C42821tJ(C42811tI r1) {
        this.A00 = r1;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A03 = AnonymousClass0Z0.A03(1515084870);
        for (int size = this.A00.A03.size() - 1; size >= 0; size--) {
            ((C256219o) this.A00.A03.get(size)).onScroll(absListView, i, i2, i3);
        }
        AnonymousClass0Z0.A0A(-37254775, A03);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = AnonymousClass0Z0.A03(1071933151);
        for (int size = this.A00.A03.size() - 1; size >= 0; size--) {
            ((C256219o) this.A00.A03.get(size)).onScrollStateChanged(absListView, i);
        }
        AnonymousClass0Z0.A0A(-1935348772, A03);
    }
}
