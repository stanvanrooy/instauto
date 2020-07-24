package p000X;

import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductGroup;

/* renamed from: X.CN7 */
public final class CN7 implements C213689Jh {
    public final /* synthetic */ ProductGroup A00;
    public final /* synthetic */ CNB A01;
    public final /* synthetic */ C27702CNw A02;

    public CN7(CNB cnb, ProductGroup productGroup, C27702CNw cNw) {
        this.A01 = cnb;
        this.A00 = productGroup;
        this.A02 = cNw;
    }

    public final void BUe(Product product) {
        CP8 cp8 = this.A01.A03;
        cp8.A02.A00(product, this.A02);
    }
}
