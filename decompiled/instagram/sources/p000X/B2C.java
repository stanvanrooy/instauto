package p000X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.B2C */
public final class B2C implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ B22 A01;
    public final /* synthetic */ B2U A02;
    public final /* synthetic */ AtomicBoolean A03;

    public B2C(B2U b2u, View view, AtomicBoolean atomicBoolean, B22 b22) {
        this.A02 = b2u;
        this.A00 = view;
        this.A03 = atomicBoolean;
        this.A01 = b22;
    }

    public final void onGlobalLayout() {
        if (((double) (this.A00.getRootView().getHeight() - this.A00.getHeight())) > ((double) this.A00.getRootView().getHeight()) * 0.15d) {
            this.A03.set(true);
        } else {
            this.A03.set(false);
        }
        this.A01.A00();
    }
}
