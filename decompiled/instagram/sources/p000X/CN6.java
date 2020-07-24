package p000X;

import android.content.res.Resources;
import com.facebook.C0003R;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductGroup;

/* renamed from: X.CN6 */
public final class CN6 implements AnonymousClass9JW {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ ProductGroup A01;
    public final /* synthetic */ CNB A02;
    public final /* synthetic */ C27702CNw A03;

    public CN6(CNB cnb, ProductGroup productGroup, C27702CNw cNw, Resources resources) {
        this.A02 = cnb;
        this.A01 = productGroup;
        this.A03 = cNw;
        this.A00 = resources;
    }

    public final void B3w() {
        C51512Ky r3 = new C51512Ky();
        r3.A07 = Constants.A0C;
        r3.A09 = this.A00.getString(C0003R.string.product_tagging_network_error);
        C11130eT.A01.BXT(new C33441cv(r3.A00()));
    }

    public final void BUg(Product product) {
        CP8 cp8 = this.A02.A03;
        cp8.A02.A00(product, this.A03);
    }
}
