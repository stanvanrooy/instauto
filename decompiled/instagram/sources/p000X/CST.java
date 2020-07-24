package p000X;

import com.facebook.C0003R;
import com.instagram.model.shopping.productfeed.ProductCollectionTile;

/* renamed from: X.CST */
public final class CST implements CTG {
    public final /* synthetic */ CSB A00;

    public CST(CSB csb) {
        this.A00 = csb;
    }

    public final void B3n(ProductCollectionTile productCollectionTile, C27702CNw cNw, Throwable th, long j, long j2) {
        String str;
        ProductCollectionTile productCollectionTile2 = productCollectionTile;
        C13150hy.A02(productCollectionTile, "collectionTile");
        C13150hy.A02(cNw, "item");
        CTH cth = this.A00.A03;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        cth.A08(productCollectionTile2, j, j2, false, str);
        this.A00.A02.remove(cNw.A02);
        CSB.A00(this.A00, new C27821CSn(cNw));
        CSC csc = this.A00.A01;
        if (csc != null) {
            AnonymousClass5F9.A00(csc.A00.requireContext(), C0003R.string.network_error);
        }
    }

    public final void BPd(ProductCollectionTile productCollectionTile, C27702CNw cNw, long j, long j2) {
        C13150hy.A02(productCollectionTile, "collectionTile");
        C13150hy.A02(cNw, "item");
        this.A00.A03.A08(productCollectionTile, j, j2, true, (String) null);
        this.A00.A02.remove(cNw.A02);
        CSB.A00(this.A00, new C27822CSo(cNw));
    }
}
