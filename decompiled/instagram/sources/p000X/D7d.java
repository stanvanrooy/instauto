package p000X;

/* renamed from: X.D7d */
public final /* synthetic */ class D7d implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ D7F A01;
    public final /* synthetic */ byte[] A02;

    public /* synthetic */ D7d(D7F d7f, byte[] bArr, long j) {
        this.A01 = d7f;
        this.A02 = bArr;
        this.A00 = j;
    }

    public final void run() {
        D7F d7f = this.A01;
        d7f.A01.BCp(this.A02, this.A00);
    }
}
