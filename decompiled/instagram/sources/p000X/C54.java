package p000X;

/* renamed from: X.C54 */
public final class C54 implements Runnable {
    public final /* synthetic */ C4n A00;
    public final /* synthetic */ boolean A01;

    public C54(C4n c4n, boolean z) {
        this.A00 = c4n;
        this.A01 = z;
    }

    public final void run() {
        this.A00.A03.setEnabled(this.A01);
        if (this.A01 || this.A00.A03.getVisibility() != 0) {
            this.A00.A06.setVisibility(8);
            return;
        }
        C4n c4n = this.A00;
        if (!c4n.A0G) {
            c4n.A06.setVisibility(0);
        }
    }
}
