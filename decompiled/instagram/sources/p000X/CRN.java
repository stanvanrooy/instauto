package p000X;

import android.view.View;
import com.facebook.C0003R;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductGroup;
import java.util.List;

/* renamed from: X.CRN */
public final class CRN implements CS4 {
    public final /* synthetic */ CRM A00;

    public CRN(CRM crm) {
        this.A00 = crm;
    }

    public final void BFy(View view, ProductGroup productGroup, C27702CNw cNw) {
        this.A00.requireActivity().setResult(1002);
        CRL crl = this.A00.A03;
        ProductGroup productGroup2 = productGroup;
        C13150hy.A02(productGroup, "productGroup");
        C13150hy.A02(cNw, "item");
        if (!crl.A02.contains(cNw.A02)) {
            boolean z = !crl.A00.A03.contains(cNw.A02);
            List A002 = productGroup.A00();
            C13150hy.A01(A002, "productGroup.products");
            Product product = (Product) AnonymousClass10N.A08(A002);
            if (z) {
                crl.A03.A01(product, cNw);
                CRS crs = crl.A01;
                if (crs != null) {
                    CRM crm = crs.A00;
                    crm.A00.A04();
                    C17510qM.A00.A1K(crm.A01, crm.getContext(), crm.mFragmentManager, productGroup2, new C27786CRe(crm, cNw, productGroup), crm.getString(C0003R.string.choose_default), true);
                    return;
                }
                return;
            }
            C13150hy.A01(product, "firstProduct");
            crl.A01(product, cNw, (ProductGroup) null);
        }
    }
}
