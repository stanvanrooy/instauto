package p000X;

import com.instagram.model.shopping.productfeed.ProductCollectionTile;

/* renamed from: X.CT8 */
public final class CT8 implements CRB {
    public final /* synthetic */ CSA A00;

    public final boolean Aei(C27702CNw cNw) {
        return true;
    }

    public CT8(CSA csa) {
        this.A00 = csa;
    }

    public final void BFv(ProductCollectionTile productCollectionTile, C27702CNw cNw) {
        this.A00.requireActivity().setResult(1002);
        this.A00.A05.A01(productCollectionTile, cNw, false);
    }
}
