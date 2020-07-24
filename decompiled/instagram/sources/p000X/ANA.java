package p000X;

import android.os.Bundle;

/* renamed from: X.ANA */
public final /* synthetic */ class ANA implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ AN2 A01;

    public /* synthetic */ ANA(AN2 an2, Bundle bundle) {
        this.A01 = an2;
        this.A00 = bundle;
    }

    public final void run() {
        this.A01.A02(this.A00);
    }
}
