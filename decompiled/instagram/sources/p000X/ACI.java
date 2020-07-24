package p000X;

/* renamed from: X.ACI */
public final class ACI implements Runnable {
    public final /* synthetic */ ACK A00;
    public final /* synthetic */ Runnable A01;

    public ACI(ACK ack, Runnable runnable) {
        this.A00 = ack;
        this.A01 = runnable;
    }

    public final void run() {
        synchronized (ACK.class) {
            if (this.A00.A05 == null) {
                ACK ack = this.A00;
                C228039ra.A00();
                if (ACJ.A01 == null) {
                    ACJ.A01 = new ACJ();
                }
                ack.A05 = ACJ.A01;
            }
        }
        Runnable runnable = this.A01;
        if (runnable != null) {
            runnable.run();
        }
    }
}
