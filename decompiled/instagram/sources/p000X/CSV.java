package p000X;

import com.facebook.C0003R;
import com.instagram.model.shopping.productfeed.ProductCollectionTile;

/* renamed from: X.CSV */
public final class CSV implements CTG {
    public final /* synthetic */ CSI A00;

    public CSV(CSI csi) {
        this.A00 = csi;
    }

    public final void B3n(ProductCollectionTile productCollectionTile, C27702CNw cNw, Throwable th, long j, long j2) {
        String str;
        ProductCollectionTile productCollectionTile2 = productCollectionTile;
        C13150hy.A02(productCollectionTile, "collectionTile");
        C13150hy.A02(cNw, "item");
        CTJ ctj = this.A00.A03;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        ctj.A08(productCollectionTile2, j, j2, false, str);
        this.A00.A02.remove(cNw.A02);
        CSI.A00(this.A00, new C27817CSj(cNw));
        CSD csd = this.A00.A01;
        if (csd != null) {
            AnonymousClass5F9.A00(csd.A00.getContext(), C0003R.string.network_error);
        }
    }

    public final void BPd(ProductCollectionTile productCollectionTile, C27702CNw cNw, long j, long j2) {
        C13150hy.A02(productCollectionTile, "collectionTile");
        C13150hy.A02(cNw, "item");
        this.A00.A03.A08(productCollectionTile, j, j2, true, (String) null);
        this.A00.A02.remove(cNw.A02);
        CSI.A00(this.A00, new C27818CSk(cNw));
    }
}
