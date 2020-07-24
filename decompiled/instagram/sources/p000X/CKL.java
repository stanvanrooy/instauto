package p000X;

/* renamed from: X.CKL */
public final class CKL implements C253518l {
    public final /* synthetic */ CKS A00;

    public CKL(CKS cks) {
        this.A00 = cks;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C17710qg r3 = (C17710qg) obj;
        C13150hy.A01(r3, "response");
        if (r3.A05()) {
            Object A02 = r3.A02();
            C13150hy.A01(A02, "response.get()");
            if (((CKN) A02).isOk()) {
                return;
            }
        }
        CKS.A00(this.A00);
    }
}
