package p000X;

import com.instagram.model.shopping.productfeed.ProductCollectionTile;

/* renamed from: X.CQT */
public final class CQT implements CRB {
    public final /* synthetic */ CQF A00;

    public final boolean Aei(C27702CNw cNw) {
        C13150hy.A02(cNw, "item");
        return true;
    }

    public CQT(CQF cqf) {
        this.A00 = cqf;
    }

    public final void BFv(ProductCollectionTile productCollectionTile, C27702CNw cNw) {
        C13150hy.A02(productCollectionTile, "tile");
        C13150hy.A02(cNw, "item");
        C27763CQh cQh = this.A00.A06;
        if (cQh == null) {
            C13150hy.A03("collectionStateManager");
        }
        cQh.A01(productCollectionTile, cNw);
    }
}
