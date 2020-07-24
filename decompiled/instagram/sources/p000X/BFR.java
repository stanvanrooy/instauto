package p000X;

import java.util.concurrent.Executor;

/* renamed from: X.BFR */
public final class BFR implements BFY {
    public final BFX A00;
    public final Object A01 = new Object();
    public final Executor A02;

    public BFR(Executor executor, BFX bfx) {
        this.A02 = executor;
        this.A00 = bfx;
    }

    public final void A2C(BFP bfp) {
        if (!bfp.A06()) {
            synchronized (this.A01) {
                if (this.A00 != null) {
                    AnonymousClass0Z9.A03(this.A02, new BFS(this, bfp), -989183622);
                }
            }
        }
    }
}
