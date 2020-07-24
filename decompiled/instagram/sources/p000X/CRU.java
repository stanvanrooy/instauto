package p000X;

/* renamed from: X.CRU */
public final class CRU implements AnonymousClass662 {
    public final /* synthetic */ CRM A00;

    public final void onSearchCleared(String str) {
    }

    public CRU(CRM crm) {
        this.A00 = crm;
    }

    public final void onSearchTextChanged(String str) {
        CRL crl = this.A00.A03;
        if (str == null) {
            str = "";
        }
        C13150hy.A02(str, "query");
        CRL.A00(crl, new C27783CRb(str));
        crl.A04.A04(str);
    }
}
