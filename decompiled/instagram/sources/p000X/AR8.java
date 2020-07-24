package p000X;

/* renamed from: X.AR8 */
public final class AR8 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AOA A01;

    public AR8(AOA aoa, long j) {
        this.A01 = aoa;
        this.A00 = j;
    }

    public final void run() {
        ARC arc = this.A01.A00;
        if (arc != null) {
            arc.B1l(this.A00);
        }
    }
}
