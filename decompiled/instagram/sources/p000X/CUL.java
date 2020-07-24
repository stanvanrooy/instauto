package p000X;

import java.util.List;

/* renamed from: X.CUL */
public final class CUL extends AnonymousClass1PF {
    public C27863CUd A00;
    public C27866CUg A01;
    public CharSequence A02;
    public List A03;
    public final CUH A04;
    public final C167177Bx A05;
    public final CUM A06;

    public CUL(C53822Um r6, C27866CUg cUg) {
        CUM cum = new CUM();
        this.A06 = cum;
        CUH cuh = new CUH(r6);
        this.A04 = cuh;
        C167177Bx r2 = new C167177Bx();
        this.A05 = r2;
        A0I(cum, cuh, r2);
        this.A01 = cUg;
        A00(this);
    }

    public static void A00(CUL cul) {
        cul.A0E();
        if (cul.A03 != null) {
            C27863CUd cUd = cul.A00;
            if (cUd != null) {
                cul.A0G(cUd, cul.A06);
            }
            for (CUR A0C : cul.A03) {
                cul.A0C(A0C, cul.A01, cul.A04);
            }
            cul.A0G(cul.A02, cul.A05);
        }
        cul.notifyDataSetChanged();
    }
}
