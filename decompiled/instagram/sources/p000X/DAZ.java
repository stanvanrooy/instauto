package p000X;

/* renamed from: X.DAZ */
public final class DAZ {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C29791DAa A04;
    public final boolean A05;
    public final boolean A06;

    public final DAZ A00() {
        return new DAZ(this.A04.A00(-1), this.A03, this.A02, this.A00, this.A01, this.A06, this.A05);
    }

    public DAZ(C29791DAa dAa, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.A04 = dAa;
        this.A03 = j;
        this.A02 = j2;
        this.A00 = j3;
        this.A01 = j4;
        this.A06 = z;
        this.A05 = z2;
    }
}
