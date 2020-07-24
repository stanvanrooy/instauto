package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CXP */
public final class CXP extends C92 {
    public CYV A00;
    public C25971BdQ A01;
    public C25967BdM A02;
    public String A03;
    public List A04 = new ArrayList();

    public CXP(CXZ cxz) {
        super(cxz.A06, cxz.A09, new C27949CXl(((C27954CXq) cxz.A0C.get(0)).A00, ((C27954CXq) cxz.A0C.get(0)).A05, ((C27954CXq) cxz.A0C.get(0)).A02), 100);
        C27954CXq cXq = (C27954CXq) cxz.A0C.get(0);
        this.A01 = new C25977BdW(new C25976BdV(cXq.A01));
        C25982Bdb.A01.get(C25981Bda.A00(cXq.A01.A01));
        this.A02 = new CYG(new CYH(cXq.A00.A00));
        this.A04.addAll(CYI.A02(cXq.A04));
        CYI.A00(cXq.A02);
        this.A00 = new CYV(cxz.A09);
        this.A03 = ((C27954CXq) cxz.A0C.get(0)).A03;
    }
}
