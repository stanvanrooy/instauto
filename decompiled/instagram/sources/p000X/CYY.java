package p000X;

/* renamed from: X.CYY */
public final class CYY implements Runnable {
    public final /* synthetic */ CYX A00;

    public CYY(CYX cyx) {
        this.A00 = cyx;
    }

    public final void run() {
        if (!this.A00.A00.isRunning()) {
            float translationY = this.A00.A01.getTranslationY();
            CYX cyx = this.A00;
            if (translationY == ((float) cyx.A04)) {
                cyx.A02 = Constants.ZERO;
                cyx.A00.start();
            }
        }
    }
}
