package p000X;

/* renamed from: X.BFU */
public final class BFU implements Runnable {
    public final /* synthetic */ BFP A00;
    public final /* synthetic */ BFQ A01;

    public BFU(BFQ bfq, BFP bfp) {
        this.A01 = bfq;
        this.A00 = bfp;
    }

    public final void run() {
        synchronized (this.A01.A01) {
            C25346BFi bFi = this.A01.A00;
            if (bFi != null) {
                bFi.BPi(this.A00.A05());
            }
        }
    }
}
