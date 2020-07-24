package p000X;

import com.facebook.C0003R;
import com.instagram.model.shopping.Product;

/* renamed from: X.CSR */
public final class CSR implements C27787CRf {
    public final /* synthetic */ CS8 A00;

    public CSR(CS8 cs8) {
        this.A00 = cs8;
    }

    public final void B3m(Product product, C27702CNw cNw, Throwable th, long j, long j2) {
        String str;
        Product product2 = product;
        C13150hy.A02(product, "product");
        C27702CNw cNw2 = cNw;
        C13150hy.A02(cNw, "item");
        CTH cth = this.A00.A03;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        cth.A04(product2, cNw2, j, j2, false, str);
        this.A00.A02.remove(cNw.A02);
        CS8.A00(this.A00, new C27825CSr(cNw));
        CS9 cs9 = this.A00.A01;
        if (cs9 != null) {
            AnonymousClass5F9.A00(cs9.A00.requireContext(), C0003R.string.network_error);
        }
    }

    public final void BPb(Product product, C27702CNw cNw, C28691Ms r12, long j, long j2) {
        C13150hy.A02(product, "product");
        C13150hy.A02(cNw, "item");
        this.A00.A03.A04(product, cNw, j, j2, true, (String) null);
        this.A00.A02.remove(cNw.A02);
        CS8.A00(this.A00, new C27826CSs(cNw));
    }
}
