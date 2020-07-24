package p000X;

/* renamed from: X.CYH */
public final class CYH {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;

    public CYH(CYN cyn) {
        this.A00 = cyn.A00;
        this.A02 = cyn.A02;
        this.A03 = cyn.A03;
        this.A04 = cyn.A04;
        this.A01 = CYI.A00(cyn.A05);
    }
}
