package p000X;

/* renamed from: X.AVZ */
public final class AVZ implements Runnable {
    public final /* synthetic */ AVN A00;

    public AVZ(AVN avn) {
        this.A00 = avn;
    }

    public final void run() {
        C23640AVp aVp = this.A00.A00.A03;
        if (aVp != null) {
            boolean z = true;
            aVp.A02 = true;
            if (aVp.A01) {
                AWN.A00(aVp.A00);
            } else {
                z = false;
            }
            if (z) {
                this.A00.A00.A03 = null;
            }
        }
    }
}
