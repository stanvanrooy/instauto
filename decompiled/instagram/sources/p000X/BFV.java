package p000X;

/* renamed from: X.BFV */
public final class BFV implements Runnable {
    public final /* synthetic */ BFP A00;
    public final /* synthetic */ BFT A01;

    public BFV(BFT bft, BFP bfp) {
        this.A01 = bft;
        this.A00 = bfp;
    }

    public final void run() {
        synchronized (this.A01.A01) {
            BFW bfw = this.A01.A00;
            if (bfw != null) {
                bfw.AxZ(this.A00);
            }
        }
    }
}
