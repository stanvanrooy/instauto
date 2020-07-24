package p000X;

import android.widget.AbsListView;

/* renamed from: X.1tg  reason: invalid class name and case insensitive filesystem */
public final class C43051tg implements Runnable {
    public final /* synthetic */ AbsListView A00;
    public final /* synthetic */ AnonymousClass1HD A01;

    public C43051tg(AnonymousClass1HD r1, AbsListView absListView) {
        this.A01 = r1;
        this.A00 = absListView;
    }

    public final void run() {
        if (this.A01.mView != null) {
            this.A00.smoothScrollBy(0, 0);
            this.A00.setSelection(0);
        }
    }
}
