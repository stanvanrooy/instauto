package p000X;

/* renamed from: X.CKJ */
public final class CKJ implements C253518l {
    public final /* synthetic */ CKS A00;

    public CKJ(CKS cks) {
        this.A00 = cks;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C17710qg r4 = (C17710qg) obj;
        C13150hy.A01(r4, "response");
        if (r4.A05()) {
            Object A02 = r4.A02();
            C13150hy.A01(A02, "response.get()");
            if (((AXR) A02).isOk()) {
                CKM ckm = this.A00.A00;
                if (ckm != null) {
                    Object A022 = r4.A02();
                    C13150hy.A01(A022, "response.get()");
                    ckm.BWe(((AXR) A022).A00);
                    return;
                }
                return;
            }
        }
        CKS.A00(this.A00);
    }
}
