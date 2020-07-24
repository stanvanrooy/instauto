package p000X;

/* renamed from: X.DT2 */
public final class DT2 implements Runnable {
    public final /* synthetic */ C30152DSz A00;

    public DT2(C30152DSz dSz) {
        this.A00 = dSz;
    }

    public final void run() {
        C30152DSz dSz = this.A00;
        if (dSz.A01 == Constants.ONE) {
            dSz.A05.BAB(dSz.A04.APo());
            this.A00.A01 = Constants.A0C;
        }
    }
}
