package p000X;

/* renamed from: X.CXN */
public final class CXN extends C92 {
    public C25967BdM A00;
    public final CYV A01;
    public final C25971BdQ A02;

    public CXN(CXZ cxz) {
        super(cxz.A06, cxz.A09, new CY4(cxz.A03, cxz.A0F), 100);
        this.A02 = new C25977BdW(new C25976BdV(cxz.A04));
        C25982Bdb.A01.get(C25981Bda.A00(cxz.A04.A01));
        this.A00 = new CYG(new CYH(cxz.A03.A00));
        this.A01 = new CYV(cxz.A09);
    }

    public CXN(C27946CXi cXi, int i) {
        super(cXi.A03, cXi.A04, new CY4(cXi.A01, cXi.A06), i);
        this.A02 = new C25977BdW(new C25976BdV(cXi.A02));
        C25982Bdb.A01.get(C25981Bda.A00(cXi.A02.A01));
        this.A00 = new CYG(new CYH(cXi.A01.A00));
        this.A01 = new CYV(cXi.A04);
    }
}
