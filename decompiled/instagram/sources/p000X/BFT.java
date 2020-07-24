package p000X;

import java.util.concurrent.Executor;

/* renamed from: X.BFT */
public final class BFT implements BFY {
    public final BFW A00;
    public final Object A01 = new Object();
    public final Executor A02;

    public BFT(Executor executor, BFW bfw) {
        this.A02 = executor;
        this.A00 = bfw;
    }

    public final void A2C(BFP bfp) {
        synchronized (this.A01) {
            if (this.A00 != null) {
                AnonymousClass0Z9.A03(this.A02, new BFV(this, bfp), -746017518);
            }
        }
    }
}
