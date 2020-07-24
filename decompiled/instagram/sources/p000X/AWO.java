package p000X;

/* renamed from: X.AWO */
public final class AWO implements Runnable {
    public final /* synthetic */ AWN A00;
    public final /* synthetic */ Exception A01;

    public AWO(AWN awn, Exception exc) {
        this.A00 = awn;
        this.A01 = exc;
    }

    public final void run() {
        this.A00.A03(this.A01);
    }
}
