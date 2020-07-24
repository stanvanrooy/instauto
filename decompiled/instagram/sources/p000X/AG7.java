package p000X;

/* renamed from: X.AG7 */
public final class AG7 {
    public final long A00;
    public final C228259s1 A01;
    public final AGA A02;
    public final String A03;
    public final boolean A04;

    public AG7(AG7 ag7) {
        this.A03 = ag7.A03;
        this.A01 = ag7.A01.copy();
        this.A00 = ag7.A00;
        this.A04 = ag7.A04;
        AGA aga = ag7.A02;
        if (aga != null) {
            this.A02 = aga.copy();
        } else {
            this.A02 = null;
        }
    }

    public AG7(String str, C228259s1 r2, long j, boolean z, AGA aga) {
        this.A03 = str;
        this.A01 = r2;
        this.A00 = j;
        this.A04 = z;
        this.A02 = aga;
    }
}
