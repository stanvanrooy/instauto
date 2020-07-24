package p000X;

/* renamed from: X.CXR */
public final class CXR extends C92 {
    public CXE A00 = new CXE();
    public final CYV A01;

    public CXR(CXZ cxz) {
        super(cxz.A06, cxz.A09, new CY4(cxz.A03, cxz.A0F), 100);
        for (C27953CXp cxq : cxz.A0B) {
            this.A00.A00.add(new C27942CXe(new CXQ(cxq)));
        }
        this.A01 = new CYV(cxz.A09);
    }
}
