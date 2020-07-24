package p000X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.DR6 */
public final class DR6 extends C27821Ji {
    public final int A00 = 1;
    public final C30123DRf A01;
    public final AnonymousClass1K2 A02;
    public final AtomicInteger A03;

    public DR6(AnonymousClass1K2 r2, C30123DRf dRf) {
        this.A02 = r2;
        this.A01 = dRf;
        this.A03 = new AtomicInteger();
    }

    public final void A03(C27841Jk r3) {
        this.A02.Bqn(r3);
        if (this.A03.incrementAndGet() == this.A00) {
            this.A02.A04(this.A01);
        }
    }
}
