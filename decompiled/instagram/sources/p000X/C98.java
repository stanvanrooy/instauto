package p000X;

/* renamed from: X.C98 */
public final class C98 {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final C27355CAa A09;

    public static void A00(C98 c98) {
        long j;
        long j2 = c98.A02;
        if (j2 != 0) {
            j = System.currentTimeMillis() - j2;
        } else {
            j = 0;
        }
        C27355CAa.A01(c98.A09, Constants.A0D, Constants.A0B, Constants.A0N, j, c98.A05, c98.A06, c98.A07, c98.A04);
        c98.A02 = 0;
    }

    public final void A01() {
        long j;
        long j2 = this.A01;
        if (j2 != 0) {
            j = System.currentTimeMillis() - j2;
        } else {
            j = 0;
        }
        C27355CAa.A01(this.A09, Constants.A0B, (Integer) null, Constants.ONE, j, this.A05, this.A06, this.A07, this.A04);
        this.A01 = 0;
    }

    public C98(C27355CAa cAa) {
        this.A09 = cAa;
    }
}
