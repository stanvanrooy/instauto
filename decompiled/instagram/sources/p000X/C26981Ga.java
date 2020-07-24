package p000X;

/* renamed from: X.1Ga  reason: invalid class name and case insensitive filesystem */
public final class C26981Ga implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C15730nR A02;
    public final /* synthetic */ String A03;

    public C26981Ga(C15730nR r1, int i, String str, long j) {
        this.A02 = r1;
        this.A00 = i;
        this.A03 = str;
        this.A01 = j;
    }

    public final void run() {
        synchronized (this.A02.A04) {
            if (C15730nR.A02(this.A02, this.A00)) {
                this.A02.A03.markerPoint(23396353, this.A00, this.A03, this.A01);
            }
        }
    }
}
