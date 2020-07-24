package p000X;

/* renamed from: X.ACM */
public final class ACM implements Runnable {
    public final /* synthetic */ ACK A00;

    public ACM(ACK ack) {
        this.A00 = ack;
    }

    public final void run() {
        ACK ack = this.A00;
        ack.A05.A00(ack.A02);
        ack.A01 = true;
    }
}
