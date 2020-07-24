package p000X;

/* renamed from: X.DRJ */
public final class DRJ extends DRH {
    public final int A00;
    public final C30125DRh A01;
    public final boolean A02 = true;

    public DRJ(C27861Jm r2, int i, C30125DRh dRh) {
        super(r2);
        this.A00 = i;
        this.A01 = dRh;
    }

    public final void A01(DR5 dr5) {
        this.A00.A00(new DQX(dr5, this.A00, this.A02, this.A01));
    }
}
