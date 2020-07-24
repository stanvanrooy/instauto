package p000X;

import com.facebook.C0003R;
import com.instagram.model.shopping.Product;

/* renamed from: X.CRR */
public final class CRR implements C27364CAj {
    public final /* synthetic */ CRL A00;

    public CRR(CRL crl) {
        this.A00 = crl;
    }

    public final void B3m(Product product, C27702CNw cNw, Throwable th, long j, long j2) {
        String str;
        Product product2 = product;
        C13150hy.A02(product, "product");
        C27702CNw cNw2 = cNw;
        C13150hy.A02(cNw, "item");
        C27797CRp cRp = this.A00.A03;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        cRp.A03(product2, cNw2, j, j2, false, str);
        this.A00.A02.remove(cNw.A02);
        CRL.A00(this.A00, new CRV(cNw));
        CRS crs = this.A00.A01;
        if (crs != null) {
            AnonymousClass5F9.A00(crs.A00.getContext(), C0003R.string.network_error);
        }
    }

    public final void BPb(Product product, C27702CNw cNw, C28691Ms r12, long j, long j2) {
        C13150hy.A02(product, "product");
        C13150hy.A02(cNw, "item");
        this.A00.A03.A03(product, cNw, j, j2, true, (String) null);
        this.A00.A02.remove(cNw.A02);
        CRL.A00(this.A00, new CRW(cNw));
    }
}
