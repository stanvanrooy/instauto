package p000X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1Xy  reason: invalid class name and case insensitive filesystem */
public final class C31371Xy implements Runnable {
    public final /* synthetic */ RecyclerView A00;

    public C31371Xy(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public final void run() {
        C31341Xr r0 = this.A00.A0K;
        if (r0 != null) {
            r0.A0I();
        }
        this.A00.A08 = false;
    }
}
