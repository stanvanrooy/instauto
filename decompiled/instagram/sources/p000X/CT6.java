package p000X;

import android.content.DialogInterface;
import com.instagram.model.shopping.productfeed.ProductCollectionTile;

/* renamed from: X.CT6 */
public final class CT6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ProductCollectionTile A00;
    public final /* synthetic */ CSA A01;
    public final /* synthetic */ C27702CNw A02;

    public CT6(CSA csa, ProductCollectionTile productCollectionTile, C27702CNw cNw) {
        this.A01 = csa;
        this.A00 = productCollectionTile;
        this.A02 = cNw;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A01.A05.A01(this.A00, this.A02, true);
    }
}
