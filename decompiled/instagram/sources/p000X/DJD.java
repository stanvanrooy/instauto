package p000X;

/* renamed from: X.DJD */
public final class DJD implements C29972DJj {
    public final /* synthetic */ DJC A00;

    public final void Ase(int i) {
    }

    public DJD(DJC djc) {
        this.A00 = djc;
    }

    public final void Ay7(int i) {
        if (i != 0) {
            if (i == 2) {
                if (this.A00.A02.AeQ()) {
                    this.A00.A02.BrW(true);
                }
                DJ8.A00(this.A00.A00.A00);
            } else if (i != 3) {
                return;
            }
        }
        this.A00.A02.BrW(false);
        DJ8.A00(this.A00.A00.A00);
    }

    public final void BL2(int i, int i2) {
        if (i2 == 0 && (i == 2 || i == 1)) {
            this.A00.A02.BrW(false);
        }
        DJ8.A00(this.A00.A00.A00);
    }

    public final void BMU() {
        if (this.A00.A02.AeQ()) {
            this.A00.A02.BrW(true);
        }
        DJ8.A00(this.A00.A00.A00);
    }

    public final void BMW() {
        this.A00.A02.BrW(false);
        DJ8.A00(this.A00.A00.A00);
    }
}
