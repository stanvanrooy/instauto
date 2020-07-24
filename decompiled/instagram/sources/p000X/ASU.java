package p000X;

/* renamed from: X.ASU */
public final class ASU {
    public final C23579ASa A00;
    public final C23581ASc A01;
    public final ASX A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public ASU() {
        this(new ASV());
    }

    public ASU(ASV asv) {
        C23581ASc aSc;
        this.A08 = asv.A08;
        this.A09 = asv.A09;
        this.A05 = asv.A05;
        this.A02 = asv.A02;
        this.A00 = asv.A00;
        C23581ASc aSc2 = asv.A01;
        if (aSc2 == null) {
            aSc = new C23581ASc(false, 0, 0);
        } else {
            aSc = new C23581ASc(aSc2.A02, aSc2.A00, aSc2.A01);
        }
        this.A01 = aSc;
        this.A03 = asv.A03;
        this.A04 = asv.A04;
        this.A06 = asv.A06;
        this.A07 = asv.A07;
    }
}
