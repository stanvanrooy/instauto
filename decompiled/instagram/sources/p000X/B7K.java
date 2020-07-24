package p000X;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.B7K */
public final class B7K implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ B7J A01;
    public final /* synthetic */ Object A02;

    public B7K(B7J b7j, int i, Object obj) {
        this.A01 = b7j;
        this.A00 = i;
        this.A02 = obj;
    }

    public final void run() {
        B7J b7j = this.A01;
        if (b7j.A01 == null) {
            b7j.A01 = (Set) b7j.A03.get();
        }
        for (BTC btc : b7j.A01) {
            if (btc.A03(this.A00, this.A02)) {
                int i = this.A00;
                Object obj = this.A02;
                B7J b7j2 = this.A01;
                if (b7j2.A02 == null) {
                    b7j2.A02 = (ScheduledExecutorService) b7j2.A05.get();
                }
                btc.A02(i, obj, b7j2.A02);
            }
        }
    }
}
