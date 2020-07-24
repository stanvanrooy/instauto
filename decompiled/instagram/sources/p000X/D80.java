package p000X;

import android.view.Surface;

/* renamed from: X.D80 */
public final /* synthetic */ class D80 implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ D7B A01;

    public /* synthetic */ D80(D7B d7b, Surface surface) {
        this.A01 = d7b;
        this.A00 = surface;
    }

    public final void run() {
        D7B d7b = this.A01;
        d7b.A01.BId(this.A00);
    }
}
