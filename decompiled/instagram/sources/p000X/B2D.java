package p000X;

/* renamed from: X.B2D */
public final class B2D implements Runnable {
    public final /* synthetic */ C25117B1n A00;
    public final /* synthetic */ String A01;

    public B2D(C25117B1n b1n, String str) {
        this.A00 = b1n;
        this.A01 = str;
    }

    public final void run() {
        synchronized (this.A00.A05) {
            for (C25126B2c BTo : this.A00.A05) {
                BTo.BTo(this.A01);
            }
        }
    }
}
