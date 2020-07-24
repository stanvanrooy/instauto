package p000X;

import android.content.Context;
import com.instagram.model.shopping.Product;

/* renamed from: X.CRP */
public final class CRP {
    public final AnonymousClass0C1 A00;
    public final C27787CRf A01;
    public final Context A02;
    public final AnonymousClass1L8 A03;

    public CRP(C27787CRf cRf, AnonymousClass0C1 r2, Context context, AnonymousClass1L8 r4) {
        this.A01 = cRf;
        this.A00 = r2;
        this.A02 = context;
        this.A03 = r4;
    }

    public final void A00(Product product, C27702CNw cNw) {
        long currentTimeMillis = System.currentTimeMillis();
        String id = product.getId();
        C15890nh r2 = new C15890nh(this.A00);
        r2.A09 = Constants.ONE;
        r2.A0C = "commerce/shop_management/hide_product/";
        r2.A09("product_id", id);
        r2.A06(AnonymousClass1N4.class, false);
        C17850qu A032 = r2.A03();
        A032.A00 = new CRT(this, product, cNw, currentTimeMillis);
        C28351Lj.A00(this.A02, this.A03, A032);
    }
}
