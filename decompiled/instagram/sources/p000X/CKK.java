package p000X;

/* renamed from: X.CKK */
public final class CKK implements C253518l {
    public final /* synthetic */ AnonymousClass0C1 A00;
    public final /* synthetic */ CKS A01;

    public CKK(CKS cks, AnonymousClass0C1 r2) {
        this.A01 = cks;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C17710qg r5 = (C17710qg) obj;
        AnonymousClass1HQ r3 = this.A01.A02;
        CKX ckx = (CKX) r3.A02();
        if (ckx != null) {
            ckx.A0W = false;
        } else {
            ckx = null;
        }
        r3.A09(ckx);
        C13150hy.A01(r5, "response");
        if (r5.A05()) {
            Object A02 = r5.A02();
            C13150hy.A01(A02, "response.get()");
            if (((C27634CLb) A02).isOk()) {
                CKM ckm = this.A01.A00;
                if (ckm != null) {
                    ckm.BeA((AnonymousClass1HD) null);
                    return;
                }
                return;
            }
        }
        CKS.A00(this.A01);
    }
}
