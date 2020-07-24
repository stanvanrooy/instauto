package p000X;

/* renamed from: X.DT3 */
public final class DT3 implements Runnable {
    public final /* synthetic */ C30152DSz A00;

    public DT3(C30152DSz dSz) {
        this.A00 = dSz;
    }

    public final void run() {
        C30152DSz dSz = this.A00;
        if (dSz.A01 == Constants.A0C) {
            dSz.A05.BA8(dSz.A00);
            this.A00.A01 = Constants.A0N;
        }
    }
}
