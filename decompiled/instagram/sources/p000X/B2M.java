package p000X;

import android.view.View;

/* renamed from: X.B2M */
public final class B2M implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ B2U A01;

    public B2M(B2U b2u, View view) {
        this.A01 = b2u;
        this.A00 = view;
    }

    public final void run() {
        if (this.A00.getVisibility() != 0) {
            this.A00.setVisibility(0);
        }
    }
}
