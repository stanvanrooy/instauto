package p000X;

/* renamed from: X.1j5  reason: invalid class name and case insensitive filesystem */
public final class C37081j5 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C28441Lt A03;

    public C37081j5(C28441Lt r1, long j, int i, int i2) {
        this.A03 = r1;
        this.A02 = j;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void run() {
        AnonymousClass13M r8 = this.A03.A00;
        long j = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        synchronized (r8.A01) {
            C28751My r2 = r8.A00;
            if (r2 != null) {
                r2.A02 = j - r2.A05;
                r2.A01 = i;
                r2.A00 = i2;
                AnonymousClass13M.A00(r8);
            }
        }
    }
}
