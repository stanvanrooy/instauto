package p000X;

/* renamed from: X.BFS */
public final class BFS implements Runnable {
    public final /* synthetic */ BFP A00;
    public final /* synthetic */ BFR A01;

    public BFS(BFR bfr, BFP bfp) {
        this.A01 = bfr;
        this.A00 = bfp;
    }

    public final void run() {
        synchronized (this.A01.A01) {
            BFX bfx = this.A01.A00;
            if (bfx != null) {
                bfx.B42(this.A00.A04());
            }
        }
    }
}
