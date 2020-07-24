package p000X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1Xn  reason: invalid class name and case insensitive filesystem */
public final class C31311Xn implements Runnable {
    public final /* synthetic */ RecyclerView A00;

    public C31311Xn(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView.A0W && !recyclerView.isLayoutRequested()) {
            RecyclerView recyclerView2 = this.A00;
            if (!recyclerView2.A03) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.A06) {
                recyclerView2.A07 = true;
            } else {
                recyclerView2.A0S();
            }
        }
    }
}
