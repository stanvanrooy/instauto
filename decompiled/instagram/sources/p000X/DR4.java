package p000X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.DR4 */
public final class DR4 extends AtomicInteger implements C27711Ix {
    public Object A00;
    public final C27841Jk A01;
    public final C30109DQr A02;
    public volatile boolean A03;

    public final void dispose() {
        if (!this.A03) {
            this.A03 = true;
            this.A02.A00(this);
        }
    }

    public DR4(C30109DQr dQr, C27841Jk r2) {
        this.A02 = dQr;
        this.A01 = r2;
    }
}
