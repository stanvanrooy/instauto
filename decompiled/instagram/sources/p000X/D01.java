package p000X;

/* renamed from: X.D01 */
public final class D01 implements Runnable {
    public final /* synthetic */ C29563Czu A00;
    public final /* synthetic */ D07 A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public D01(C29563Czu czu, boolean z, D07 d07, boolean z2) {
        this.A00 = czu;
        this.A03 = z;
        this.A01 = d07;
        this.A02 = z2;
    }

    public final void run() {
        C29563Czu czu;
        if (this.A03) {
            D07 d07 = this.A01;
            czu = this.A00;
            try {
                d07.A02(czu);
            } catch (Throwable th) {
                czu.A05();
                throw th;
            }
        } else if (!this.A02) {
            D07 d072 = this.A01;
            czu = this.A00;
            boolean A06 = czu.A06();
            try {
                d072.A00(czu);
            } finally {
                if (A06) {
                    czu.A05();
                }
            }
        }
    }
}
