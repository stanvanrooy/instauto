package p000X;

import java.util.concurrent.Executor;

/* renamed from: X.BFQ */
public final class BFQ implements BFY {
    public final C25346BFi A00;
    public final Object A01 = new Object();
    public final Executor A02;

    public BFQ(Executor executor, C25346BFi bFi) {
        this.A02 = executor;
        this.A00 = bFi;
    }

    public final void A2C(BFP bfp) {
        if (bfp.A06()) {
            synchronized (this.A01) {
                if (this.A00 != null) {
                    AnonymousClass0Z9.A03(this.A02, new BFU(this, bfp), 694376672);
                }
            }
        }
    }
}
