package p000X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductMention;

/* renamed from: X.CRK */
public final class CRK implements CS3 {
    public final /* synthetic */ CRM A00;

    public final void BFz(Product product, C27702CNw cNw) {
        Product product2 = product;
        if (product.A07 == AnonymousClass230.REJECTED) {
            C17510qM r1 = C17510qM.A00;
            FragmentActivity requireActivity = this.A00.requireActivity();
            CRM crm = this.A00;
            r1.A1O(requireActivity, crm, crm.A01, (AnonymousClass1NJ) null, (ProductMention) null, true, product2, (String) null, (DialogInterface.OnShowListener) null, (DialogInterface.OnDismissListener) null, (AnonymousClass34Y) null);
            return;
        }
        this.A00.requireActivity().setResult(1002);
        this.A00.A03.A01(product, cNw, (ProductGroup) null);
    }

    public CRK(CRM crm) {
        this.A00 = crm;
    }
}
