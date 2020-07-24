package p000X;

/* renamed from: X.AXB */
public final class AXB implements Runnable {
    public final /* synthetic */ AWN A00;
    public final /* synthetic */ AXA A01;

    public AXB(AXA axa, AWN awn) {
        this.A01 = axa;
        this.A00 = awn;
    }

    public final void run() {
        this.A01.A02.release();
        AWN.A00(this.A00);
    }
}
