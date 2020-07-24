package p000X;

/* renamed from: X.ALA */
public final class ALA {
    public final AWZ A00;
    public final Runnable A01 = new ALJ(this);
    public final /* synthetic */ AL4 A02;

    public ALA(AL4 al4, AWZ awz) {
        this.A02 = al4;
        AnonymousClass0a4.A06(awz);
        this.A00 = awz;
    }

    public final void A00() {
        AL4.A01(this.A02);
        AL4.A00(this.A02);
        this.A02.A09.A02(Constants.ZERO);
        this.A00.A04(false);
    }

    public final void A01() {
        AL4.A01(this.A02);
        AL4.A00(this.A02);
        this.A02.A09.A02(Constants.ONE);
        this.A00.A04(false);
    }
}
