package p000X;

import com.instagram.model.shopping.productfeed.ProductCollectionTile;

/* renamed from: X.CQS */
public final class CQS implements CRB {
    public final /* synthetic */ CQE A00;

    public final boolean Aei(C27702CNw cNw) {
        C13150hy.A02(cNw, "item");
        return true;
    }

    public CQS(CQE cqe) {
        this.A00 = cqe;
    }

    public final void BFv(ProductCollectionTile productCollectionTile, C27702CNw cNw) {
        C13150hy.A02(productCollectionTile, "collectionTile");
        C13150hy.A02(cNw, "item");
        ((C27763CQh) this.A00.A00.A01.getValue()).A01(productCollectionTile, cNw);
    }
}
