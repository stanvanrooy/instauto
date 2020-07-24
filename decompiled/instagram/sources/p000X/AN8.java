package p000X;

import android.os.Bundle;

/* renamed from: X.AN8 */
public final /* synthetic */ class AN8 implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ AN2 A01;

    public /* synthetic */ AN8(AN2 an2, Bundle bundle) {
        this.A01 = an2;
        this.A00 = bundle;
    }

    public final void run() {
        this.A01.A01(this.A00);
    }
}
