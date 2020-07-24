package p000X;

/* renamed from: X.C5R */
public final class C5R implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C4n A01;

    public C5R(C4n c4n, int i) {
        this.A01 = c4n;
        this.A00 = i;
    }

    public final void run() {
        this.A01.A08.setTextTip(this.A00);
    }
}
