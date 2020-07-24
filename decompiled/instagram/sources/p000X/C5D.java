package p000X;

/* renamed from: X.C5D */
public final class C5D implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C4n A01;

    public C5D(C4n c4n, int i) {
        this.A01 = c4n;
        this.A00 = i;
    }

    public final void run() {
        this.A01.A03.setVisibility(this.A00);
        if (this.A00 != 0) {
            this.A01.A06.setVisibility(8);
        }
    }
}
